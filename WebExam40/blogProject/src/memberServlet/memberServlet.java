package memberServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import memberModel.MemberDAO;
import memberModel.MemberVO;
import sun.misc.BASE64Encoder;

@WebServlet("/member")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public memberServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		RequestDispatcher dispater = request.getRequestDispatcher("member/member.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		MemberDAO dao = MemberDAO.getInstance();
		MemberVO vo = new MemberVO();

		vo.setId(request.getParameter("id"));
		
		String pass1 = request.getParameter("pass1");
		SHA256 s = new SHA256(pass1.getBytes());//암호화 구현
		BASE64Encoder base64Encoder = new BASE64Encoder();
		vo.setPass1(base64Encoder.encode(s.GetHashCode()));
		
		vo.setName(request.getParameter("name"));
		vo.setEmail1(request.getParameter("email1"));
		vo.setEmail2(request.getParameter("email2"));
		
		int row = dao.memberJoin(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);
		response.sendRedirect("index.jsp");
	}

}
