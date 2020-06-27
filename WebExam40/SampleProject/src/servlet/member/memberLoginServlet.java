package servlet.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.member.Zipcode;
import model.member.memberDAO;
import model.member.memberVO;

@WebServlet("/userinfo_login")
public class memberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public memberLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Member/userlogin_form.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid"); //받아오기
		String passwd = request.getParameter("passwd"); //받아오기
		
		memberDAO dao = new memberDAO();//메소드가 들어있ㄷ는 객체 가져오기
		int row = dao.memberLogin(userid,passwd);
		
		request.setAttribute("row", row);
		request.setAttribute("userid", userid);
		request.setAttribute("passwd", passwd);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Member/userlogin_ok.jsp");
		dispatcher.forward(request, response);
	}

}
