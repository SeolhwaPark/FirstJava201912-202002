<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:if test="${!empty idx}">
<script>
	alert("삭제되었습니다.")
	location.href ="diary_list";
</script>
</c:if>
<c:if test="${empty idx}">
<script>
	alert("오류 입니다.");
	history.back();
	
</script>
</c:if>