package studyServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pageUtil.SqlMark;
import studyModel.UiDAO;
import studyModel.UiVO;
@WebServlet("/ui_view")
public class uiViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public uiViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;// 페이지 받는애
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page")); // 페이지수를 클릭하면 그 페이지에 해당하는 페이지에 들어감
		}

		UiDAO dao = UiDAO.getInstance();

		// 쿠키 검사
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();// 클라이언트에 있는 객체를 이용해서 쿠키가 존재하는지 아닌지..
		for (int x = 0; x < cookies.length; x++) {
			info = cookies[x];
			if (info.getName().equals("study" + idx)) {
				bool = true;
				break;
			}
		}

		String newValue = "" + System.currentTimeMillis();// 1000분의 1초..

		if (!bool) { // 쿠키가 존재하지 않으면
			dao.countUp(idx); // 조회수 증가
			info = new Cookie("study" + idx, newValue);// 글을 읽을 때 마다...
			info.setMaxAge(60 * 60);// 세션을 유지하는 시간,,, 60분은 한시간... 하루는 24*60*60..
			response.addCookie(info);
		}

		UiVO vo = dao.uiSelect(idx);
		String contents = SqlMark.lineBreak(vo.getContents());
		vo.setContents(contents);

		request.setAttribute("vo", vo);
		request.setAttribute("dao", dao);
		request.setAttribute("page", page);
		RequestDispatcher dis = request.getRequestDispatcher("study/ui_view.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
