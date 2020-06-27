package studyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import studyModel.UiDAO;
import studyModel.UiVO;

@WebServlet("/ui_delete")
public class uiDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public uiDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		UiDAO dao = UiDAO.getInstance();
		List<UiVO> list = dao.uiList(idx);
		int row = dao.uiDelete(idx);
		
		request.setAttribute("idx", idx);
		request.setAttribute("row", row);
		request.setAttribute("list", list);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		
		RequestDispatcher dis = request.getRequestDispatcher("study/ui_delete.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
