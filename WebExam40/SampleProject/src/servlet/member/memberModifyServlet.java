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

@WebServlet("/modify")
public class memberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public memberModifyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		memberDAO dao = new memberDAO();
		memberVO vo = (memberVO) session.getAttribute("vo");
		request.setAttribute("vo", vo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Member/userinfo_modify.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		memberDAO dao = new memberDAO();
		memberVO vo = (memberVO) session.getAttribute("vo");
		String user = vo.getUserid();
		vo.setUserid(request.getParameter("userid"));
		vo.setUserid(request.getParameter("name"));
		vo.setUserid(request.getParameter("passwd"));
		vo.setUserid(request.getParameter("tel"));
		vo.setUserid(request.getParameter("email"));
		int row = dao.memberModify(vo);
		response.sendRedirect("index.jsp");
	}
}
