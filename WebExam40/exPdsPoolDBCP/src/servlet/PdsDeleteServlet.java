package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;

@WebServlet("/pds_delete")
public class PdsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PdsDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");

		PdsDAO dao = PdsDAO.getInstance();
		int row = dao.pdsDelete(idx, pass);

		request.setAttribute("row", row);
		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_delete_pro.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
