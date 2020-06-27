<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		.btn-group{text-align: center}
		
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
		if(insert.pname.value==""){
			alert("제품이름이 입력되지 않았습니다.");
			insert.pname.focus();
			return false;
		}
		if(insert.cost.value==""){
			alert("제품원가가 입력되지 않았습니다.");
			insert.cost.focus();
			return false;
		}
		if(insert.pnum.value==""){
			alert("목표수량이 입력되지 않았습니다.");
			insert.pnum.focus();
			return false;
		}
		if(insert.jnum.value==""){
			alert("재고수량이 입력되지 않았습니다.");
			insert.jnum.focus();
			return false;
		}
		if(insert.sale.value==""){
			alert("출고가가 입력되지 않았습니다.");
			insert.sale.focus();
			return false;
		}
		if(insert.gcode.selectedIndex == 0){
			alert("그룹코드가 선택되지 않았습니다.");
			insert.gcode.focus();
			return false;
		}
		alert("등록합니다.");
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
		<h2 class="title" >생산관리 등록 화면</h2>
		<div class="contents">
	
			<form name="insert" method="post" action="insert_pro.jsp">
			
			<table>
				<tr>
					<th class="thh">제품코드</th>
					<td class="tdd"><input type="text" name="code"></td>
				</tr>
				<tr>
					<th class="thh">제품이름</th>
					<td class="tdd"><input type="text" name="pname" ></td>
				</tr>
				<tr>
					<th class="thh">제품원가</th>
					<td class="tdd"><input type="text" name="cost"></td>
				</tr>
				<tr>
					<th class="thh">목표수량</th>
					<td class="tdd"><input type="text" name="pnum"></td>
				</tr>
				<tr>
					<th class="thh">재고수량</th>
					<td class="tdd"><input type="text" name="jnum"></td>
				</tr>				
				<tr>
					<th class="thh">출고가</th>
					<td class="tdd"><input type="text" name="sale"></td>
				</tr>				
				<tr>
				
					
					<th class="thh">그룹이름</th>
					<td class="tdd">
						<select name="gcode">
							<option value="">그룹선택</option>
							<option value="A">컴퓨터</option>
							<option value="B">냉장고</option>
							<option value="C">냉장소모품</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" class="btn_group">
						<input type="button" value="등록하기" style="width: 75; color: #fff; 
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