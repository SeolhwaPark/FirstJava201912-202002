<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:if test = "${row==1}">
<script>
    alert("삭제되었습니다.");
    opener.location.replace("Board?command=board_list");
    self.close();
    </script>
</c:if>

<c:if test = "${row==0}">
<script>
    alert("비밀번호 오류입니다. 실패했습니다네...");
    history.back();
    </script>
</c:if>