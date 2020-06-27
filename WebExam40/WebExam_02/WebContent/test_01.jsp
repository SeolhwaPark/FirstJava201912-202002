<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int bun = 10;
    String name = "홍길동";
    String nn = "성인";
    if(bun < 20){
    	nn = "미성년자";
    }
    out.print("번호:" + bun + "<br>");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
번호 : <%= bun %><br>
이름 : <%= name %><br>
비고 : <%= nn %><br>
</body>
</html>