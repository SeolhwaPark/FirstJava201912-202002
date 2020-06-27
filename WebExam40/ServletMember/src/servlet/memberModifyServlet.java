package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;

@WebServlet("/userinfo_modify")
public class memberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public memberModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("user");
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.memberSelect(user);
		request.setAttribute("vo", vo);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Member/userinfo_modify.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	

}
