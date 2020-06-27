<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
function check() {
	if(my.reply.value==""){
		alert("내용을 입력하세요");
		return;
	}
	my.submit();
	
}

</script>
<div class="contain">
	<div class="sub-topcontent">
	<br>
		<h2 class="sub-view-title">${vo.subject}</h2>
		<p class="sub-view-wd">${vo.name}&nbsp;|&nbsp;${vo.regdate.substring(0,10)}</p>
	</div>
	<div class="sub-view-contnet">
	<br>
		<img src=./upload/${vo.fotoname} alt="">
		<p>${dao.lineBreak(vo.contents)}</p>
		<br><br>
	</div>
<br><br>	

<!-- 댓글만들기에 도전해봅시다...! -->
		<!-- 댓글 등록 -->
<%-- 		
<form name="my" method="post" action="every_view">

		<input type="hidden" name="parent" value="${vo.idx}">
		<input type="hidden" name="id" value="${sessionScope.id}">
		
	 --%>
<c:forEach var = "re" items="${list}">	

		<th>${re.id}&nbsp;</td>
		<td>${re.regdate}&nbsp;:&nbsp;</td>
		<td>${re.reply}<br>
		
<c:if test="${re.id eq sessionScope.id}">	
			<a href="reply_modify?idx=${vo.idx}" class="btn-modify">수정</a>
			<a href="reply_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
		</td>
	<br>
</c:if>
</c:forEach>
	<br><br>

<form name="my" method="post" action="every_view?idx=${vo.idx}">
	<table>
		<tr><th>Comment<br></th></tr>
		<br>
		
		<tr>
			<td width="200">작성자:${sessionScope.id}</td>
		</tr>
		<br>
		<input type="hidden" name="parent" value="${vo.idx}">
		
		<tr>
			<td colspan="3">
			<textarea rows="5" cols="60" name="reply" maxlength="500" placeholder="댓글을 달아주세요"></textarea></td>
			<td>			
			<a href="#" class="btn-write" onclick="check()">등록</a>
			</td>
		</tr>
	</table>
</form>
		<br>
		<br>
		
		<br>
<c:if test="${'Seolhwa' eq sessionScope.id}">	
	<div class="sub-view-bottom">
		<a href="every_write" class="btn-write">작성</a> 
		<a href="every_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="every_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>	
</c:if>
	

<%@ include file="../footer.jsp"%>

