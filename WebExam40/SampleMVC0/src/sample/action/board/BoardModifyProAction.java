package sample.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.board.BoardDAO;
import sample.model.board.BoardVO;

public class BoardModifyProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = new BoardVO();
		
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setPass(request.getParameter("pass"));
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		
		int row = dao.boardUpdate(vo);
		request.setAttribute("row", row);
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_modify_pro.jsp");
		dispater.forward(request, response);
		
	}

}
