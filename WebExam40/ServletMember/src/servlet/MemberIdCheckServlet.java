package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

@WebServlet("/id_check")
public class MemberIdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MemberIdCheckServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Member/id_check.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid"); //받아오기
		MemberDAO dao = new MemberDAO();//메소드가 들어있ㄷ는 객체 가져오기
		int row = dao.memberIdCheck(userid);
		request.setAttribute("row", row);
		request.setAttribute("userid", userid);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Member/id_check.jsp");
		dispatcher.forward(request, response);
	}

}
