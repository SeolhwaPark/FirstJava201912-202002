package diaryServlet;

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

import diaryModel.DiaryDAO;
import diaryModel.DiaryVO;

@WebServlet("/diary_write")
public class DiaryWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DiaryWriteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dis = request.getRequestDispatcher("diary/diaryWrite.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		DiaryDAO dao = DiaryDAO.getInstance();

		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); // 서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());

		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String fotoname = multi.getFilesystemName("fotoname");

		DiaryVO vo = new DiaryVO();
		vo.setName(name);
		vo.setSubject(subject);
		vo.setContents(contents);
		vo.setFotoname(fotoname);

		int row = dao.diaryWrite(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		
		//response.sendRedirect("diary/diaryList.jsp");
		RequestDispatcher dis = request.getRequestDispatcher("diary_list");
		dis.forward(request, response);
	}

}
