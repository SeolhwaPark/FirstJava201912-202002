<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty sessionScope.id }">
	<script>
		alert("로그인하시면 열람이 가능합니다.");
		location.href = "./login";
	</script>
</c:if>
<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Diary</h2>
			<br></div>
			<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
			<div><br>
				<h2 class="sub-view-title">${vo.subject}</h2>
				<p class="sub-view-wd">${vo.name}  ${vo.regdate.substring(0,10)}</p>
			</div>
			<div class="sub-view-contnet">
			<img src=./upload/${vo.fotoname} alt="">
				<p>${vo.contents}</p>
			</div>
			<br>
				 ${pageSkip}
	
			<br>
			<br>
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="diary_write" class="btn-write">작성</a> 
		<a href="diary_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="diary_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>
	
	</c:if>
	</c:forEach>
		</c:if>


<%@ include file="../footer.jsp"%>















