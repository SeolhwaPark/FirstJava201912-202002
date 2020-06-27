<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*, model.*" %>   
<%
	request.setCharacterEncoding("utf-8");
	
	DAO dao = DAO.getInstance();
	
	List<VO> list = dao.bookLentList();
%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{margin:0; padding:0;}
	ul,li {list-style:none;}
	a {text-decoration:none;}
	.logo {color:#fff; text-align:center;background-color:#0040FF;
	      padding:16px 0;}
	.navi{padding:12px 0; overflow:hidden;background-color:#BCA9F5;}
	.navi ul,li{float:left; padding:0 20px; text-align:center;}
	.content{background-color:#E6E6E6; padding:16px; height:300px;} 
	.title{text-align:center;padding:22px;}
	.footer{padding:16px 0; text-align:center;background-color:#0040FF;}
	.content table{width:800px; margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group{text-align:center;}
	.content .text_center {text-align:center;}	
</style>
</head>
<body>
	<div class="header">
		<header>
			<h1 class="logo">(과정평가형 정보처리산업기사) 도서 관리 프로그램  ver3.0</h1>
			<nav>
				<ul class="navi">
					<li><a href="memInsert.jsp">회원등록</a></li>
					<li><a href="memList.jsp">회원목록조회</a></li>
					<li><a href="lentInsert.jsp">도서대출등록</a></li>
					<li><a href="lentList.jsp">도서대출현황</a></li>
					<li><a href="bookInsert.jsp">도서등록</a></li>
					<li><a href="bookLentList.jsp">도서별 대출현황</a></li>
					<li><a href="index.jsp">홈으로</a></li>
				</ul>
			</nav>
		</header>
	</div>

	<div class="section">
		<section>
			<div class="content">
				<h2 class="title">과정평가형 자격 CBQ(도서별 대출 현황)</h2>
						<table>
							<tr>
								<th>도서코드</th>
								<th>도서이름</th>
								<th>구입년도</th>
								<th>대출건수</th>
								<th>반납건수</th>
							</tr>
				<%
					for(int i=0; i<list.size();i++){		
				%>			
							
							<tr>
								<td class="text_center"><%= list.get(i).getBookno() %></td>
								<td class="text_center"><%= list.get(i).getBookname() %></td>
								<td class="text_center"><%= list.get(i).getRegdate().substring(0,10) %></td>
								<td class="text_center"><%= list.get(i).getOutcnt() %></td>
								<td class="text_center"><%= list.get(i).getIncnt() %></td>
							</tr>
				<%
					}
				%>			
						</table>
							
			</div>
		</section>
	</div>
	<div class="footer">
		<footer>
			<p>HRDKOREA Copyright@2016 All rights reserve. 
			Human Resources Development Serivce of Korea</p>
		</footer>
	</div>
</body>
</html>