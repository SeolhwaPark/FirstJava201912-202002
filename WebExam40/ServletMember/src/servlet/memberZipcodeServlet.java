package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.Zipcode;

@WebServlet("/post_check")
public class memberZipcodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memberZipcodeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
		request.getRequestDispatcher("Member/post_check.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Zipcode zip = new Zipcode();
		MemberDAO dao = new MemberDAO();
		zip.setZipcode(request.getParameter("zipcode"));
		zip.setSido(request.getParameter("sido"));
		zip.setGugun(request.getParameter("gugun"));
		zip.setDong(request.getParameter("dong"));
		zip.setBunji(request.getParameter("bunji"));
		response.sendRedirect("userinfo_list");
	}

}
