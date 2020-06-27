package studyServlet;

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

import studyModel.StudyDAO;
import studyModel.StudyVO;

@WebServlet("/study_delete")
public class studyMainDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studyMainDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		StudyDAO dao = StudyDAO.getInstance();
		List<StudyVO> list = new ArrayList<StudyVO>();
		int row = dao.studyDelete(idx);
		request.setAttribute("idx", idx);
		request.setAttribute("row", row);
		request.setAttribute("list", list);
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		RequestDispatcher dis = request.getRequestDispatcher("study/study_delete.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
