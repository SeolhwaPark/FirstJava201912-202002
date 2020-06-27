<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String userid = request.getParameter("userid");
    String passwd = request.getParameter("passwd");
    String repasswd = request.getParameter("repasswd");
    String gubun = request.getParameter("gubun");
    String zip = request.getParameter("zip");
    String addr1 = request.getParameter("addr1");
    String addr2 = request.getParameter("addr2");
    String tel = request.getParameter("tel");
    String email = request.getParameter("email");
    String fa[] = request.getParameterValues("fa");
    String favor = "";
    for(int i=0; i<fa.length; i++){
    	favor+=fa[i];
    	if(i == fa.length-1);
    	else favor += ",";
    }
    String job = request.getParameter("job");
    String intro = request.getParameter("intro");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

이름 : <%= name%><br>
아이디 : <%= userid%><br>
비밀번호 : <%= passwd%><br>
비밀번호확인 : <%= repasswd%><br>
주소구분 : <%= gubun%><br>
우편번호 : <%= zip%><br>
주소 : <%= addr1%><br>
나머지주소 : <%= addr2%><br>
전화번호 : <%= tel%><br>
이메일 : <%= email%><br>
관심분야 : <%= fa%><br>
직업 : <%= job%><br>
자기소개 : <%= intro%><br>

</body>
</html>