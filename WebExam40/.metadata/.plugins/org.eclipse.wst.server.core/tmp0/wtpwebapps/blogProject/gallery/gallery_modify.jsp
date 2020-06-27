<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Gallery</h2>
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
			<form name="my" method="post" action="gallery_modify" enctype="multipart/form-data" onsubmit="return send();">
			
					<input type = "hidden" name = "idx" value = "${vo.idx}">
						<th>첨부</th>
						<td><input type="file" name="fotoname">${vo.fotoname}</td>
					</tr>
					<tr>
					<br>
						<td colspan="2">
							<input type="submit" value="수정" class="btn-write">
							<input type="button" value="목록"  class="btn-reset" onclick="javascript:location.href='gallery_main'">
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

