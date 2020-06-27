<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Seolhwa's Resume</h2>
			<br></div>
			<c:if test="${!empty list}">
		<c:forEach var= "vo" items="${list}">
			
			<div>
				<h2 class="sub-view-title">학력</h2>
				<p class="sub-view-wd"></p>
				${vo.school}<br>
				${vo.school2}<br>
				${vo.school3}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">인턴</h2>
				<p class="sub-view-wd"></p>
				${vo.intern}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">직무</h2>
				<p class="sub-view-wd"></p>
				${vo.job}<br>
				${vo.job2}<br>
				${vo.job3}<br>
				${vo.job4}<br>
				${vo.job5}<br>
				${vo.job6}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">사무능력</h2>
				<p class="sub-view-wd"></p>
				${vo.skill}<br>
				${vo.skill2}<br>
				${vo.skill3}<br>
				${vo.skill4}<br>
				${vo.skill5}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">자격증</h2>
				<p class="sub-view-wd"></p>
				${vo.qualifications}<br>
				${vo.qualifications2}<br>
				${vo.qualifications3}<br>
				${vo.qualifications4}<br>
				<br><br>
				<br><br>
			</div>
			<div>
				<h2 class="sub-view-title">언어능력</h2>
				<p class="sub-view-wd"></p>
				${vo.languages}<br>
				${vo.languages2}<br>
				${vo.languages3}<br>
				<br><br>
				<br><br>
			</div>
		
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="resume_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="resume_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>
	
	</c:if>
	</c:forEach>
		</c:if>


<%@ include file="../footer.jsp"%>















