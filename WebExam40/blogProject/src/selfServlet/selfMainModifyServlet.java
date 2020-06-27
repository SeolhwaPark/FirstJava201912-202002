package selfServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import selfModel.ResumeDAO;
import selfModel.ResumeVO;

@WebServlet("/self_main_modify")
public class selfMainModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public selfMainModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		ResumeDAO dao = ResumeDAO.getInstance();
		List<ResumeVO> list = dao.resumeList(idx);
		ResumeVO vo = new ResumeVO();
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		session.setAttribute("fotoname", list.get(0).getFotoname());
		RequestDispatcher dis = request.getRequestDispatcher("self/self_main_modify.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ResumeDAO dao = ResumeDAO.getInstance();
		ResumeVO vo = new ResumeVO();
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); // 서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		
		String school = multi.getParameter("school");
		String school2 = multi.getParameter("school2");
		String school3 = multi.getParameter("school3");
		String school4 = multi.getParameter("school4");
		String job = multi.getParameter("job");
		String job2 = multi.getParameter("job2");
		String job3 = multi.getParameter("job3");
		String job4 = multi.getParameter("job4");
		String job5 = multi.getParameter("job5");
		String job6 = multi.getParameter("job6");
		String job7 = multi.getParameter("job7");
		String job8 = multi.getParameter("job8");	
		String fotoname = multi.getFilesystemName("fotoname");
		
		
		HttpSession session = request.getSession();
		int idx = (int) session.getAttribute("idx");
		vo.setIdx(idx);
		session.removeAttribute("idx");
		
		vo.setSchool(school);
		vo.setSchool2(school2);
		vo.setSchool3(school3);
		vo.setSchool4(school4);
		vo.setJob(job);
		vo.setJob2(job2);
		vo.setJob3(job3);
		vo.setJob4(job4);
		vo.setJob5(job5);
		vo.setJob6(job6);
		vo.setJob7(job7);
		vo.setJob8(job8);
		
		String motofotoname = (String) session.getAttribute("fotoname");
		if (fotoname == null) {
			vo.setFotoname(motofotoname);
		} else
			vo.setFotoname(fotoname);
		
		int row = dao.resumeModify(vo);

		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		RequestDispatcher dispater = request.getRequestDispatcher("self/self_main_modify_pro.jsp");
		dispater.forward(request, response);
	}

}
