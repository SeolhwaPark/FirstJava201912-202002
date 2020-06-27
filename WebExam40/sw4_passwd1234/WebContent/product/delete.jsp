<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
</head>
<body>
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
</body>
</html>