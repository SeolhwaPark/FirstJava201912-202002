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
	String code = request.getParameter("code");/*정보 받아오기*/
	String pname = request.getParameter("pname");/*정보 받아오기*/
	int cost = Integer.parseInt(request.getParameter("cost"));
	int pnum = Integer.parseInt(request.getParameter("pnum"));
	int jnum = Integer.parseInt(request.getParameter("jnum"));
	int sale = Integer.parseInt(request.getParameter("sale"));
	String gcode = request.getParameter("gcode");/*정보 받아오기*/
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int row =0;
	
	try {
		/*1 드라이버로딩*/
		Class.forName(myDriver);
		/*2 커넥션연결*/
		conn = DriverManager.getConnection(myURL, myID,  myPass);
		
		String query = "update tbl_product set cost=?,pnum=?,jnum=?,sale=?,gcode=? where code=?";
		
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1,cost);
		pstmt.setInt(2,pnum);
		pstmt.setInt(3,jnum);
		pstmt.setInt(4,sale);
		pstmt.setString(5,gcode);
		pstmt.setString(6,code);
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
alert("수정처리가 완료되었습니다. ");
location.href="select.jsp";
</script>
<%
	}else{//실패
%>
<script>
alert("수정 실패했습니다. ");
history.back();
</script>
<%
	}
%>