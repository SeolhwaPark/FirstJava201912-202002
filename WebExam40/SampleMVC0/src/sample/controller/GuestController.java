package sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;


@WebServlet("/Guest")
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GuestController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//브라우져 요청받기
		String command = request.getParameter("command");
		System.out.println("받은 요청 : "+ command);
		//액션 팩토리 객체 생성
		GuestActionFactory af = GuestActionFactory.getInstance();
		Action action = af.getAction(command);
		if(action != null) {
			action.execute(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}