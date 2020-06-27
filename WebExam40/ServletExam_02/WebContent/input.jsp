<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@
   page import = "java.util.*,java.text.*"
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name = "frm" method = "post">
		<table border= "1" width = "500">
			<tr>
				<td>이름</td>
			
				<td><input type = "text" name= "name"></td>
			</tr>
			<tr>
				<td>비번</td>
				<td><input type = "passwd" name= "pass"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><textarea name= "content" row= "3" cols = "30"></textarea></td>
			</tr>
			
			
			
		</table>
	</form>
</body>
</html>