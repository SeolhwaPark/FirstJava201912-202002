package selfServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import selfModel.ResumeDAO;
import selfModel.ResumeVO;


@WebServlet("/resume_insert")
public class resumeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resumeInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("self/resume_insert.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		ResumeDAO dao = ResumeDAO.getInstance();
//
//		ServletContext context = getServletContext();
//		String path = context.getRealPath("upload"); // 서버상의 경로
//		String encType = "UTF-8";
//		int maxSize = 2 * 1024 * 1024;
//
//		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
//
//		String school = multi.getParameter("school");
//		String intern = multi.getParameter("intern");
//		String job = multi.getParameter("job");
//		String skill = multi.getParameter("skill");
//		String languages = multi.getParameter("languages");
//		String fotoname = multi.getFilesystemName("fotoname");
//		
//		ResumeVO vo = new ResumeVO();
//		vo.setSchool(school);
//		vo.setIntern(intern);
//		vo.setJob(job);
//		vo.setSkill(skill);
//		vo.setLanguages(languages);
//		vo.setFotoname(fotoname);
//		
//		int row = dao.resumeInsert(vo);
//		request.setAttribute("vo", vo);
//		request.setAttribute("row", row);
//		
//		RequestDispatcher dis = request.getRequestDispatcher("self_main");
//		dis.forward(request, response);
	}

}
