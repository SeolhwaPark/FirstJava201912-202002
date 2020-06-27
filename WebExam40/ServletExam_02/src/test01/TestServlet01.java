package test01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//휴게소...ㅋ. 다른 페이지에 넘기기 위해서 처리하는 곳(물류센터) 

@WebServlet("/testServlet")
public class TestServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public TestServlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String repasswd = request.getParameter("repasswd");
		String email = request.getParameter("email");
		String post = request.getParameter("post");
		String addr = request.getParameter("addr");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String susin = request.getParameter("susin");
		String[] coffee = request.getParameterValues("coffee");
		
	 request.setAttribute("name",name);
	 request.setAttribute("number", number);
	 request.setAttribute("id", id);
	 request.setAttribute("passwd", passwd);
	 request.setAttribute("repasswd", repasswd);
	 request.setAttribute("email", email);
	 request.setAttribute("post", post);
	 request.setAttribute("addr", addr);
	 request.setAttribute("phone", phone);
	 request.setAttribute("job", job);
	 request.setAttribute("susin", susin);
	 String cof = coffee[0];
		for(int x=1; x<coffee.length; x++) {
			cof = cof + "," + coffee[x];
		}
		request.setAttribute("cof", cof);
	 
	 RequestDispatcher dis = request.getRequestDispatcher("test01_01.jsp");//도착지 주소
	 dis.forward(request, response);
	 
	}

}
