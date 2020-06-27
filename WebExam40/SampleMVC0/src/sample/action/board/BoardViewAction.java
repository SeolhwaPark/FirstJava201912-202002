package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO board = dao.boardSelect(idx);
		request.setAttribute("board", board);
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_view.jsp");
		dispater.forward(request, response);
		
	}

}
