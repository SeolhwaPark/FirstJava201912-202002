<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	public int sum(int a){
		int total = 0;
		for(int x = 1; x <= a; x++){
			total += x;
		}
		return total;
	}
	%>
	
	<h1> 임의 값을 1부터 더하기</h1>
	
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	for(int x=1; x<num; x++){
		out.print(x + "+");
	}
	out.print(num + "=" + sum(num));
	%>
</body>
</html>