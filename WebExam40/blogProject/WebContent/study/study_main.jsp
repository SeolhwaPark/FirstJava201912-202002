<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		
<div class="contain">
<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Study</h2>
			<br></div>
<c:if test="${!empty list3}">
		<c:forEach var="vo3" items="${list3}">
	<div class="titleimg">
		<img src=./upload/${vo3.fotoname} alt="">
	</div>
		</c:forEach>
</c:if>
	<br>
	<div class="content">
		
		<h2>Web Programming</h2>
		<br>
<c:if test="${!empty list}">
			<c:forEach var="vo" items="${list}">
		<ul>
			<li><a href="web_view?idx=${vo.idx}">
				<p class="title">${vo.subject}</p></a><br></li>
		</ul>
		</c:forEach>
</c:if>
		<br><br>
		
		<h2>UI Design</h2>
		<br>
<c:if test="${!empty list2}">
			<c:forEach var="vo2" items="${list2}">
		<ul>
			<li><a href="ui_view?idx=${vo2.idx}">
				<p class="title">${vo2.subject}</p></a><br></li>
		</ul>
		</c:forEach>
</c:if>
		<br><br>
		
	</div>
</div>
		
	<c:if test="${!empty list3}">
		<c:forEach var="vo3" items="${list3}">
			<c:if test="${'Seolhwa' eq sessionScope.id}">

				<div class="sub-view-bottom">
					<a href="study_modify?idx=${vo3.idx}" class="btn-modify">수정</a> 
					<a href="study_delete?idx=${vo3.idx}" class="btn-delete">삭제</a>
				</div>

			</c:if>
		</c:forEach>
	</c:if>

</div>
<%@ include file="../footer.jsp"%>
	
	