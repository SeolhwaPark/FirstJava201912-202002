<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = null;
	if(request.getParameter("name") != null){
		name = request.getParameter("name"); //자주 씀
	}
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String gubun = request.getParameter("gubun");
	
	//String tel = Integer.parseInt(request.getParameter("tel"));//정수변환
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");
	//out.print(tel + email);
	
	String[] fa = request.getParameterValues("fa"); // 체크박스는 여러개 넘어오니까
	//구분할 수 있는 토큰..
	String str = null;
	if(fa != null){ //데이터가 넘어왓을 때
		str = fa[0];//체크한 것을 순서대로 집어넣는거
		for(int x = 1; x<fa.length ;x++ ){
			str = str + ","+fa[x]; //넣은걸 컴마를 기준으로 해서 데이터를 나눔		
		}
	}
	String job = request.getParameter("job");
	String intro = request.getParameter("intro");

	out.print(str + "<br>");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "userinfo_modify.jsp">정보수집</a>
</body>
</html>