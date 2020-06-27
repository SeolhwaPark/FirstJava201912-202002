<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>
	
	<div class="indexgallery">
			<div class="indextitle">
				<h2>Seolhwa's<br>Gallery</h2>
				<span><a href="gallery_main">MORE</a></span>
			</div>
<c:if test="${!empty list}">
<c:forEach var="vo" items="${list}">
			<ul>
				<li><img src=./upload/${vo.fotoname} alt=""></a></li>
			</ul>
</c:forEach>
</c:if>
	</div>
	
	
	<div class="bbs_wrap">
		<div class="bbs_left">
			<h2 class="title">Study</h2>
			<ul>
				<li><a href="study_main"></a></li>
			</ul>
			<a href="study_main"><span class="fa fa-plus plus"></span></a>
		</div>
		<div class="bbs_right">
			<h2 class="title">Diary</h2>
			<ul>
				<li><a href="diary_list"></a></li>
				<input type="hidden" name="idx">
			</ul>
			<a href="diary_list"><span class="fa fa-plus plus"></span></a>
		</div>
	</div>
	
<%@ include file="footer.jsp" %>













