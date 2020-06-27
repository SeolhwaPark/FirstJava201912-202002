<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.*, java.text.*, model.*" %>
    <%
    DAO dao = DAO.getInstance();
    List<VO> list = dao.listDB();
    DecimalFormat df = new DecimalFormat("￦#,###.00"); //ㄹ + 한자키 = ￦
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 ver2.0</title>

	<style type="text/css">
		*{padding:0; margin:0}
		.header h1{ color:#c85179; background-color: #fdeff2; text-align: center; padding: 40px}
		.logo{ color: #c85179; background-color: #fdeff2; }
		.navi{background-color: #e198b4;padding: 10px 0;overflow: hidden }
		.navi ul li{text-align: center;list-style: none;float: left;padding: 10px}
		a{ color: #fff;text-decoration: none }
		
		.table th, td {background-color: #fff; border: solid 2px #e198b4;}
		table td {color: #c85179; width: 300px}		
		.thh{ color: #fdeff2; background-color: #e198b4; width: 300px; border: 0 solid #fdeff2}
		.tdd{ color:#c85179; width: 300px}
		.btn_group{text-align: center}
				
		.title{ color: #e198b4; text-align: center;padding: 10px 0;}
		.contents{ margin: 10px 0}
		.section{ color: #c85179; }
		.footer{ background-color: #fdeff2; padding:10px}
		.footer p{ color: #e198b4; text-align: center;}
		
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
					<td>제품코드</td>
				
					<td>제품이름</td>
			
					<td>제품원가</td>
				
					<td>목표수량</td>
				
					<td>재고수량</td>
				
					<td>출고가</td>

					<td>그룹코드</td>
				</tr>	
				
				<%
				for(int x=0; x<list.size(); x++){
				%>			
				<tr>
					<td><a href ="search.jsp?code=<%=list.get(x).getCode() %>"><%=list.get(x).getCode() %></a></td>
				
					<td><%=list.get(x).getPname() %></td>
			
					<td><%=list.get(x).getCost() %></td>
				
					<td align="right"><%=df.format(list.get(x).getPnum()) %></td> <!--원표시랑 컴마가 나옴, align="right" 오른쪽정렬-->
				
					<td><%=list.get(x).getJnum() %></td>

					<td><%=list.get(x).getSale() %></td>
				
					<td><%=list.get(x).getGcode() %></td>
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