package guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestWrite
 */
@WebServlet("/write.do")
public class GuestWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestWrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("Guest/guest_write.jsp");
		RequestDispatcher dispater =
				request.getRequestDispatcher("Guest/guest_write.jsp");
		dispater.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		request.setAttribute("name",name);
		request.setAttribute("subject",subject);
		request.setAttribute("contents",contents);
		
		//DB저장
		request.setAttribute("row", 1); //로우에 1이 들어갔을때 , 데이터가 등록되었을때..
		response.sendRedirect("guest.do?idx=10");
		RequestDispatcher dispater =
				request.getRequestDispatcher("Guest/guest_write_pro.jsp"); //알림창 띄우려고 만듬
		dispater.forward(request, response);
	
	}

}
