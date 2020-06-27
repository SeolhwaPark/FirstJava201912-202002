<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Self Introduction</h2>
			<br></div>
			<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
			<div>
				<h2 class="sub-view-title">멘트</h2>
				<p class="sub-view-wd"></p>
				${vo.ment}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">자기소개</h2>
				<p class="sub-view-wd"></p>
				
				${vo.contents}<br>
				<br><br>
				
				${vo.contents2}<br>
				<br><br>
				${vo.contents3}<br>
				
				<br><br>
				${vo.contents4}<br>
				
				<br><br>
				${vo.contents5}<br>
				
				<br><br>
				<br><br>
			</div>
			
			
		
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="self_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="self_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>
	
	</c:if>
	</c:forEach>
		</c:if>


<%@ include file="../footer.jsp"%>















