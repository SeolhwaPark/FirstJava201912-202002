<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Study</h2>
	</div>
	
	<div class="write-form">
		<table summery="글쓰기 테이블 입니다">
			<caption class="readonly">input</caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
			<form name="my" method="post" action="ui_write" enctype="multipart/form-data" onsubmit="return formcheck();">
					<tr>
						<th>작성자</th>
						<td><input type="text" name="name" value="${sessionScope.id}"></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject"></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="contents"></textarea></td>
					</tr>
					<tr>
						<th>첨부</th>
						<td><input type="file" name="fotoname"></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="등록" class="btn-write">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='ui_list'">
						</td>
					</tr>
				</form>
			</tbody>
		</table>
	</div>
		
</div>

<script>
	function formcheck() {
		if(my.subject.value=="") {
			alert("제목입력하세요");
			my.subject.focus();
			return false;
		}
		
		if(my.contents.value=="") {
			alert("내용입력하세요");
			my.contnets.focus();
			return false;
		}
	
	alert("등록합니다.")
	my.submit();
	return true;
	}
</script>

<%@ include file="../footer.jsp"%>















