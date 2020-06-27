package servlet.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.member.Zipcode;
import model.member.memberDAO;
import model.member.memberVO;

@WebServlet("/userinfo_list")
public class memberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memberListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		memberDAO dao = new memberDAO();
		List<memberVO> list = dao.memberList();
		request.setAttribute("list", list);
		RequestDispatcher dispater = request.getRequestDispatcher("Member/userinfo_list.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
