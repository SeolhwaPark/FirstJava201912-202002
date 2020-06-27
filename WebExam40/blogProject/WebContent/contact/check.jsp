<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<c:if test = "${!empty sessionScope.id}">
<script>
	alert("전송되었습니다. ");
	location.href = "index";
</script>
</c:if>

<c:if test = "${empty sessionScope.id}">
<script>
	alert("전송에 실패했습니다. ");
	history.back();
</script>
</c:if>