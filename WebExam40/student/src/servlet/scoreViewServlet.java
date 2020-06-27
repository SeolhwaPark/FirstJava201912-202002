package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.VO;


@WebServlet("/view")
public class scoreViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public scoreViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		List<VO> list = dao.StudentView();
		request.setAttribute("list", list);
		RequestDispatcher dispater = request.getRequestDispatcher("studentSample/scoreView.jsp");
		dispater.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
