<%@page import="jdk.internal.org.objectweb.asm.tree.analysis.Value"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, model.*"%>

<%! 
String lineBreak(String str){
	StringBuffer buf = new StringBuffer();
	for(int x = 0; x<str.length();x++){
		if(str.charAt(x)=='\n'){
			buf.append("<br>");//줄바꿈 기능 추가
		}else{
			buf.append(str.charAt(x));
		}
	}
	return new String(buf);	
}
%>

<%
	GuestDAO dao = GuestDAO.getInstance();
	int idx = Integer.parseInt(request.getParameter("idx"));

//쿠키 검사
	boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();//클라이언트에 있는 객체를 이용해서 쿠키가 존재하는지 아닌지..
	for(int x=0; x<cookies.length; x++){
		info = cookies[x];
		if(info.getName().equals("guest"+idx)){
			bool = true;
			break;		
		}
	}
		
	String newValue = "" + System.currentTimeMillis();//1000분의 1초..
	
	if(!bool){ //쿠키가 존재하지 않으면
		dao.guestReadcnt(idx);//조회수가 증가됨
		info = new Cookie("guest"+ idx, newValue);//글을 읽을 때 마다...
		info.setMaxAge(60*60);//세션을 유지하는 시간,,, 60분은 한시간... 하루는 24*60*60..
		response.addCookie(info);
	
	}
	
	List<GuestVO> list = dao.guestList();
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>방명록 내용 보기</title>
<link rel="stylesheet" type="text/css" href="/stylesheet.css">
<style type="text/css">
td.title {
	padding: 4px;
	background-color: #e3e9ff
}

td.content {
	padding: 10px;
	line-height: 1.6em;
	text-align: justify;
}

a.list {
	text-decoration: none;
	color: black;
	font-size: 10pt;
}
</style>
<script language="javascript">
 <!--
 function del_list() {
   var urlString;
    urlString = "guest_delete.jsp" ;
    window.open(urlString, "del_list"," resizable=no,x=150,y=150,width=300,height=170");
 }
 //-->
 </script>
</head>
<body topmargin="0" leftmargin="0">
	<table border="0" width="800">
		<tr>
			<td width="20%" height="500" bgcolor="#ecf1ef" valign="top">
				<!--  다음에 추가할 부분 -->

			</td>
			<td width="80%" valign="top">&nbsp;<br>
				<table border="0" width="90%" align="center">
					<tr>
						<td colspan="2"><img src="./img/bullet-01.gif"> <font
							color="blue" size="3">방 명 록</font><font size="2"> - 글읽기</font></td>
					</tr>
				</table>
				<p>
				<table border="0" width="90%" align="center" cellspacing="0"
					style="border-width: 1px; border-color: #0066cc; border-style: outset;">
					<tr bgcolor="e3e9ff">
						<td class="title"><img src="./img/bullet-04.gif"> <font
							size="2" face="돋움"> <%= list.get(0).getSubject() %></font></td>
					</tr>
					<tr>
						<td class="content">
							<p align="right">
								<font size="2" face="돋움"> <%= list.get(0).getName() %> / <font
									size="2" face="돋움"> <%= list.get(0).getRegdate() %> / <%= list.get(0).getReadcnt() %>번
										읽음
								</font>
									<p>
										<%= lineBreak(list.get(0).getContents()) %>
									<p>
						</td>
					</tr>
				</table> <!--**** 여기서부터 게시물 내용 아래쪽의 버튼들이 나옵니다. 답변, 수정, 삭제, 목록보기 ****-->
				<p align="center">
					<font size="2"> <!-- 목록보기 --> <a href="guest_list.jsp"><img
							src="./img/list-2.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="guest_modify.jsp?idx=<%=idx %>"><img
							src="./img/edit.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="guest_delete.jsp?idx=<%=idx %>"><img src="./img/del.gif"
							border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
					</font></td>
		</tr>
	</table>
</body>
</html>
