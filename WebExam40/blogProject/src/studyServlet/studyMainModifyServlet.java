package studyServlet;

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

import studyModel.StudyDAO;
import studyModel.StudyVO;


@WebServlet("/study_modify")
public class studyMainModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studyMainModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		StudyDAO dao = StudyDAO.getInstance();
		List<StudyVO> list = dao.studyList(idx);
		StudyVO vo = new StudyVO();
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);

		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		session.setAttribute("fotoname", list.get(0).getFotoname());
		
		RequestDispatcher dis = request.getRequestDispatcher("study/study_modify.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		StudyDAO dao = StudyDAO.getInstance();
		StudyVO vo = new StudyVO();

		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		
		String fotoname = multi.getFilesystemName("fotoname");
		
		HttpSession session = request.getSession();
		int idx = (int)session.getAttribute("idx");
		vo.setIdx(idx);
		session.removeAttribute("idx");
		
		String motofotoname = (String)session.getAttribute(fotoname);
		if(fotoname == null) {
			vo.setFotoname(motofotoname);
		}else vo.setFotoname(fotoname);
		
		int row = dao.studyModify(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		RequestDispatcher dis = request.getRequestDispatcher("gallery/gallery_modify_pro.jsp");
		dis.forward(request, response);
	}

}
