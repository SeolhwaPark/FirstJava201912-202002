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

import galleryModel.EveryDAO;
import galleryModel.EveryVO;
import pageUtil.SqlMark;
import replyModel.ReDAO;
import replyModel.ReVO;

@WebServlet("/reply_modify")
public class replyModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public replyModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		EveryDAO dao = EveryDAO.getInstance();
		
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for(int x=0; x<cookies.length; x++) {
			info = cookies[x];
			if(info.getName().equals("gallery"+idx)) {
				bool = true;
				break;
			}
		}
		
		String newValue = "" + System.currentTimeMillis();
		if(!bool) {
			dao.countUp(idx);
			info = new Cookie("gallery"+ idx, newValue);
			info.setMaxAge(60*60);
			response.addCookie(info);
		}
		
		EveryVO vo = dao.everySelect(idx);
		String contents = SqlMark.lineBreak(vo.getContents());
		vo.setContents(contents);
		
		ReDAO daodao = ReDAO.getInstance();
		int parent = idx;
		List<ReVO> list = daodao.replyList(parent);
		
		request.setAttribute("vo", vo);
		request.setAttribute("list", list);
		request.setAttribute("dao", dao);
		request.setAttribute("daodao", daodao);
		request.setAttribute("page", page);
		
		RequestDispatcher dis = request.getRequestDispatcher("gallery/reply_modify.jsp");
		dis.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ReDAO dao = ReDAO.getInstance();
				
		String id = request.getParameter("id");
		int parent = Integer.parseInt(request.getParameter("parent"));
		String reply = request.getParameter("reply");

		ReVO vo = new ReVO();
		vo.setId(id);
		vo.setParent(parent);
		vo.setReply(reply);
		
		int row = dao.replyModify(vo);
		request.setAttribute("vo", vo);
		request.setAttribute("row", row);

		RequestDispatcher dis = request.getRequestDispatcher("gallery/reply_modify_pro.jsp");
		dis.forward(request, response);
		
	}

}
