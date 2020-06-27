package select;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		request.setAttribute("job", job);
		String inter = interests[0];
		for(int x=1; x<interests.length; x++) {
			inter = inter + "," + interests[x];
		}
		request.setAttribute("inter", inter);
		
		RequestDispatcher dispater = request.getRequestDispatcher("select_pro.jsp");
		dispater.forward(request, response);
		
		
		/*
		 * response.setContentType("text/html;charset=utf-8"); PrintWriter out =
		 * response.getWriter(); out.print("<html><body>");
		 * out.println("당신이 선택한 직업 : <br>"); out.print(job);
		 * 
		 * out.println("</b><hr>당신이 선택한 관심 분야 : <b>"); if(interests == null) {
		 * out.print("선택한 항목이 없습니다."); }else { for(String interest : interests) {
		 * out.print(interest + ""); } }
		 * out.println("</b><br><a href = 'javascript:history.go(-1)'>다시</a>");
		 * out.print("<html><body>"); out.close();
		 */	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
