<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생성적관리 프로그램</title>
<style type="text/css">



</style>
<script type="text/javascript">
function send() {
	
}

function reset() {
	
}

</script>
</head>
<body>
<div class="">
<header>
	<h1 class="logo">학생성적관리 프로그램</h1>
</header>
</div>
<div class="header">
<header>
	<h1></h1>
</header>
</div>

<div class="section">
<section>
	<form name="frm" method="post" action="insert"
					onsubmit="return send()">
	<table>
		<tr>
			<th></th>
			<td></td>
		</tr>
		<tr>
			<td colspan="2" class="btn_group">
			<input type="submit" value="등록하기" style="width: 75; color: #fff; background-color: #c85179; border: 0 solid #fdeff2">
			<input type="button" value="다시쓰기" style="width: 75; color: #fff; background-color: #c85179; border: 0 solid #fdeff2" onClick="reset()"></td>
		</tr>
	</table>
	</form>
</section>
</div>

<div class="footer">
<footer>
	<p></p>
</footer>
</div>
</body>
</html>