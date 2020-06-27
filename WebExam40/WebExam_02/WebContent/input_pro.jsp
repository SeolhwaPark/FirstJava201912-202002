<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    String bun = request.getParameter("hakbun");
    String name = request.getParameter("irum");
    String p1 = request.getParameter("phone1");
    String p2 = request.getParameter("phone2");
    String p3 = request.getParameter("phone3");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
학번 : <%= bun%><br>
이름 : <%= name%><br>
전화 : <%= p1%>-<%= p3%>-<%= p3%><br>

</body>
</html>