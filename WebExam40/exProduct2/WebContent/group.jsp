<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.*, java.text.*, model.*" %>
    <%
    DAO dao = DAO.getInstance();
    List<VO> list = dao.groupList();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 ver2.0</title>
<Link rel = "stylesheet" style type="text/css" href="css/style01.css">

</style>
</head>
<body>
	<div class="header">
			<header>
			<h1 style="text-align: center;background-color: #fdeff2;color: #c85179;padding: 40px">
			생산관리 ver2.0</h1>
			<nav class="navi">
				<ul>
					<a href="insert.jsp">
					<li>제품입력</li></a>
					<a href="view.jsp">
					<li>제품조회</li></a>
					<a href="list.jsp">
					<li>제품현황</li></a>
					<a href="group.jsp">
					<li>그룹별재고현황</li></a>
					<a href="index.jsp">
					<li>홈으로</li></a>
				</ul>
			</nav>
		</header>
	</div>

	<div class="section">
		<section>
				<h2>생산관리현황</h2>
			<div>
			<table>
				<tr>
					<td>그룹코드</td>
				
					<td>그룹명</td>
			
					<td>재고수량</td>
				
				</tr>	
		<%
		for(int x=0; x<list.size(); x++){
		%>
				<tr>
				
					<td><%=list.get(x).getGcode() %></td>
			
					<td><%=list.get(x).getGname() %></td>
				
					<td><%=list.get(x).getJnum() %></td>

				</tr>				
	<%
		}
	%>
				</div>
				</table>
		</section>
	</div>

	<div class="footer">
		<footer>
			<p>HRDKOREA Copyright@2016 All rights reserved. Human Resources
				Development Service of Korea</p>

		</footer>
	</div>
</body>
</html>