package selfServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import selfModel.SelfDAO;
import selfModel.SelfVO;

@WebServlet("/self_list")
public class selfListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public selfListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SelfDAO dao = SelfDAO.getInstance();
		List<SelfVO> list = dao.selfList();
		request.setAttribute("list", list);
		RequestDispatcher dis = request.getRequestDispatcher("self/self_list.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
