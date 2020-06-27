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

import model.DAO;
import model.VO;

@WebServlet("/insert")
public class productInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public productInsertServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispater = request.getRequestDispatcher("product/insert.jsp");
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
		
		String code = multi.getParameter("code");
		String pname = multi.getParameter("pname");
		int cost = Integer.parseInt(multi.getParameter("cost"));
		int pnum = Integer.parseInt(multi.getParameter("pnum"));
		int jnum = Integer.parseInt(multi.getParameter("jnum"));
		int sale = Integer.parseInt(multi.getParameter("sale"));
		String gcode = multi.getParameter("gcode");
		
		VO vo = new VO();
		vo.setCode(code);
		vo.setPname(pname);
		vo.setCost(cost);
		vo.setPnum(pnum);
		vo.setJnum(jnum);
		vo.setSale(sale);
		vo.setGcode(gcode);
		
		DAO dao = DAO.getInstance();
		int row = dao.productInsert(vo);
		request.setAttribute("row", row);
		response.sendRedirect("insert");

	}

}
