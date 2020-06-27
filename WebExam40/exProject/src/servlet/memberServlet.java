package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memberModel.MemberDAO;
import memberModel.MemberVO;

@WebServlet("/member")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispater = request.getRequestDispatcher("member/member.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = MemberDAO.getInstance();
		MemberVO vo = new MemberVO();
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String scrtNoConfirm = request.getParameter("name");
		int mbrClCd = Integer.parseInt(request.getParameter("name"));
		int posCdData=Integer.parseInt(request.getParameter("name"));
		int posCd=Integer.parseInt(request.getParameter("name"));
		String posName = request.getParameter("name");
		int telNo1;
		int telNo2;
		int telNo3;
		int phoneNo1;
		int phoneNo2;
		int phoneNo3;
		String email;
		int zipNo;
		String addr;
		String detladdr;
		
		
		
		
		
		doGet(request, response);
	}

}
