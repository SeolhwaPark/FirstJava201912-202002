package diaryServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import diaryModel.DiaryDAO;
import diaryModel.DiaryVO;

@WebServlet("/diary_delete")
public class DiaryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DiaryDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		DiaryDAO dao = DiaryDAO.getInstance();
		List<DiaryVO> list = dao.diaryList(idx);
		int row = dao.diaryDelete(idx);
		
		request.setAttribute("idx", idx);
		request.setAttribute("row", row);
		request.setAttribute("list", list);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		
		RequestDispatcher dis = request.getRequestDispatcher("diary/diaryDelete.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
