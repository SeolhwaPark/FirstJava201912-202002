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
			<caption class="readonly">modify</caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
					<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
			<form name="my" method="post" action="web_modify" enctype="multipart/form-data" onsubmit="return send();">
			
					<input type = "hidden" name = "idx" value = "${vo.idx}">
					<tr>
						<th>작성자</th>
						<td><input type="text" name="name" value="${sessionScope.id}"></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject"  value="${vo.subject}"></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="contents">${vo.contents}</textarea></td>
					</tr>
					<tr>
						<th>첨부</th>
						<td><input type="file" name="fotoname">${vo.fotoname}</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="수정" class="btn-write">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='web_list'">
						</td>
					</tr>
				</form>
				
				</c:forEach>
		</c:if>
			</tbody>
		</table>
	</div>
		
</div>

<script>
	function send() {
	alert("수정합니다.")
	my.submit();
	return true;
	}
</script>

<%@ include file="../footer.jsp"%>















