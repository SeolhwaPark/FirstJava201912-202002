package servlet.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.board.boardDAO;
import model.board.boardVO;
import util.PageIndex;

@WebServlet("/board_list")
public class boardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public boardListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boardDAO dao = new boardDAO();
		String s_query = "",addtag = "", query="", key="";
		int totcount = 0;
		if(request.getParameter("key")!=null) {
			key = request.getParameter("key");
			query = request.getParameter("search");
			s_query = query+" like '%"+key + "%'";
			addtag = "&search="+query+"&key="+key;
			totcount = dao.boardCount(s_query);
			
		}else totcount = dao.boardCount();
		
		int nowpage = 1;
		int maxlist=10;
		int totpage = 1;
		totpage = (totcount/maxlist);
		if(totcount%maxlist>0) totpage++;
		
		if(request.getParameter("page")!=null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		
		int pagestart = (nowpage-1)*maxlist;
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		List<boardVO> list = null;
		if(key.equals("")) list = dao.boardList(pagestart,endpage);
		else list = dao.boardList(pagestart, endpage);
		String pageSkip = PageIndex.pageList(nowpage, totpage, "board_list", addtag);
		
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", query);
		request.setAttribute("key", key);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_list.jsp");
		dispater.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

