<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>


<script type = "text/javascript">
	function send() {
		alert("로그인합니다.")
		insert.action = "board_login.jsp";
		insert.submit();
	}
	function reset() {
		alert("다시 입력합니다.")
		insert.reset();
		insert.name.focus();
	}
</script>

</head>
<body>
<table>
<tr valign=bottom>
	<tb><b>아이디:</b></tb>
	<input type=text name="userid" size=16 maxlength=16 STYLE="WIDTH:155">
	
	<tb><b>비밀번호:</b></tb>
	<input type=password name="passwd" size=14 maxlength=12 STYLE="WIDTH:155">
      <a href = "javascript:send()"><input type="button" onclick="submit()" value="확인"></a>
      <a href = "javascript:reset()"><input type="button" onclick="cancle()" value="취소"></a>
</tr>

</table>
</body>
</html>