<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--     //발송지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 테스트</title>
<script>
function send() {
	alert("등록 성공")
	insert.action="MemInsertServlet";
	insert.submit();
	
}
function reset() {
	alert("다시 쓰기")
	insert.reset();
}
</script>
</head>
<body>
<form method = "post" action = "testServlet">
<table cellpadding=3 cellspacing=1 border=0 BGCOLOR=pink>
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;이름</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=name size=16 maxlength=20 value="">
		</td>
	</tr>

	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;주민등록번호</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=number size=16 maxlength=20 value="">-
		<input type=text name=number size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;아이디</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=id size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8 >&nbsp;비밀번호</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=passwd size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;비밀번호 확인</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=repasswd size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;이메일</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=email size=16 maxlength=20 value="">@
		<input type=text name=email size=16 maxlength=20 value="">
        	<select name=email class="formbox">
 					<option value="nate.com">nate.com
 					<option value="naver.com">naver.com
 					<option value="hotmail.com">hotmail.com
 					<option value="yahoo.co.kr">yahoo.co.kr
 					<option value="gmail.com">gmail.com
			</select>
		</td>
		
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;우편번호</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=post size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;주소</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=addr size=16 maxlength=20 value="">
		<input type=text name=addr size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;핸드폰 번호</font></td>
		<TD BGCOLOR=pink>
		<input type=text name=phone size=16 maxlength=20 value="">
		</td>
	</tr>
	
	<tr>
		<TD BGCOLOR="#EFF4F8">&nbsp;직업<font color=red>&nbsp;</font></td>
        	<TD BGCOLOR=pink>
                  <select name=job class="formbox">
   					<option value="강사">강사
 						<option value="개발자">개발자
 						<option value="검찰수사관">검찰수사관
 						<option value="게이머">게이머
 						<option value="경리">경리
 						<option value="경비">경비
 						<option value="회계사">회계사
 						<option value="과학자">과학자
 						<option value="디자이너">디자이너
 						<option value="주부">주부
 						<option value="무직">무직
 						<option value="기타">기타
		</select>
	</tr>
	
	<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;메일/SMS 정보 수신</font></td>
		<TD BGCOLOR=pink>
		<input type=radio name=susin size=16 maxlength=20 value="1">수신&nbsp;&nbsp;
		<input type=radio name=susin size=16 maxlength=20 value="2">수신 거부 
		</td>
	</tr>
	
		<tr>
		<td width=200 bgcolor=#EFF4F8>&nbsp;관심분야</font></td>
		<TD BGCOLOR=pink>
		<input type=checkbox name=coffee size=16 maxlength=20 value="">생두&nbsp;&nbsp;
		<input type=checkbox name=coffee size=16 maxlength=20 value="">원두&nbsp;&nbsp;
		<input type=checkbox name=coffee size=16 maxlength=20 value="">로스팅&nbsp;&nbsp;
		<input type=checkbox name=coffee size=16 maxlength=20 value="">핸드드립&nbsp;&nbsp;
		<input type=checkbox name=coffee size=16 maxlength=20 value="">에스프레소&nbsp;&nbsp;
		<input type=checkbox name=coffee size=16 maxlength=20 value="">창업 
		</td>
	</tr>
	
	<tr>
		<td colspan=3 align=center>
                  <input type = "submit" value="회원가입">
                  <input type = "reset" value="취소">
        </td>
	</tr>
</table>
</form>

</body>
</html>