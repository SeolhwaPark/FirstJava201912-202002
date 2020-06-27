package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardDeleteProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = new BoardVO();
		
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		vo.setPass(request.getParameter("pass"));
		
		int idx=Integer.parseInt(request.getParameter("idx"));
		String pass =request.getParameter("pass");
		
		int row = dao.boardDelete(idx, pass);
		request.setAttribute("row", row);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_delete_pro.jsp");
		dispater.forward(request, response);
	}

}
