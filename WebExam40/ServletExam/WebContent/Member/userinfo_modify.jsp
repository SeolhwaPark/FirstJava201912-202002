<%@ page contentType="text/html; charset=UTF-8" %>


<html>
<head>
<title>정보수정</title>
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000; BACKGROUND-POSITION: left top; BACKGROUND-REPEAT: no-repeat;}
-->
.formbox {
	BACKGROUND-COLOR: #F0F0F0; FONT-FAMILY: "Verdana", "Arial", "Helvetica", "돋움"; FONT-SIZE:9pt
} 
--->
</STYLE>
<%
	String gubun = (String)request.getAttribute("gubun");
	String fav = (String)request.getAttribute("fav");
	String job = (String)request.getAttribute("job");
%>

</head>

<body bgcolor="#FFFFFF" LEFTMARGIN=0  TOPMARGIN=0 >
 
 <!-- 탑 메뉴 영역 삽입-->


<table border="0" width="800">
<tr>
  <td width="20%"  bgcolor="#ecf1ef" valign="top" style="padding-left:0;">
	
	<!--로그인 영역 삽입-->

  </td>
  <td width="80%" valign="top">&nbsp;<img src="Member/img/title1.gif" ><br>    
	<form name=form_name method=post>
	<table border=0 cellpadding=0 cellspacing=0 border=0 width=730 valign=top>
		<tr><td align=center><br>                            
			<table cellpadding=0 cellspacing=0 border=0 width=650 align=center>       
				<tr>
					<td bgcolor="#7AAAD5">            
						<table cellpadding=0 cellspacing=0 border=0 width=100%>
							<tr bgcolor=#7AAAD5>
								<td align=left BORDER="0" HSPACE="0" VSPACE="0"><img src="Member/img/u_b02.gif"></td>
								<td align=center bgcolor="#7AAAD5"><FONT COLOR="#FFFFFF"><b>정보수정&nbsp;</b><font color=black>(</font><font color=red>&nbsp;*&nbsp;</font><font color=black>표시항목은 반드시 입력하십시요.)</font></FONT></td>
								<td align=right BORDER="0" HSPACE="0" VSPACE="0"><img src="Member/img/u_b03.gif"></td>
							</tr>
						</table>
						<table cellpadding=3 cellspacing=1 border=0 width=100%>
							<tr>
								<td width=110 bgcolor=#EFF4F8>&nbsp;회원 성명<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=name size=16 maxlength=20 value=${name }>성명은 빈칸없이 입력하세요
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;회원 ID<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
									<table cellspacing=0 cellpadding=0>
										<tr>
											<td align=absmiddle>
												<input type=text name=userid size=12 maxlength=16 value=${userid } style="width:120">
											</td>
											<td>
                  			<img src="Member/img/u_bt01.gif" hspace=2 border=0 name=img1  align=absmiddle>
                   		5~16자 이내의 영문이나 숫자만 가능합니다.
                  		</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;비밀번호<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE>
								<input type=password name=passwd size=8 maxlength=12 style="width:80" >
                 6~12자 이내의 영문이나 숫자만 가능합니다.
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;비밀번호확인<font color=red>&nbsp;*</font></td>
								<TD BGCOLOR=WHITE><input type=password name=repasswd size=8 maxlength=12 value="" style="width:80">비밀번호 확인을 위해서 비밀번호를 한번 더 입력해주세요. </td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;주소구분<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=radio name=gubun value = "1" <%if(gubun.equals("1")){%> checked <%}%>>직장&nbsp;&nbsp;
									<input type=radio name=gubun value = "2"<%if(gubun.equals("2")){%> checked <%}%>>자택 
								</td>
							</tr>
							
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;우편번호<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<table cellspacing=0 cellpadding=0>
										<tr>
											<td>
                  				<input type=text name=zip size=6 maxlength=6 >
                  		</td>
                  		<td>
      									<img src="Member/img/u_bt07.gif" hspace=2 border=0 name=img2 align=absmiddle>
 											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;주소<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=addr1 size=50 maxlength=100 value="">
								</td>
							</tr>
							<tr>
								<TD BGCOLOR="#EFF4F8">&nbsp;나머지 주소<font color=red>&nbsp;</font></td>
								<TD BGCOLOR=WHITE>
									<input type=text name=addr2 size=50 maxlength=100 value="">
								</td>
							</tr>
							<tr>
               <TD BGCOLOR="#EFF4F8">&nbsp;전화번호<font color=red>&nbsp;*</font></td>
                <TD BGCOLOR=WHITE>
                  <input type=text name=tel size=13 maxlength=13 value="${tel}">
               </td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;E-mail
                	<font color=red>&nbsp;</font>
                </td>
                <td bgcolor=WHITE valign=middle>
                  <input type=text name=email size=30 maxlength=30 value="${email}">
                </td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;관심분야
                	<font color=red>&nbsp;</font>
                </td>
								<td bgcolor=WHITE valign=middle> 
									<input type="checkbox" name="fa" value="건강"<% if(fav.contains("건강")){%>checked<%}%>>건강 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="문화예술"<% if(fav.contains("문화예술")){%>checked<%}%>>문화예술 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="경제"<% if(fav.contains("경제")){%>checked<%}%>>경제 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="연예오락"<% if(fav.contains("연예오락")){%>checked<%}%>>연예오락 &nbsp;
									<input type="checkbox" name="fa" value="뉴스"<% if(fav.contains("뉴스")){%>checked<%}%>>뉴스
									<br><input type="checkbox" name="fa" value="여행레져"<% if(fav.contains("여행레져")){%>checked<%}%>>여행레져 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="생활"<% if(fav.contains("생활")){%>checked<%}%>>생활 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="스포츠"<% if(fav.contains("스포츠")){%>checked<%}%>>스포츠 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="교육"<% if(fav.contains("교육")){%>checked<%}%>>교육 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="checkbox" name="fa" value="컴퓨터"<% if(fav.contains("컴퓨터")){%>checked<%}%>>컴퓨터 &nbsp;&nbsp;
									<input type="checkbox" name="fa" value="학문"<% if(fav.contains("학문")){%>checked<%}%>>학문 &nbsp;&nbsp;
								</td>
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;직업<font color=red>&nbsp;</font></td>
                <TD BGCOLOR=WHITE>
                  <select name=job class="formbox">
 										<option value="0">선택하세요 ---
 										<option value="회사원"<%if(job.equals("회사원")){%> selected <%}%>>회사원
 										<option value="연구전문직"<%if(job.equals("연구전문직")){%> selected <%}%>>연구전문직
 										<option value="교수학생"<%if(job.equals("교수학생")){%> selected <%}%>>교수학생
 										<option value="일반자영업"<%if(job.equals("일반자영업")){%> selected <%}%>>일반자영업
 										<option value="공무원"<%if(job.equals("공무원")){%> selected <%}%>>공무원
 										<option value="의료인"<%if(job.equals("의료인")){%> selected <%}%>>의료인
 										<option value="법조인"<%if(job.equals("법조인")){%> selected <%}%>>법조인
 										<option value="종교,언론,예술인"<%if(job.equals("종교,언론,예술인")){%> selected <%}%>>종교.언론/예술인
 										<option value="농,축,수산,광업인"<%if(job.equals("농,축,수산,광업인")){%> selected <%}%>>농/축/수산/광업인
 										<option value="주부"<%if(job.equals("주부")){%> selected <%}%>>주부
 										<option value="무직"<%if(job.equals("무직")){%> selected <%}%>>무직
 										<option value="기타"<%if(job.equals("기타")){%> selected <%}%>>기타
									</select>
								</td>                
              </tr>
              <tr>
                <TD BGCOLOR="#EFF4F8">&nbsp;자기소개<font color=red>&nbsp;</font></td>
                <TD BGCOLOR=WHITE>
                  <textarea cols=65 rows=5 name="intro"></textarea>
                </td>
              </tr>
            </table>
            <table cellpadding=0 cellspacing=0 border=0 width=100%>
              <tr bgcolor=#7AAAD5>
                <td valign=bottom>
                  <img src="Member/img/u_b04.gif" align=left hspace=0 vspace=0 border=0>
                </td>
                <td align=center></td>
                <td valign=bottom>
                  <img src="Member/img/u_b05.gif" align=right hspace=0 vspace=0 border=0>
                </td>
              </tr>
              <tr bgcolor=#ffffff>
                <td colspan=3 align=center>
                  <a href=""><img src="Member/img/u_bt06.gif" vspace=3 border=0 name=img3></a>
                   <a href=""><img src="Member/img/u_bt05.gif" border=0 hspace=10 vspace=3 name=img4></a>
                </td>
              </tr>
            </table> 
          </td>
        </tr>
      </td>
    </tr>
	</table>
	</form>
	</td>
</tr>
</table>

 <!-- copyright 영역 삽입-->
  

</body>
</html>
