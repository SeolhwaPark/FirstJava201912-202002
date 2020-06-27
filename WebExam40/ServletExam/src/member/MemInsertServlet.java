package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class MemInsertServlet
 */
@WebServlet("/MemInsertServlet")
public class MemInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispater =
				request.getRequestDispatcher("Member/userinfo_insert.jsp");
		dispater.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String repasswd = request.getParameter("repasswd");
		String gubun = request.getParameter("gubun");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String[] fa = request.getParameterValues("fa");
		String fav = "";
		if(fa!=null)
			for(int x = 0; x<fa.length; x++) {
				fav += fa[x];
				if(x != fa.length-1) fav +=",";
			}			
		String job ="";
		if(request.getParameter("job")!=null) {
			job = request.getParameter("job");
		}
		String intro = request.getParameter("intro");

		request.setAttribute("name",name);
		request.setAttribute("userid",userid);
		request.setAttribute("passwd",passwd);
		request.setAttribute("repasswd",repasswd);
		request.setAttribute("gubun",gubun);
		request.setAttribute("tel",tel);
		request.setAttribute("email",email);		
		request.setAttribute("fa",fa);
		request.setAttribute("fav",fav);
		request.setAttribute("job",job);
		request.setAttribute("intro",intro);
		
		//DB저장
//		request.setAttribute("row", 1); //로우에 1이 들어갔을때 , 데이터가 등록되었을때..
//		response.sendRedirect("guest.do?idx=10");
		RequestDispatcher dispater =
				request.getRequestDispatcher("Member/userinfo_modify.jsp"); //알림창 띄우려고 만듬
		dispater.forward(request, response);
	
	}

}
