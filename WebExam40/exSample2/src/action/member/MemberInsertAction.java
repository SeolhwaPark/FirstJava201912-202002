package action.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import KISA.SHA256;
import action.Action;
import model.member.MemberDAO;
import model.member.MemberVO;
import sun.misc.BASE64Encoder;

public class MemberInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispater = request.getRequestDispatcher("member/member.jsp");
		dispater.forward(request, response);
		
		MemberDAO dao = MemberDAO.getInstance();
		MemberVO vo = new MemberVO(); 
		
		String id = request.getParameter("id");
		//중복확인해야함
		
		String pass1 = request.getParameter("pass1");
		SHA256 s = new SHA256(pass1.getBytes());//암호화 구현
		BASE64Encoder base64Encoder = new BASE64Encoder();
		vo.setPass1(base64Encoder.encode(s.GetHashCode()));
		String pass2 = request.getParameter("pass2");
		String name = request.getParameter("name");
		String email1 =request.getParameter("email1");
		//인증받아야함
		String email2 =request.getParameter("email2");
		
		int row = dao.memberJoin(vo);
		request.setAttribute("row", row);
		response.sendRedirect("member?command=member");

	}

}
