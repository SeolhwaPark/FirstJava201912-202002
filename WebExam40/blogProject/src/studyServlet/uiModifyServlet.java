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

import studyModel.UiDAO;
import studyModel.UiVO;

@WebServlet("/ui_modify")
public class uiModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public uiModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		UiDAO dao = UiDAO.getInstance();
		List<UiVO> list = dao.uiList(idx);
		UiVO vo = new UiVO();
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		session.setAttribute("fotoname", list.get(0).getFotoname());
		
		RequestDispatcher dis = request.getRequestDispatcher("study/ui_modify.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		UiDAO dao = UiDAO.getInstance();
		UiVO vo = new UiVO();

		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); // 서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());

		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String fotoname = multi.getFilesystemName("fotoname");

		HttpSession session = request.getSession();
		int idx = (int) session.getAttribute("idx");
		vo.setIdx(idx);
		session.removeAttribute("idx");

		vo.setName(name);
		vo.setSubject(subject);
		vo.setContents(contents);

		String motofotoname = (String) session.getAttribute("fotoname");
		if (fotoname == null) {
			vo.setFotoname(motofotoname);
		} else
			vo.setFotoname(fotoname);

		int row = dao.uiModify(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		RequestDispatcher dispater = request.getRequestDispatcher("study/ui_modify_pro.jsp");
		dispater.forward(request, response);	}

}
