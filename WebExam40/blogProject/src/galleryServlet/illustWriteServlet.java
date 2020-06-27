package galleryServlet;

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

import galleryModel.IllustDAO;
import galleryModel.IllustVO;

@WebServlet("/illust_write")
public class illustWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public illustWriteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_write.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		IllustDAO dao = IllustDAO.getInstance();
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload");
		String encType = "UTF-8";
		int maxSize = 2*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		
		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String fotoname = multi.getFilesystemName("fotoname");
		
		IllustVO vo = new IllustVO();
		vo.setName(name);
		vo.setSubject(subject);
		vo.setContents(contents);
		vo.setFotoname(fotoname);
		
		int row = dao.illustWrite(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		
		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_write_pro.jsp");
		dis.forward(request, response);
	}

}
