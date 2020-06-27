<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.*" %>

<%-- <%
	InsertBean insert 1 = new InsertBean();
	insert1.setUserid(request.getParameter("userid"));
	
%> --%>

<jsp:useBean id = "insert" class = "model.InsertBean">
<jsp:setProperty name = "insert" property = "*"/>
</jsp:useBean>

<%
	insert.setRegdate("2020-02-26");
%>
아이디: <%= insert.getUserid() %><br>
이름: <%= insert.getName() %><br>
이메일: <%= insert.getEmail() %><br>
등록일짜: <%= insert.getRegdate()%><br>
