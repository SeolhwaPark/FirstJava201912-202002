package galleryServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import galleryModel.EveryDAO;
import galleryModel.EveryVO;
import galleryModel.GalleryDAO;
import galleryModel.GalleryVO;
import galleryModel.IllustDAO;
import galleryModel.IllustVO;

@WebServlet("/gallery_main")
public class galleryMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public galleryMainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EveryDAO dao = EveryDAO.getInstance();
		List<EveryVO> list = dao.everyList();
		
		IllustDAO dao2 = IllustDAO.getInstance();
		List<IllustVO> list2 = dao2.illustList();
		
		GalleryDAO dao3 = GalleryDAO.getInstance();
		List<GalleryVO> list3 = dao3.galleryList();
		
		request.setAttribute("list", list);	
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		
		RequestDispatcher dis = 
				request.getRequestDispatcher("gallery/gallery_main.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
