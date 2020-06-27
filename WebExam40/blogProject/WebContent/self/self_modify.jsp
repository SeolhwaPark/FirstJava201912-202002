<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Self Introduction</h2>
	</div>
	
	<div class="write-form">
		<table summery="글쓰기 테이블 입니다">
			<caption class="readonly">modify</caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
			<form name="my" method="post" action="self_modify" enctype="multipart/form-data" onsubmit="return formcheck();">


	<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
		<div class="contain">
	
			<input type = "hidden" name = "idx" value = "${vo.idx}">												
							
					<tr>
						<th>멘트</th>
						<td><input type="text" name="ment" value="${vo.ment}"></td>
					</tr>
					<tr>
						<th>자기소개</th>
						<td><input type="text" name="contents" value="${vo.contents}"></td>
					</tr>
					<tr>
						<th>자기소개2</th>
						<td><input type="text" name="contents2" value="${vo.contents2}"></td>
					</tr>
					<tr>
						<th>자기소개3</th>
						<td><input type="text" name="contents3" value="${vo.contents3}"></td>
					</tr>
					<tr>
						<th>자기소개4</th>
						<td><input type="text" name="contents4" value="${vo.contents4}"></td>
					</tr>
					<tr>
						<th>자기소개5</th>
						<td><input type="text" name="contents5" value="${vo.contents5}"></td>
					</tr>
					
		
			</c:forEach>
		</c:if>
						<td colspan="2">
							<input type="submit" value="수정" class="btn-write" onclick="javascript:send()">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='resume_list'">
						</td>
					</tr>
				</form>
			</tbody>
		</table>
	</div>
		
</div>
<script>
function send() {
	alert("수정합니다.")
	my.submit();
}

</script>


<%@ include file="../footer.jsp"%>















