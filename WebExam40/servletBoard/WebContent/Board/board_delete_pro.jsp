<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	int row = (int)request.getAttribute("row");
	if(row ==1){
%>

<script>
	alert("삭제되었습니다.")
	opener.location.replace("board_list");
	self.close(); //현재 창을 닫아라
</script>

<%
	}else {
%>

<script>
	alert("오류 입니다.");
	history.back();
</script>

<%
	}
%>