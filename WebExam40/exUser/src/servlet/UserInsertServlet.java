package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import model.UserDAO;
import model.UserVO;
import sun.misc.BASE64Encoder;


@WebServlet("/user_insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UserInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher dispater = request.getRequestDispatcher("User/user_insert.jsp");
		dispater.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		vo.setName(request.getParameter("name"));
		
		String passwd = request.getParameter("passwd");
		//암호화 구현
		SHA256 s = new SHA256(passwd.getBytes());
		BASE64Encoder base64Encoder = new BASE64Encoder();
		
		vo.setPasswd(base64Encoder.encode(s.GetHashCode()));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		vo.setFirst_time(request.getParameter("first_time"));
		vo.setLast_time(request.getParameter("last_time"));
		boolean flag = dao.UserInsert(vo);
		response.sendRedirect("user_list");
		
		
		//doGet(request, response);
	}

}
