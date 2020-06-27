package include;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.member.*;


@WebServlet("/login_form")
public class includeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public includeLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
					request.getRequestDispatcher("include/login_form.jsp");
			dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid"); //받아오기
		String passwd = request.getParameter("passwd"); //받아오기
		memberDAO dao = new memberDAO();//메소드가 들어있ㄷ는 객체 가져오기
		
		
		int row = dao.memberLogin(userid,passwd);
		if(row==1) {
			memberVO vo = dao.memberSelect(userid);
			HttpSession session = request.getSession();
			session.setAttribute("vo", vo);
			System.out.println(vo.getName());
			System.out.println(vo.getUserid());
		}
		request.setAttribute("row", row);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
