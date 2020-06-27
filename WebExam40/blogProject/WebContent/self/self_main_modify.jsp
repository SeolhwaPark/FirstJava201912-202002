<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Resume Main</h2>
	</div>
	
	<div class="write-form">
		<table summery="수정 테이블 입니다">
			<caption class="readonly">modify</caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
			<form name="my" method="post" action="self_main_modify" enctype="multipart/form-data">
			
			<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
			<input type = "hidden" name = "idx" value = "${vo.idx}">												
							
					<tr>
						<th>학력</th>
						<td><input type="text" name="school" value="${vo.school}"></td>
					</tr>
					<tr>
						<th>학력2</th>
						<td><input type="text" name="school2" value="${vo.school2}"></td>
					</tr>
					<tr>
						<th>학력3</th>
						<td><input type="text" name="school3" value="${vo.school3}"></td>
					</tr>
					<tr>
						<th>학력4</th>
						<td><input type="text" name="school4" value="${vo.school4}"></td>
					</tr>
					
					<tr>
						<th>직력</th>
						<td><input type="text" name="job" value="${vo.job}"></td>
					</tr>
					<tr>
						<th>직력2</th>
						<td><input type="text" name="job2" value="${vo.job2}"></td>
					</tr>
					<tr>
						<th>직력3</th>
						<td><input type="text" name="job3" value="${vo.job3}"></td>
					</tr>
					<tr>
						<th>직력4</th>
						<td><input type="text" name="job4" value="${vo.job4}"></td>
					</tr>
					<tr>
						<th>직력5</th>
						<td><input type="text" name="job5" value="${vo.job5}"></td>
					</tr>
					<tr>
						<th>직력6</th>
						<td><input type="text" name="job6" value="${vo.job6}"></td>
					</tr>
					<tr>
						<th>직력7</th>
						<td><input type="text" name="job7" value="${vo.job7}"></td>
					</tr>
					<tr>
						<th>직력8</th>
						<td><input type="text" name="job8" value="${vo.job8}"></td>
					</tr>
					
					<tr>
						<th>첨부</th>
						<td><input type="file" name="fotoname">${vo.fotoname}</td>
					</tr>
					
		
			</c:forEach>
		</c:if>
						<td colspan="2">
							<input type="submit" value="수정" class="btn-write" onclick="javascript:send()">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='self_main'">
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

