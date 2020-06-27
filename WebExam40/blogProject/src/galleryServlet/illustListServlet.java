package galleryServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import galleryModel.IllustDAO;
import galleryModel.IllustVO;
import pageUtil.PageIndex;

@WebServlet("/illust_list")
public class illustListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public illustListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IllustDAO dao = IllustDAO.getInstance();
		String s_query = "";
		String addtag = "";
		String query = "";
		String key = "";

		int totcount = dao.illustCount(s_query);
		int nowpage = 1;
		int maxlist = 3;
		int totpage = 1;

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

		List<IllustVO> list = null;
		list = dao.illustList();
		if (key.equals("")) {
			list = dao.illustList(pagestart, endpage);
		} else
			list = dao.illustList(s_query, pagestart, endpage);

		String pageSkip = PageIndex.pageList(nowpage, totpage, "illust_list", addtag);

		request.setAttribute("list", list);
		request.setAttribute("totcount", totcount);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", s_query);
		request.setAttribute("key", key);

		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_list.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
