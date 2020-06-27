package sample.action.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.action.Action;
import sample.model.guest.GuestDAO;
import sample.model.guest.GuestVO;

public class GuestModifyProAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GuestDAO dao = GuestDAO.getInstance();
		GuestVO vo = new GuestVO();

		vo.setName(request.getParameter("name"));
		vo.setSubject(request.getParameter("subject"));
		vo.setContents(request.getParameter("contents"));
		vo.setIdx(Integer.parseInt(request.getParameter("idx")));

		int row = dao.guestUpdate(vo);
		request.setAttribute("row", row);
		response.sendRedirect("Guest?command=guest_list");


	}

}
