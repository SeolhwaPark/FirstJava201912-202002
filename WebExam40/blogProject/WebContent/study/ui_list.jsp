<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">UI design</h2>


		<div class="sub-search">
			<form name="my" method="post" action="ui_list" onsubmit="return check()">
				<font size="2" face="고딕">전체 : <b>${totcount}</b>건 - ${page }/ ${totpage } Pages</font>
			</form>
		</div>
	</div>
			
<c:if test="${!empty list}">
<c:forEach var= "vo" items="${list}">
		<ul class="sub-port-content">
			<li>
				<span class="date">${vo.regdate.substring(0,10)}</span>
				<div class="text-wrap">
					<div class="img-wrap">
						<img src=./upload/${vo.fotoname} alt="">
					</div>
					<div class="text-body">
						<span>No.${vo.idx}</span> | <span class="">
						<i class="fa fa-eye"></i> ${vo.readcnt}</span>
						<a href="ui_view?idx=${vo.idx}">
							<p class="title">${vo.subject}</p>
						</a>
					</div>
				</div>
			</li>
		</ul>
			</c:forEach>
		</c:if>
		
			${pageSkip}
			
				
	<c:if test="${'Seolhwa' eq sessionScope.id}">
	
	<div class="sub-view-bottom">
		<a href="ui_write" class="btn-write">작성</a> 
		<%-- <a href="web_modify?idx=${vo.idx}" class="btn-modify">수정</a>
		<a href="web_delete?idx=${vo.idx}" class="btn-delete">삭제</a> --%>
	</div>
	
	</c:if> 
</div>

<%@ include file="../footer.jsp"%>















