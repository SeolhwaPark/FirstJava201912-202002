package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardVO;

@WebServlet("/board_list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BoardListServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//BoardDAO dao = BoardDAO.getInstance();
		BoardDAO dao = new BoardDAO();
		int cnt = dao.boardCount();
		
		List<BoardVO> list = dao.boardList();
		
		request.setAttribute("total", cnt);
		request.setAttribute("list", list);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_list.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
