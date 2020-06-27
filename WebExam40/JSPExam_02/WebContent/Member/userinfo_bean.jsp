<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model2.*"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="userinfo_insert" class="model2.userinfoBean">
	<jsp:setProperty name="userinfo_insert" property="*" />
</jsp:useBean>

<%
String[] fa = request.getParameterValues("fa");
String str = null;
if(fa != null){ 
	str = fa[0];
	for(int x = 1; x<fa.length ;x++ ){
		str = str + ","+fa[x];		
	}
}
%>

이름:
<%= userinfo_insert.getName() %><br>
아이디:
<%= userinfo_insert.getUserid() %><br>
비밀번호:
<%= userinfo_insert.getPasswd() %><br>
주소구분:
<%= userinfo_insert.getGubun() %><br>
전화번호:
<%= userinfo_insert.getTel() %><br>
이메일:
<%= userinfo_insert.getEmail() %><br>
관심분야:
<%= str %><br>
직업:
<%= userinfo_insert.getJob() %><br>
자기소개:
<%= userinfo_insert.getIntro() %><br>
