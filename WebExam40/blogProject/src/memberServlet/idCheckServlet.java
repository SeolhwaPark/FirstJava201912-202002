package memberServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memberModel.MemberDAO;

@WebServlet("/id_check")
public class idCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public idCheckServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/id_check.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDAO dao = MemberDAO.getInstance();
		String id = request.getParameter("id");
		int row = dao.memberIdCheck(id);

		request.setAttribute("row", row);
		request.setAttribute("id", id);

		RequestDispatcher dispatcher = request.getRequestDispatcher("member/id_check.jsp");
		dispatcher.forward(request, response);
	}

}
