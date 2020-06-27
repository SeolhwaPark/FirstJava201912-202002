package sample.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		int row = dao.boardCount();
		List<BoardVO> list = dao.boardList();
		request.setAttribute("row",row);
		request.setAttribute("list",list);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Board/board_list.jsp");
		dispatcher.forward(request, response);

	}

}
