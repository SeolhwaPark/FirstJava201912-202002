package galleryServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import galleryModel.EveryDAO;
import galleryModel.EveryVO;

@WebServlet("/every_delete")
public class everyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public everyDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		EveryDAO dao = EveryDAO.getInstance();
		List<EveryVO> list = new ArrayList<EveryVO>();
		int row = dao.everyDelete(idx);
		request.setAttribute("idx", idx);
		request.setAttribute("row", row);
		request.setAttribute("list", list);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		
		RequestDispatcher dis = request.getRequestDispatcher("gallery/every_delete.jsp");
		dis.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
