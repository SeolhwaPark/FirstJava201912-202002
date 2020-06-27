package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.VO;

@WebServlet("/insert")
public class scoreInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public scoreInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date d=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String date1 = sdf.format(d);
        request.setAttribute("date1", date1);
		RequestDispatcher dispater = 
				request.getRequestDispatcher("studentSample/scoreInsert.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		VO vo = new VO();
		DAO dao = new DAO();
		vo.setBun(Integer.parseInt(request.getParameter("bun")));
		vo.setName(request.getParameter("name"));
		vo.setGender(request.getParameter("gender"));
		vo.setKor(Integer.parseInt(request.getParameter("kor")));
		vo.setEng(Integer.parseInt(request.getParameter("eng")));
		vo.setMat(Integer.parseInt(request.getParameter("mat")));
		int flag = dao.StudentInsert(vo);
		request.getRequestDispatcher("view").forward(request, response);
		
	}

}
