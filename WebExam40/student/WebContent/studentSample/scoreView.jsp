<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생성적 조회화면</title>

<style type="text/css">
*{padding :0; margin:0}
.logo{text-align:center; background-color:#fdeff2; color:#c85179;padding:40px}

.navi{background-color:#e198b4; padding:10px 0; overflow:hidden}
.navi ul li{text-align:center; list-style:none; float:left; padding:10px}
a{color:#fff; text-decoration: none}
.table th,td{background-color:#fff; border:solid 2px #e198b4;}
table td {width:90px}
.title{text-align:center; padding:10px 0; color:#e198b4}
.section{text-align:center; color:#c85179;}

.footer{background-color:#fdeff2; padding:10px 0}
.footer p{text-align:center; color:#e198b4;}

</style>

</head>
<body>

<div class="header">
<header>
<h1 class="logo">(과정평가형 정보처리산업기사) 학생성적 관리 프로그램 ver2009-06</h1>
	<nav class="navi">
	<ul>
	<a href="insert"><li>학생성적등록</li></a>
	<a href="view"><li>학생성적조회</li></a>
	<a href="index"><li>홈으로</li></a>
</ul>
</nav>
</header>
</div>

<div class="section">
<section>
<h2 class="title" color="#e198b4">학생성적조회 화면</h2>
<center>
	<table width="800" border="1" bordercolor="#fdeff2">
	<tr>
		<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	번호</th>
		<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	이름</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	성별</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	국어</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	영어</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	수학</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	총점</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	평균</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	등급</th>
	</tr>
	<tr>
	<c:forEach var="x" items="${list}">
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.bun}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.name}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.gender}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.kor}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.eng}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.mat}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.sum}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.avg}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.level}</th>
	</tr>
	</c:forEach>
	</table>
	</center>
</section>
</div>

<div class="footer">
<footer>
<p>HRDKOREA Copyright@2019 All rights reserved. Human Resources Development Service of Korea</p>

</footer>
</body>
</html>