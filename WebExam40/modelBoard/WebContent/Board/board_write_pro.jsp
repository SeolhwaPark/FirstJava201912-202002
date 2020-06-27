<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="model.*"%>

<%
	request.setCharacterEncoding("utf-8");
	BoardVO vo = new BoardVO();
	
	String name = request.getParameter("name");
	String email= request.getParameter("email");
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	String pass = request.getParameter("pass");
	
	vo.setName(name);
	vo.setEmail(email);
	vo.setSubject(subject);
	vo.setContents(contents);
	vo.setPass(pass);
	
	BoardDAO dao = BoardDAO.getInstance();
	int row = dao.Insert(vo);
	response.sendRedirect("board_list.jsp");
%>