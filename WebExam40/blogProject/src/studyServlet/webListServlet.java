package studyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pageUtil.PageIndex;
import studyModel.WebDAO;
import studyModel.WebVO;

@WebServlet("/web_list")
public class webListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public webListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebDAO dao = WebDAO.getInstance();
		String s_query = "", addtag = "", query = "", key = ""; // 넘어온 데이터 처리, 검색조건으 ㅣ변수

		int totcount = dao.webCount(s_query); // 총 게시글수

		// 페이지계산 기본방법
		int nowpage = 1;// 현재페이지
		int maxlist = 10; // 페이지당 글 수
		int totpage = 1;// 총 페이지수

		if (totcount % maxlist == 0) {
			totpage = totcount / maxlist; // 총 페이지수
		} else {
			totpage = totcount / maxlist + 1; // 총 페이지수
		}

		if (request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page")); // 페이지수를 클릭하면 그 페이지에 해당하는 페이지에 들어감
		}

		int pagestart = (nowpage - 1) * maxlist;
		int endpage = nowpage * maxlist;
		int listcount = totcount - ((nowpage - 1) * maxlist);
		
		List<WebVO> list = null;
		list = dao.webList();
		if(key.equals("")) {
			list = dao.webList(pagestart, endpage);
		} else
			list = dao.webList(s_query, pagestart, endpage);
		
		String pageSkip = PageIndex.pageList(nowpage, totpage, "web_list", addtag);

		request.setAttribute("list", list);
		request.setAttribute("totcount", totcount);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", s_query);
		request.setAttribute("key", key);
		
		RequestDispatcher dis = request.getRequestDispatcher("study/web_list.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
