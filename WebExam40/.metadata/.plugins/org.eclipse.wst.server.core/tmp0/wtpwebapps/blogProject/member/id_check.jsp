<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<HTML>
<HEAD>
<TITLE>사용자의 아이디를 체크합니다.</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>

<script>
function id_check() {
	if(input.id.value == ""){
		alert("아이디를 입력하세영ㅎㅎ")
		input.id.focus();
		return false;
	}
	input.submit();
}
function win_close() {
	self.close();//닫기	
}

</script>

</HEAD>
<BODY>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <b>아이디 중복 체크 </td>
  </tr>
</table>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
<TR>
  <TD>
    <TABLE CELLPADDING=4 CELLSPACING=1 BORDER=0 WIDTH=330>
  	  <TR>
        <TD ALIGN="center">
 <c:if test="${row==0}">
         <br><FONT FACE="굴림"><B>사용 가능합니다.</B></FONT><br>
         <BR><FONT COLOR="#483cae"><b>${id}</b></FONT>는 아직 사용되지 않은 아이디입니다.
         <BR><FONT COLOR="#483cae"><b>${id}</b></FONT>로 등록하셔도 됩니다.
      </c:if>
      <c:if test="${row==1}">   
        <br><font face="굴림"><b>죄송합니다</b></font><br>
    	<BR><FONT COLOR="#483cae"><b>${id}</b></FONT>는 이미 사용 중인 아이디입니다<br>
    	</c:if>

    	<form name = "input" method = "post" action ="id_check" onsubmit="return false"> 
    	사용할 아이디를 다시입력해주십시오.
           <INPUT NAME=id type=text size=16 maxlength=16 value="${id}">
      	   <input type=button value="체크" border=0 vspace=0 onClick="id_check()">

		</form>	
        </TD>
      </TR>
    </TABLE>
 </TD>
</TR>
</TABLE>

<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
    <td colspan=3 align=center>
      <input type=button value="닫기" border=0 vspace=0 onClick="win_close()">
    </td>
  </tr>
</table>
</BODY>
</HTML>