package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;
import model.PdsVO;

@WebServlet("/pds_list")
public class PdsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PdsListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 호출하깅
		PdsDAO dao = PdsDAO.getInstance();
		List<PdsVO> list = dao.pdsList();
		int totcount = 0;
		
		// 받아오깅
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list);
		// 포워드하깅
		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_list.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
