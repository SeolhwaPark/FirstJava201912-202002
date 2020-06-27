<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우선 생산 제품 화면</title>
</head>
<body>
<table width="800" border="1" bordercolor="#fdeff2">

	<tr>
		<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	제품코드</th>
		<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	제품이름</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	제품원가</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	재고수량</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	출고가</th>
	<th style="width:100; color:#fdeff2; 
	background-color:#e198b4;border:0 solid #fdeff2">
	그룹이름</th>
	
	</tr>
	<tr>
	<c:forEach var="x" items="${list}">
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.code}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.pname}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.cost}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.pnum}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.jnum}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.sale}</th>
	<th style="width:100; color:#e198b4; 
	background-color:#fff;border:0 solid #fdeff2">
	${x.gcode}</th>

	</tr>
	</c:forEach>
	</table>
	</center>
</section>
</div>
</body>
</html>