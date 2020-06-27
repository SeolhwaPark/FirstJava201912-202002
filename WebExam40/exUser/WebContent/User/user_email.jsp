<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>발송한 인증번호 확인하기</title>
<script type="text/javascript">
	function check() {
		if(certify.certifyCode.value ==""){
			alert("인증번호를 입력해주세요");
			certify.certifyCode.focus();
			return false;
		}else if(certify.certifyCode.value != certifyCode){
			alert("인증번호가 일치하지 않습니다.");
			certify.certifyCode.focus();
			return false;
		}
		alert("인증되었습니다!");
		certify.submit();
		
	}
	
</script>

</head>
<body>
	<form name="certify" method="post" action=""
		onsubmit="return false">
		<table>
		<tr bgcolor=#ffffff>
			<TD BGCOLOR="#EFF4F8"><font color=red>&nbsp;★</font>&nbsp;인증번호를
				입력하세요<font color=red>&nbsp;★</font></td>
			<TD BGCOLOR=WHITE>
				<table cellspacing=0 cellpadding=0>
					<tr>
						<td align=absmiddle><input type=text name=certifyCode size=12
							maxlength=16 value="" style="width: 120"></td>
					</tr>
					<tr>
						<td>
							<input type=button value="확인" border=0 vspace=0 onClick="check()">
						</td>
					</tr>
					</table>
					</form>
</body>
</html>