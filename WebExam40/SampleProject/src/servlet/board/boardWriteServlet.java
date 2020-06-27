package servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.board.boardDAO;
import model.board.boardVO;


@WebServlet("/board_write")
public class boardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int page =1;
		if(request.getParameter("page")!=null)page=Integer.parseInt(request.getParameter("page"));
		request.setAttribute("page", page);
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_write.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		boardVO vo = new boardVO();
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setPass(request.getParameter("pass"));

		boardDAO dao = new boardDAO();
		int row = dao.boardWrite(vo);
		//response.sendRedirect("board_list");

		int page = 1;
		if(request.getParameter("page")!=null)
			page = Integer.parseInt(request.getParameter("page"));		 
		
		 request.setAttribute("row", row);
		 request.setAttribute("page", page);
		 RequestDispatcher dispater =
		 request.getRequestDispatcher("Board/board_write_pro.jsp");
		 dispater.forward(request, response);//포워드시키기
		 
	}

}

