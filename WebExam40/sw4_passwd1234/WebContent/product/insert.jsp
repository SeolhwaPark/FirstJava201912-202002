<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 등록화면</title>
<style type="text/css">
</style>
<script type="text/javascript">
function send() {
	if(frm.code.value == ""){
		alert("제품코드가 입력되지 않았습니다.");
		frm.code.focus();
		return false
	}
	if(frm.code.value.length != 3){
		alert("제품코드가 올바르지 않습니다.");
		frm.code.focus();
		return false
	}
	if(frm.pname.value == ""){
		alert("제품이름이 입력되지 않았습니다.");
		frm.pname.focus();
		return false
	}
	if(frm.cost.value == ""){
		alert("제품원가가 입력되지 않았습니다.");
		frm.cost.focus();
		return false
	}
	if(frm.pnum.value == ""){
		alert("목표수량이 입력되지 않았습니다.");
		frm.pnum.focus();
		return false
	}
	if(frm.junum.value == ""){
		alert("재고수량이 입력되지 않았습니다.");
		frm.jnum.focus();
		return false
	}
	if(frm.sale.value == ""){
		alert("출고가가 입력되지 않았습니다.");
		frm.sale.focus();
		return false
	}
	if(frm.gcode.value == ""){
		alert("그룹이름이 선택되지 않았습니다.");
		frm.gcode.focus();
		return false
	}
	alert("제품 정보가 등록되었습니다!");
	return true;
}
function main() {
	alert("메인화면으로 이동합니다.");
	frm.reset;
}


</script>
</head>
<body>
<%@ include file = "includeMain.jsp" %>
<div>
<h2>생산관리 등록화면</h2>

</div>
<div>
<h4>생산관리 등록화면</h4>
	<form name="frm" method="post" action="insert" encType="multipart/form-data" onsubmit="return send()">
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
			<input type="submit" value="등록" style="width: 100px;height: 50px; 
			color: #fff; background-color: #c85179; border: 1 solid #fdeff2">
			
			<input type="button" value="메인화면" style="width: 100px; height:50px; 
			color: #fff; background-color: #c85179; border: 1 solid #fdeff2" onClick="main()">
		</td>
	</tr>
</table>
	</form>


</div>

</body>
</html>