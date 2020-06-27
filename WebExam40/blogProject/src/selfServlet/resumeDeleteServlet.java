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

@WebServlet("/resume_delete")
public class resumeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resumeDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		ResumeDAO dao = ResumeDAO.getInstance();
		List<ResumeVO> list = dao.resumeList(idx);
		ResumeVO vo = new ResumeVO();
		int row = dao.resumeDelete(idx);
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("self/resume_delete.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
