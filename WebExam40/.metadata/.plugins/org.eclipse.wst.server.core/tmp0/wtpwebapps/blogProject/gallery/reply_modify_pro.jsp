<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:if test = "${row==1}">
<script>
    alert("수정 되었습니다.");
    location.href ="every_view";
    </script>
</c:if>

<c:if test = "${row==0}">
<script>
    alert("수정 실패했습니다네...");
    history.back();
    </script>
</c:if>