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
import board.util.PageIndex;

@WebServlet("/board_list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BoardListServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//BoardDAO dao = BoardDAO.getInstance();
		BoardDAO dao = new BoardDAO();
		String s_query = "", addtag = "", query ="", key=""; //넘어온 데이터 처리, 검색조건으 ㅣ변수
		
		int totcount =0; //총 게시글수
		
		//post방식 (검색일 경우) 넘어올 떄
	
		if(request.getParameter("key")!=null) {
			key = request.getParameter("key");
			query = request.getParameter("search");
			s_query = query + " like '%" + key +"%'";
			addtag = "&search = " + query + "&key=" + key;
			//board_list?page=1&search = 'aaa'&key = '111';
			totcount = dao.boardCount(s_query);
		
		}else {
			totcount = dao.boardCount();
			
		}
		
		//페이지계산 기본방법
		int nowpage = 1;//현재페이지
		int maxlist = 10; //페이지당 글 수 
		int totpage = 1;// 총 페이지수
		
		if(totcount%maxlist==0) {
			totpage = totcount /maxlist; //총 페이지수
		}else {
			totpage = totcount /maxlist+1; //총 페이지수
		}
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page")); //페이지수를 클릭하면 그 페이지에 해당하는 페이지에 들어감
		}
		
		int pagestart = (nowpage-1)*maxlist;
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		List<BoardVO> list = null;
			if(key.equals("")) {//검색조건이 없을떄
				list = dao.boardList(pagestart,endpage);
				
			}else {
				list = dao.boardList(s_query,pagestart,endpage);
				
			}
		
		String pageSkip = PageIndex.pageList(nowpage, totpage, "board_list", addtag);
		
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list); //게시판출력
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);
		request.setAttribute("totpage", totpage);
		request.setAttribute("pageSkip", pageSkip);
		request.setAttribute("search", s_query);
		request.setAttribute("key", key);
		
		RequestDispatcher dispater = request.getRequestDispatcher("Board/board_list.jsp");
		dispater.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
		
	}

}
