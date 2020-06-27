<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정평가형 정보처리산업기사</title>
<style type="text/css">
* {padding: 0;margin: 0}
.logo {text-align: center;background-color: #fdeff2;color: #c85179;padding: 40px}
.navi {background-color: #e198b4;padding: 10px 0;overflow: hidden}
.navi ul li {text-align: center;list-style: none;float: left;padding: 10px}

a {color: #fff;text-decoration: none}
.title {text-align: center;padding: 10px 0;color: #e198b4}
.contents {margin: 10px 0}
.section {text-align: center;color: #c85179;}

.footer {background-color: #fdeff2;padding: 10px 0}
.footer p {text-align: center;color: #e198b4;}
</style>

<script type="text/javascript">
function send() {
	if(input.gcode.value==""){
	alert("그룹코드가 입력되지 않았습니다.");
	input.gcode.focus();
		return;
	}
	if(input.gname.value==""){
	alert("그룹이름이 입력되지 않았습니다.");
	input.gname.focus();
		return;
	}
	alert("등록합니다");
	input.submit();
}
function del() {
	alert("다시씁니다.");
	history.back();
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
			<h2 class="title" color="#e198b4">그룹코드 등록 화면</h2>
			<div class="contents">
			
			<form name ="input" method="post" action="ginput_pro.jsp">
				<table>
					<tr>
						<td>그룹코드</td>
						<td><input type="text" name="gcode"></td>
					</tr>
					<tr>
						<td>그룹이름</td>
						<td><input type="text" name="gname"></td>
					</tr>
					
					<tr>
						<td colspan ="2">
						<input type="button" value ="등록하기" onClick="send()">
						<input type="button" value ="다시쓰기" onClick="del()">
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