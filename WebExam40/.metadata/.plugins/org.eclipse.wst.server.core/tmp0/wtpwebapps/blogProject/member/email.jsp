<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>발송한 인증번호 확인하기</title>

<c:if test="${!empty row}">
<c:if test="${row == 1 }">
<script>

alert("인증성공 했습니다");
opener.my.emailcheck.value="2"
self.close();
</script>
</c:if>
<c:if test="${row == 0 }">
<script>
	alert("인증에 실패했습니다. ");
	history.back();
</script>
</c:if>
</c:if>

<script type="text/javascript">
	function check2() {
		if(certify.certifyCode.value ==""){
			alert("인증번호를 입력해주세요");
			certify.certifyCode.focus();
			return false;
		}
		return true;
	}
	function win_close() {
		self.close();
		
	}
	
</script>

</head>
<body>
	<form name="certify" method="post" action="email_check"
		onsubmit="return check2()">
		<table>
		<tr>
			<TD><font color=red>&nbsp;★</font>&nbsp;인증번호를
				입력하세요<font color=red>&nbsp;★</font></td>
			<TD>
		</tr>
				<table cellspacing=0 cellpadding=0>
					<tr>
						<td align=absmiddle>
						<input type=text name=certifyCode size=12
							maxlength=16 value="" style="width: 120"></td>
					</tr>
					<tr>		
							<td align=absmiddle>
							<input type=submit value="확인" border=0 vspace=0 onClick="check()">
							<input type=button value="닫기" border=0 vspace=0 onClick="win_close()">
							</td>
					</tr>
					</table>
					</form>
</body>
</html>