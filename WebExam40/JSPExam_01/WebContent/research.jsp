<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문 조사 결과</title>
<style type = "text/css">
b{
	font-size:16pt;
}
</style>

</head>
<body>
<h2> 설문 조사 결과 </h2>
<%
request.setCharacterEncoding("utf-8");

/* Enumeration enums = request.getParameterNames();
while(enums.hasMoreElements()){
	String name = (String)enums.nextElement();
	out.print(name + ":");
	String value = request.getParameter(name);
	out.print(value + "<br>");
}
 */

String name= request.getParameter("name");
out.println ("이름 :<b>"+name + "</b><br>");

String gender= request.getParameter("gender");
out.println("성별 :");
if(gender.equals("male")){
out.println ("<b>남자</b><br>");
	
}else{
out.println ("<b>여자</b><br>");
	
}

String seasons[]= request.getParameterValues("season");
out.println("당신이 좋아하는 계절은");
for(String season : seasons){
	int n = Integer.parseInt(season);
	switch(n){
	case 1: out.println("<b>봄</b>입니다.");
		break;
	case 2: out.println("<b>여름</b>입니다.");
		break;
	case 3: out.println("<b>가을</b>입니다.");
		break;
	case 4: out.println("<b>겨울</b>입니다.");
		break;
	}
}
%>
	<br>
	<b><a href='javascript:history.go(-1)'>다시 </a></b>
	<!--  history.back == -1 하나 전단계로 가기, +1 하나 다음단계 -->

</body>
</html>