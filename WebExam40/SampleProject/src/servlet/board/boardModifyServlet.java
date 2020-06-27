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


@WebServlet("/board_modify")
public class boardModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public boardModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = 1;
		int idx = Integer.parseInt(request.getParameter("idx"));
		if(request.getParameter("page")!=null)
			page = Integer.parseInt(request.getParameter("page"));
		
		boardDAO dao = new boardDAO();
		boardVO vo = dao.boardSelect(idx);
		
		request.setAttribute("vo",vo);
		request.setAttribute("page",page);
		
		 RequestDispatcher dispater =
		 request.getRequestDispatcher("Board/board_modify.jsp");
		 dispater.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int page = 1;
		if(request.getParameter("page")!=null)
			page = Integer.parseInt(request.getParameter("page"));
		
		boardDAO dao = new boardDAO();
		boardVO vo = new boardVO();
		
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));
		vo.setEmail(request.getParameter("email"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setPass(request.getParameter("pass"));
		
		int row = dao.boardModify(vo);
		request.setAttribute("row",row);
		request.setAttribute("page",page);
		
		 RequestDispatcher dispater =
				 request.getRequestDispatcher("Board/board_modify_pro.jsp");
				 dispater.forward(request, response);
	}
}
