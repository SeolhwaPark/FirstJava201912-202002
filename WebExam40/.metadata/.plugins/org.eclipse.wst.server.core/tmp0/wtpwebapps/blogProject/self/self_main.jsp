<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
		
<div class="contain">
<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Self</h2>
			<br></div>
	<div class="titleimg">
		<img src=./upload/${vo.fotoname} alt="박설화">
	</div>
	
	<br>
	<div class="content">
		<h2>학력</h2>
		<ul>
			<li>${vo.school}<br></li>
			<li>${vo.school2}<br></li>
			<li>${vo.school3}<br></li>
		</ul>
		<br><br>
		
		<h2>직력</h2>
		<ul>
			<li>${vo.job}<br></li>
			<li>${vo.job2}<br></li>
			<li>${vo.job3}<br></li>
			<li>${vo.job4}<br></li>
			<li>${vo.job5}<br></li>
			<li>${vo.job6}<br></li>
		</ul>
		<br><br>
		<h2>포트폴리오</h2>
		<a href="http://naver.com">포트폴리오 바로가기</a>
	</div>
</div>
		
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="self_main_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="self_main_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>
	
	</c:if>
	</c:forEach>
		</c:if>
</div>
<%@ include file="../footer.jsp"%>