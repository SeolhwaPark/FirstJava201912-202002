<%@page import="java.sql.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	/*연결 */
	request.setCharacterEncoding("utf-8");
	String myDriver = "oracle.jdbc.OracleDriver";
	String myURL = "jdbc:oracle:thin:@//localhost:1521/xe";
	String myID = "jsl40";
	String myPass = "1234";
%>
<%
	String gcode = request.getParameter("gcode");/*정보 받아오기*/
	String gname = request.getParameter("gname");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int row =0;
	
	try {
		/*1 드라이버로딩*/
		Class.forName(myDriver);
		/*2 커넥션연결*/
		conn = DriverManager.getConnection(myURL, myID,  myPass);
		
		String query = "update tbl_groupcode set gname=? where trim(gcode)=?";
		
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1,gname);
		pstmt.setString(2,gcode);
		row = pstmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	if(row ==1){ //성공
%>

<script>
alert("등록 완료했습니다. ");
location.href="gselect.jsp";
</script>
<%
	}else{//실패
%>
<script>
alert("등록 실패했습니다. ");
history.back();
</script>
<%
	}
%>