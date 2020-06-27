package selfServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import selfModel.ResumeDAO;
import selfModel.ResumeVO;

@WebServlet("/resume_list")
public class resumeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resumeListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResumeDAO dao = ResumeDAO.getInstance();
		List<ResumeVO> list = dao.resumeList();
		request.setAttribute("list", list);
		RequestDispatcher dis = request.getRequestDispatcher("self/resume_list.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
