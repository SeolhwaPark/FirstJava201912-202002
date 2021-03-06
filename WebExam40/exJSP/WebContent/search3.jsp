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

	String code = "";
	if (request.getParameter("code") != null) {
		code = request.getParameter("code");
	}

	String pname = "", gcode = "";
	int cost = 0, pnum = 0, jnum = 0, sale = 0;

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	int row = 0;

	try {
		/*1 드라이버로딩*/
		Class.forName(myDriver);
		/*2 커넥션연결*/
		conn = DriverManager.getConnection(myURL, myID, myPass);

		String query = "select * from tbl_product where code=?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, code);
		rs = pstmt.executeQuery();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정평가형 정보처리산업기사</title>
<style type="text/css">
* {padding: 0;margin: 0}
.logo {text-align: center;background-color: #fdeff2;color: #c85179; padding: 40px}
.navi {background-color: #e198b4;padding: 10px 0;overflow: hidden}
.navi ul li {text-align: center;list-style: none;float: left; padding: 10px}

a {color: #fff;text-decoration: none}
.title {text-align: center;padding: 10px 0;color: #e198b4}
.contents {margin: 10px 0}
.section {text-align: center;color: #c85179;}

.footer {background-color: #fdeff2;padding: 10px 0}
.footer p {text-align: center;color: #e198b4;}
</style>
<script type="text/javascript">
	function send() {
		if (input.code.value == "") {
			alert("제품코드가 입력되지 않았습니다.");
			input.code.focus();
			return;
		}

		alert("제품을 검색합니다");
		input.submit();
	}
	function del() {
		alert("다시 입력합니다.");
		input.code.value ="";
		input.pname.value ="";
		input.cost.value ="";
		input.pnum.value ="";
		input.jnum.value ="";
		input.sale.value ="";
		input.gcode.selectedIndex = 0;
		input.code.focus();
	}
</script>
</head>
<body>
	<center>
		<div class="header">
			<header>
				<h1 class="logo">생산관리 ver 2.0</h1>
				<nav class="navi">
					<ul>
					<a href="input.jsp"><li>제품입력</li></a>
					<a href="search3.jsp"><li>제품조회</li></a>
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
				<h2 class="title" color="#e198b4">생산관리 조회 화면</h2>
				<div class="contents">

					<form name="input" method="post" action="search3.jsp">
						<table>

							<tr>
								<td>제품코드</td>
								<td><input type="text" name="code" value="<%=code%>"></td>
							</tr>
							
							<%
							if (rs.next()) {
							%>
							<tr>
								<td>제품이름</td>
								<td><input type="text" name="pname" value="<%=rs.getString("pname")%>">

								</td>
							</tr>
							<tr>
								<td>제품원가</td>
								<td><input type="text" name="cost" value="<%=rs.getInt("cost")%>"></td>
							</tr>
							<tr>
								<td>목표수량</td>
								<td><input type="text" name="pnum" value="<%=rs.getInt("pnum")%>"></td>
							</tr>
							<tr>
								<td>재고수량</td>
								<td><input type="text" name="jnum" value="<%=rs.getInt("jnum")%>"></td>
							</tr>
							<tr>
							<tr>
								<td>출고가</td>
								<td><input type="text" name="sale" value="<%=rs.getInt("sale")%>"></td>
							</tr>
							<td>그룹이름</td>
							<td><select name="gcode">
									<option value="">그룹선택</option>
									<option value="A" <%if (rs.getString("gcode").contains("A")) {%> selected <%}%>>컴퓨터</option>
									<option value="B" <%if (rs.getString("gcode").contains("B")) {%> selected <%}%>>냉장고</option>
									<option value="C" <%if (rs.getString("gcode").contains("C")) {%> selected <%}%>>냉장소품</option>
							</select></td>
							</tr>
					
							<%
							}	
							%>
							<tr>
								<td colspan="2">
								<input type="button" value="조회하기" onClick="send()"> 
								<input type="button" value="다시쓰기" onClick="del()">
								</td>
							</tr>
						</table>
					</form>

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
