<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 로그인 후 메인화면에 보여질거임 -->

<%
request.setCharacterEncoding("UTF-8");
String userid = request.getParameter("userid");
String passwd = request.getParameter("passwd");

if(userid != null && userid.equals("userid")){
	session.setAttribute("userid", userid);
	response.sendRedirect("login_form.jsp");
	
	if(passwd.equals("passwd")){
		session.setAttribute("passwd", passwd);
		response.sendRedirect("login_form.jsp");
	}else{
%>
<script type="text/javascript">
	alert("비밀번호를 확인해주세요.")
	location.href = "login_form.jsp"
</script>
<% 
		}
	}else{
%>
<script type="text/javascript">
alert("아이디를 확인해주세요.")
location.href = "login_form.jsp"
</script>
<%
}
%>
