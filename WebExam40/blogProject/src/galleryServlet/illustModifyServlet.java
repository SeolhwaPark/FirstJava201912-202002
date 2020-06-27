package galleryServlet;

import java.io.IOException;
import java.util.ArrayList;
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

import galleryModel.IllustDAO;
import galleryModel.IllustVO;

@WebServlet("/illust_modify")
public class illustModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public illustModifyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		IllustDAO dao = IllustDAO.getInstance();
		List<IllustVO> list = dao.illustList(idx);
		IllustVO vo = new IllustVO();
		request.setAttribute("idx", idx);
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		session.setAttribute("fotoname", list.get(0).getFotoname());

		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_modify.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		IllustDAO dao = IllustDAO.getInstance();
		IllustVO vo = new IllustVO();
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		String encType = "UTF-8";
		int maxSize = 2*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		
		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String fotoname = multi.getFilesystemName("fotoname");
		
		HttpSession session = request.getSession();
		int idx = (int)session.getAttribute("idx");
		vo.setIdx(idx);
		session.removeAttribute("idx");
		vo.setName(name);
		vo.setSubject(subject);
		vo.setContents(contents);
		
		String motofotoname = (String)session.getAttribute(fotoname);
		if(fotoname == null) {
			vo.setFotoname(motofotoname);
		}else vo.setFotoname(fotoname);
		
		int row = dao.illustModify(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_modify_pro.jsp");
		dis.forward(request, response);
	}

}
