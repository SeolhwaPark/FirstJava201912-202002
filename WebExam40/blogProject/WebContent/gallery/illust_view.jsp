<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contain">
	<div class="sub-topcontent">
	<br>
		<h2 class="sub-view-title">${vo.subject}</h2>
		<p class="sub-view-wd">${vo.name} | ${vo.regdate.substring(0,10)}</p>
	</div>
	<div class="sub-view-contnet">
	<br>
		<img src=./upload/${vo.fotoname} alt="">
		<p>${dao.lineBreak(vo.contents)}</p>
		<br><br>
	</div>
	
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="illust_write" class="btn-write">작성</a> 
		<a href="illust_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="illust_delete?idx=${vo.idx}" class="btn-delete">삭제</a>
	</div>
	
	</c:if>

<%@ include file="../footer.jsp"%>
