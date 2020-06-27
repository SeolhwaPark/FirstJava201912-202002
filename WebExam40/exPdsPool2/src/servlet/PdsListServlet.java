package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PdsDAO;
import model.PdsVO;
import util.DBConn;

@WebServlet("/pds_list")
public class PdsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PdsListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 호출하깅
		PdsDAO dao = PdsDAO.getInstance();
		Connection conn = null;
		try {
			conn=DBConn.getConnection();
			List<PdsVO> list = dao.pdsList(conn);
			int totcount = dao.pdsCount(conn);
			// 받아오깅
			request.setAttribute("totcount", totcount);
			request.setAttribute("list", list);
			
			RequestDispatcher dispater = request.getRequestDispatcher("Pds/pds_list.jsp");
			dispater.forward(request, response);
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
