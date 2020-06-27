package servlet;

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

import model.PdsDAO;
import model.PdsVO;


@WebServlet("/pds_write")
public class PdsWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PdsWriteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_write.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); //서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(
				request,path,maxSize,encType,new DefaultFileRenamePolicy());
		
		//String name = request.getParameter("name");
		String name = multi.getParameter("name"); //일반적인 텍스트 받는법
		String pass = multi.getParameter("pass"); //일반적인 텍스트 받는법
		String email = multi.getParameter("email"); //일반적인 텍스트 받는법
		String subject = multi.getParameter("subject"); //일반적인 텍스트 받는법
		String contents = multi.getParameter("contents"); //일반적인 텍스트 받는법
		String filename = multi.getFilesystemName("filename"); //파일의 이름만 DB에 저장하는 방법
		
		PdsVO vo = new PdsVO();
		vo.setName(name);
		vo.setPass(pass);
		vo.setEmail(email);
		vo.setSubject(subject);
		vo.setContents(contents);
		vo.setFilename(filename);
		
		PdsDAO dao = PdsDAO.getInstance();
		int row = dao.pdsWrite(vo);
		request.setAttribute("row", row);
		response.sendRedirect("pds_list");
		
	}

}
