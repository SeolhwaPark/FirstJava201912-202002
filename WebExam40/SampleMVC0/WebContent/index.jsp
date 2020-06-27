<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "sample.model.guest.*"%>
<%
	GuestDAO dao = GuestDAO.getInstance();
	int row = dao.guestCount();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SampleMVC Project Test</title>
</head>
<body>
<h3>SampleMVC Project</h3>
자료건수 : <%= row %><br>
<a href="Board?command=board_list">게시판</a><br>
<a href="Guest?command=guest_list">방명록</a>
</body>
</html>