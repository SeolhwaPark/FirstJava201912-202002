<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../header.jsp"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:if test="${empty sessionScope.id }">
<script>
alert("로그인하시면 작성가능합니다.");
location.href="login";
</script>
</c:if>
<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">Contact</h2>
	</div>
	
	<div class="write-form">
		<table summery="글쓰기 테이블 입니다">
			<caption class="readonly">문의사항 </caption>			
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>
			<form name="my" method="post" action="contact_email" enctype="multipart/form-data" onsubmit="return formcheck();">
					<tr>
						<th>작성자</th>
						<td><input type="text" name="name" value="${sessionScope.id}"></td>
					</tr>
					<tr>
						<th>이메일주소</th>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject"></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="contents"></textarea></td>
					</tr>
					<tr>
						<th>첨부</th>
						<td><input type="file" name="fotoname"></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="전송" class="btn-write">
						</td>
					</tr>
				</form>
			</tbody>
		</table>
	</div>
		
</div>

<script>
	function formcheck() {
		if(my.name.value=="") {
			alert("작성자명을 입력하세요");
			my.name.focus();
			return false;
		}
		if(my.subject.value=="") {
			alert("제목을 입력하세요");
			my.subject.focus();
			return false;
		}
		if(my.contents.value=="") {
			alert("내용을 입력하세요");
			my.contnets.focus();
			return false;
		}
		return true;
	}
</script>

<%@ include file="../footer.jsp"%>

