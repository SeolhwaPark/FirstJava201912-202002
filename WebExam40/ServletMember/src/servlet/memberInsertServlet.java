package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.*;
import KISA.SHA256;
import model.MemberDAO;
import model.MemberVO;
import sun.misc.BASE64Encoder;

@WebServlet("/userinfo_insert")

public class memberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public memberInsertServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher =
		 request.getRequestDispatcher("Member/userinfo_insert.jsp");
		 dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		vo.setName(request.getParameter("name"));
		vo.setUserid(request.getParameter("userid"));
		
		String passwd = request.getParameter("passwd");
		SHA256 s = new SHA256(passwd.getBytes());//암호화 구현
		BASE64Encoder base64Encoder = new BASE64Encoder();
		vo.setPasswd(base64Encoder.encode(s.GetHashCode()));
		
		vo.setGubun(request.getParameter("gubun"));
		vo.setZipcode(request.getParameter("zipcode"));
		vo.setAddr1(request.getParameter("addr1"));
		vo.setAddr2(request.getParameter("addr2"));
		vo.setTel(request.getParameter("tel"));
		vo.setEmail(request.getParameter("email"));
		String[] fa = request.getParameterValues("fa");
		String favor = "";
		if(fa!=null) {
			for(int x = 0; x<fa.length;x++) {
				favor += fa[x];
				if(fa.length-1 != x) favor += ",";
			}
		};
		vo.setFavorite(favor);
		vo.setJob(request.getParameter("job"));
		vo.setIntro(request.getParameter("intro"));
		boolean flag = dao.memberInsert(vo);
		response.sendRedirect("userinfo_list");

	}
}
