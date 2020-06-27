package servlet.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.member.Zipcode;
import model.member.memberDAO;
import model.member.memberVO;
@WebServlet("/logout")
public class memberLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public memberLogoutServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // 세션이 존재한다면 활성화된 세션을 받음.
		session.invalidate();//세션을 종료헙니다
		RequestDispatcher dispatcher = request.getRequestDispatcher("Member/logout.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
