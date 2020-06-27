<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.*"%>

<%
	request.setCharacterEncoding("utf-8");
	GuestVO vo = new GuestVO();
	
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	
	//wo.setName(request.getParameter("name")); //타이핑 빨리 할 수 있는 방법
	vo.setName(name);
	vo.setSubject(subject);
	vo.setContents(contents);
	
	GuestDAO dao = GuestDAO.getInstance();
	//dao.guestWrite(name, subject, contents);
	int row = dao.guestWrite(vo);
	response.sendRedirect("guest_list.jsp");//경고창 없는 버젼
%>
<!-- 
<script>
	alert("등록되었습니다");
	location.href = "guest_list.jsp";
</script> -->