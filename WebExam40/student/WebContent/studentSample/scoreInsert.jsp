<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생성적관리 프로그램</title>

<style type="text/css">
*{padding :0; margin:0}
.logo{text-align:center; background-color:#fdeff2; color:#c85179;padding:40px}
.navi{background-color:#e198b4; padding:10px 0; overflow:hidden}
.navi ul li{text-align:center; list-style:none; float:left; padding:10px}

a{color:#fff; text-decoration: none}
.table th, td {background-color: #fff;border: solid 2px #e198b4;}
table td {color: #c85179;width: 300px}
.btn_group {text-align: center}
.contents {margin: center}
.font {color: #c85179}

.title{text-align:center; padding:10px 0 ; color:#e198b4}
.section{text-align:center; color:#c85179;}
.footer{background-color:#fdeff2; padding:10px 0}
.footer p{text-align:center; color:#e198b4;}
</style>

</head>
<script type="text/javascript">
	function send() {
		if (frm.bun.value == "") {
			alert("학생의 번호가 입력되지 않았습니다.");
			frm.bun.focus();
			return false;
		}
		if (frm.bun.value.length != 4) {
			alert("학생의 번호가 올바른 형식이 아닙니다.");
			frm.bun.focus();
			return false;
		}
		if (frm.name.value == "") {
			alert("학생의 이름이 입력되지 않았습니다.");
			frm.name.focus();
			return false;
		}
		if (frm.kor.value == "") {
			alert("국어점수가 입력되지 않았습니다.");
			frm.kor.focus();
			return false;
		}
		if (frm.kor.value<0||frm.kor.value>100) {
			alert("국어점수의 입력이 잘못되었습니다.");
			frm.kor.focus();
			return false;
		}
		if (frm.eng.value == "") {
			alert("영어점수가 입력되지 않았습니다.");
			frm.eng.focus();
			return false;
		}
		if (frm.eng.value<0||frm.eng.value>100) {
			alert("영어점수의 입력이 잘못되었습니다.");
			frm.eng.focus();
			return false;
		}
		if (frm.mat.value == "") {
			alert("수학점수가 입력되지 않았습니다.");
			frm.mat.focus();
			return false;
		}
		if (frm.mat.value<0||frm.mat.value>100) {
			alert("수학점수의 입력이 잘못되었습니다.");
			frm.mat.focus();
			return false;
		}

		alert("학생 성적정보가 등록되었습니다.");
		return true;
	}

	function reset() {
		alert("입력된 항목을 다시 씁니다.");
		frm.reset();
	}
</script>

<body>
	<center>
		<div class="header">
			<h1 class="logo">(과정평가형 정보처리산업기사) 학생성적 관리 프로그램 ver2009-06</h1>
	<nav class="navi">
	<ul>
	<a href="insert"><li>학생성적등록</li></a>
	<a href="view"><li>학생성적조회</li></a>
	<a href="index"><li>홈으로</li></a>
</ul>
</nav>
		</div>

		<div class="contents">
			<section >
			<h2 class="title">학생성적관리 프로그램</h2>
				<form name="frm" method="post" action="insert" onsubmit="return send()">
					<table>
						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								번호</th>
							<td class="font"><input type="text" name="bun">(4자리:1101)</td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								이름</th>
							<td><input type="text" name="name"></td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								성별</th>
							<td><input type="radio" name="gender" value="m">남자 <input
								type="radio" name="gender" value="f">여자</td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								국어</th>
							<td class="font"><input type="text" name="kor">(0~100)</td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								영어</th>
							<td class="font"><input type="text" name="eng">(0~100)</td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								수학</th>
							<td class="font"><input type="text" name="mat">(0~100)</td>
						</tr>

						<tr>
							<th
								style="width: 75; color: #fdeff2; background-color: #e198b4; border: 0 solid #fdeff2">
								등록일자</th>
							<td><input type="text" name="regdate" value="${date1}"></td>
						</tr>
						<tr>
							<td colspan="2" class="btn_group">
							<input type="submit" value="등록하기" style="width: 75; color: #fff; background-color: #c85179; border: 0 solid #fdeff2">
							<input type="button" value="다시쓰기" style="width: 75; color: #fff; background-color: #c85179; border: 0 solid #fdeff2" onClick="reset()"></td>
						</tr>
					</table>
				</form>
			</section>
			
			
	</center>
	</div>
<div class="footer">
<footer>
<p>HRDKOREA Copyright@2019 All rights reserved. Human Resources Development Service of Korea</p>

</footer>
</body>
</html>