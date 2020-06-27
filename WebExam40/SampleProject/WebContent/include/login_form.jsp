<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*,model.member.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<title>Login</title>

<script type="text/javascript">
function check_submit() {
	if(login_form.userid.value==""){
		
		alert("아이디 입력");
		login_form.userid.focus();
		return false;
	}
	if(login_form.passwd.value==""){
	
		alert("비번 입력");
		login_form.passwd.focus();
		return false;
	}
	return true;
}
</script>
</head>

<body>
	<table width="100%" height="120" border="0">
	<c:if test="${empty vo }">
		<form name="login_form" action="login_form" method="post">
			<tr>
				<td colspan="2" bgcolor="#6FA0E" height="20" align="center"><font
					size="2" color="white"><b>Member Login</b></font></td>
			</tr>
			<tr>
				<td><font size="2">아 이 디</font></td>
				<td><input type="text" size="10" name="userid"
					onSubmit="return check_submit()"></td>
			</tr>
			<tr>
				<td><font size="2">비밀번호</font></td>
				<td><input type="password" size="10" name="passwd"></td>
			</tr>
			<tr>
				<td><input type="image" src="Member/img/login1.gif" border="0"
					onClick="return check_submit()"></td>
				<td><a href=""><img src="Member/img/regist.gif" border="0"></a>
				</td>
			</tr>
		</form>
		</c:if>
	</table>

	<c:if test="${!empty vo }">
	<table width="100%" height="120" border="0">
		<tr>
			<td bgcolor="#6FA0E" align="center" height="20"><font size="2"
				color="white">${vo.name} 님!</font></td>
		</tr>
		
	</table>
	
	
	<table width="100%"  border="0">
		<tr>
			<td align="center"><font size="2"> 
				<a href="logout">로그오프</a><br>
				<a href="modify">회원정보수정</a> 
				<a href="userinfo_del">회원탈퇴</a>
			</font></td>
		</tr>
		
	</table>
	</c:if>
	
	
</body>
</html>
