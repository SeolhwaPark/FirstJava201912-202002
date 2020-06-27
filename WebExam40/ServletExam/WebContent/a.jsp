<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int age= 100;
    	String nn = (String)request.getAttribute("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나이:${age}<br>
<%= age %><br>
이름:${name}<br>
이름:<%= nn%><br>
</body>
</html>