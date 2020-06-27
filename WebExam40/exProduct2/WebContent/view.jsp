<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import= "java.util.*, java.text.*, model.*" %>


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
	
	<script type="text/javascript">
	function send() {
		if(insert.code.value==""){
			alert("코드가 입력되지 않았습니다.");
			insert.code.focus();
			return false;
		}
		alert("조회합니다.");
		
		insert.submit();
		return true;
	}
	function del() {
		alert("새로 입력합니다.");
		insert.reset();
	}
	</script>
	
</head>
<body>


<div class = "header">
	<header>
		<h1>생산관리 ver2.0</h1>
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

<div class = "section">
	<center>
	<section>
		<h2 class="title" >생산관리  제품 조회</h2>
		<div class="contents">
	
			<form name="insert" method="post" action="view_pro.jsp">
			
			<table>
				<tr>
					<th class="thh">제품코드</th>
					<td class="tdd"><input type="text" name="code"></td>
				</tr>
				
				<tr>
					<td colspan="2" class="btn_group">
						<input type="button" value="조회하기" style="width: 75; color: #fff; 
						background-color: #c85179; border: 0 solid #fdeff2" onClick="send()">
						<input type="button" value="다시쓰기" style="width:75; color: #fff;
						background-color: #c85179; border: 0 solid #fdeff2" onClick="del()">
					</td>
				</tr>
			
			</table>
			</form>
		</div>
	</section>
	</center>
</div>
	
<br><br>

<div class = "footer">
	<footer>	
		<p>HRDKOREA Copyright@2016 All rights reserve Human Resources 
			Development Service of Korea</p>
	</footer>
</div>
</body>
</html>
</body>
</html>