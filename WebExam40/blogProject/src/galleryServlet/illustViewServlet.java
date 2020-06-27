package galleryServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import galleryModel.IllustDAO;
import galleryModel.IllustVO;
import pageUtil.SqlMark;

@WebServlet("/illust_view")
public class illustViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public illustViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		IllustDAO dao = IllustDAO.getInstance();
		
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
		
		IllustVO vo = dao.illustSelect(idx);
		String contents = SqlMark.lineBreak(vo.getContents());
		vo.setContents(contents);
		
		request.setAttribute("vo", vo);
		request.setAttribute("dao", dao);
		request.setAttribute("page", page);
		RequestDispatcher dis = request.getRequestDispatcher("gallery/illust_view.jsp");
		dis.forward(request, response);	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
