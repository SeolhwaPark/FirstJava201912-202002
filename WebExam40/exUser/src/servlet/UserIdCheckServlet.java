package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserDAO;

@WebServlet("/id_check")
public class UserIdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public UserIdCheckServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("User/user_idcheck.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid = request.getParameter("userid"); //받아오기
		UserDAO dao = new UserDAO();//메소드가 들어있ㄷ는 객체 가져오기
		int row = dao.UserIdCheck(userid);
		request.setAttribute("row", row);
		request.setAttribute("userid", userid);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("User/user_idcheck.jsp");
		dispatcher.forward(request, response);
	}

}
