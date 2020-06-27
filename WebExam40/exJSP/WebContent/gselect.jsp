<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.sql.*"%>
<%
	/*연결 */
	request.setCharacterEncoding("utf-8");
	String myDriver = "oracle.jdbc.OracleDriver";
	String myURL = "jdbc:oracle:thin:@//localhost:1521/xe";
	String myID = "jsl40";
	String myPass = "1234";
%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int row = 0;

	try {
		/*1 드라이버로딩*/
		Class.forName(myDriver);
		/*2 커넥션연결*/
		conn = DriverManager.getConnection(myURL, myID, myPass);

		String query = "select * from tbl_groupcode";
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
%>

<head>
<meta charset="UTF-8">
<title>과정평가형 정보처리산업기사</title>
<style type="text/css">
*{padding :0; margin:0}
.logo{text-align:center; background-color:#fdeff2; color:#c85179;padding:40px}

.navi{background-color:#e198b4; padding:10px 0; overflow:hidden}
.navi ul li{text-align:center; list-style:none; float:left; padding:10px}
a{color:#fff; text-decoration: none}
.table td{background-color:#fff; border:solid 2px #e198b4;width:90px}
.title{text-align:center; padding:10px 0; color:#e198b4}
.section{text-align:center; color:#c85179;}

.footer{background-color:#fdeff2; padding:10px 0}
.footer p{text-align:center; color:#e198b4;}

</style>

</head>
<body>
	<center>
		<div class="header">
			<header>
				<h1 class="logo">생산관리 ver 2.0</h1>
				<nav class="navi">
					<ul>
					<a href="input.jsp"><li>제품입력</li></a>
					<a href="gsearch2.jsp"><li>제품조회</li></a>
					<a href="select.jsp"><li>제품현황</li></a>
					<a href="group.jsp"><li>그룹별재고현황</li></a>
					<a href="index.jsp"><li>홈으로</li></a>
					<a href="ginput.jsp"><li>그룹코드등록</li></a>
					<a href="gsearch.jsp"><li>그룹코드조회</li></a>
					<a href="gselect.jsp"><li>그룹코드현황</li></a>
					</ul>
				</nav>
			</header>
		</div>

		<div class="section">
			<section>
				<h2 class="title" color="#e198b4">그룹관리 현황</h2>
				<div class="contents">

					<table width="800" border="1" bordercolor="#fdeff2">
						<tr>
							<td style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">그룹코드</td>
							<td style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">그룹이름</td>

						</tr>
<%while(rs.next()){ %>
						<tr>
							<td style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	
	<a href ="gsearch.jsp?gcode=<%=rs.getString("gcode") %>"><%=rs.getString("gcode") %></a></td>
	
							<td style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	
	<a href ="gsearch.jsp?gcode=<%=rs.getString("gname") %>"><%=rs.getString("gname") %></a></td>
	
<%} %>
						</tr>
						
						<tr>
							</tr>
						
					</table>

				</div>
			</section>
		</div>

	<div class="footer">
		<footer>
			<p>HRDKOREA Copyright@2019 All rights reserved. Human Resources
				Development Service of Korea</p>

		</footer>
	</div>

	</center>
</body>
</html>

<% 
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>
