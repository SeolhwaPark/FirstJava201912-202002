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

import selfModel.SelfDAO;
import selfModel.SelfVO;

@WebServlet("/self_modify")
public class selfModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public selfModifyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		SelfDAO dao = SelfDAO.getInstance();
		List<SelfVO> list = dao.selfList(idx);
		SelfVO vo = new SelfVO();
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		session.setAttribute("fotoname", list.get(0).getFotoname());
		RequestDispatcher dis = request.getRequestDispatcher("self/self_modify.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		SelfDAO dao = SelfDAO.getInstance();
		SelfVO vo = new SelfVO();
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); // 서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		
		String ment = multi.getParameter("ment");
		String contents = multi.getParameter("contents");
		String contents2 = multi.getParameter("contents2");
		String contents3 = multi.getParameter("contents3");
		String contents4 = multi.getParameter("contents4");
		String contents5 = multi.getParameter("contents5");
		String fotoname = multi.getFilesystemName("fotoname");
	
		HttpSession session = request.getSession();
		int idx = (int) session.getAttribute("idx");
		vo.setIdx(idx);
		session.removeAttribute("idx");
		
		
		vo.setMent(ment);
		vo.setContents(contents);
		vo.setContents2(contents2);
		vo.setContents3(contents3);
		vo.setContents4(contents4);
		vo.setContents5(contents5);
		
		String motofotoname = (String) session.getAttribute("fotoname");
		if (fotoname == null) {
			vo.setFotoname(motofotoname);
		} else
			vo.setFotoname(fotoname);

		int row = dao.selfModify(vo);
		RequestDispatcher dis = request.getRequestDispatcher("self/self_modify_pro.jsp");
		dis.forward(request, response);

	}

}
