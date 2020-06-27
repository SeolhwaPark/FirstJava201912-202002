package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;
import model.PdsVO;

@WebServlet("/pds_delete")
public class PdsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PdsModifyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PdsDAO dao = PdsDAO.getInstance();
		int page = 1;
		int idx = Integer.parseInt(request.getParameter("idx"));
		if (request.getParameter("page") != null)
			page = Integer.parseInt(request.getParameter("page"));

		PdsVO vo = dao.pdsSelect(idx);

		request.setAttribute("vovo", vo);
		request.setAttribute("page", page);

		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_modify.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int page = 1;
		if (request.getParameter("page") != null)
			page = Integer.parseInt(request.getParameter("page"));

		PdsDAO dao = PdsDAO.getInstance();
		PdsVO vo = new PdsVO();

		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		vo.setEmail(request.getParameter("email"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setPass(request.getParameter("pass"));

		int row = dao.pdsModify(vo);
		request.setAttribute("row", row);
		request.setAttribute("page", page);

		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_modify_pro.jsp");
		dispater.forward(request, response);

	}

}
