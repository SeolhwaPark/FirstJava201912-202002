package studyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studyModel.StudyDAO;
import studyModel.StudyVO;
import studyModel.UiDAO;
import studyModel.UiVO;
import studyModel.WebDAO;
import studyModel.WebVO;

@WebServlet("/study_main")
public class studyMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studyMainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebDAO dao = WebDAO.getInstance();
		List<WebVO> list = dao.webList();
		
		UiDAO dao2 = UiDAO.getInstance();
		List<UiVO> list2 = dao2.uiList();
		
		StudyDAO dao3 = StudyDAO.getInstance();
		List<StudyVO> list3 = dao3.studyList();
		
		request.setAttribute("list", list);	
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		
		RequestDispatcher dis = 
				request.getRequestDispatcher("study/study_main.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
