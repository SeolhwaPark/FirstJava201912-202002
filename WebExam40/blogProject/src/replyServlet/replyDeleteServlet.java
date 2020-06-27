package replyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import galleryModel.EveryDAO;
import galleryModel.EveryVO;
import pageUtil.SqlMark;
import replyModel.ReDAO;
import replyModel.ReVO;

@WebServlet("/reply_delete")
public class replyDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public replyDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		EveryDAO dao = EveryDAO.getInstance();
		ReDAO daodao = ReDAO.getInstance();
		int parent = idx;
		int row = daodao.replyDelete(idx);
		request.setAttribute("dao", dao);
		request.setAttribute("daodao", daodao);
		request.setAttribute("row", row);
		
		HttpSession session = request.getSession();
		session.setAttribute("idx", idx);
		
		RequestDispatcher dis = request.getRequestDispatcher("gallery/reply_delete.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
