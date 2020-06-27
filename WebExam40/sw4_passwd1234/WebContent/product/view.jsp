<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 조회&수정화면</title>
<style type="text/css">



</style>

</head>
<body>
<%@ include file = "includeMain.jsp" %>
<div>
<h2>생산관리 조회&수정화면</h2>

</div>
<div>
<h4>생산관리 조회화면</h4>
<table>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·제품코드</th>
		<td class="font"><input type="text" name="code"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·제품이름</th>
		<td class="font"><input type="text" name="pname"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·제품원가</th>
		<td class="font"><input type="text" name="cost"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·목표수량</th>
		<td class="font"><input type="text" name="jnum"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·재고수량</th>
		<td class="font"><input type="text" name="sale"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·출고가</th>
		<td class="font"><input type="text" name="gcode"></td>
	</tr>
	<tr>
		<th style="width: 75; color: #fdeff2; background-color: #e198b4; 
		border: 0 solid #fdeff2">·그룹이름</th>
		<td class="font">
		<select name="group">
		<option value="컴퓨터">컴퓨터</option>
		<option value="냉장고">냉장고</option>
		<option value="냉장소모품">냉장소모품</option>
		</td>
</select>
	</tr>
	<tr>
		<td colspan="2" class="btn_group">
			<input type="button" value="조회" style="width: 100px;height: 50px; color: #fff; background-color: #c85179; border: 1 solid #fdeff2">
			<input type="button" value="수정" style="width: 100px;height: 50px; color: #fff; background-color: #c85179; border: 1 solid #fdeff2">
			<input type="button" value="삭제" style="width: 100px;height: 50px; color: #fff; background-color: #c85179; border: 1 solid #fdeff2">
			<input type="button" value="메인화면" style="width: 100px; height:50px; color: #fff; background-color: #c85179; border: 1 solid #fdeff2">
		</td>
	</tr>
	
</table>
</div>

</body>
</html>