package memberModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private MemberDAO() {}
	
	private static MemberDAO insttance = new MemberDAO();
	public static MemberDAO getInstance() {
		return insttance;
	}
	
	public Connection getConnection() { // 커넥션풀 이용
		Connection con = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	//회원가입
	public int memberJoin(MemberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "INSERT INTO TBL_EX_MEMBER (NAME, USERID, PWD, SCRTNOCONFIRM, "
				+ "MBRCLCD, POSCDDATA, POSCD, POSTNAME, PHONENO1, PHONENO2, PHONENO3, " 
				+ " EMAIL, ZIPNO, ADDR, DETLADDR) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		/*
		 * NAME USERID PWD SCRTNOCONFIRM MBRCLCD POSCDDATA POSCD POSTNAME TELNO1 TELNO2
		 * TELNO3 PHONENO1 PHONENO2 PHONENO3 EMAIL ZIPNO ADDR DETLADDR
		 */
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getUserid());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getScrtNoConfirm());
			pstmt.setInt(6, vo.getMbrClCd());
			pstmt.setInt(7, vo.getPosCdData());
			pstmt.setInt(8, vo.getPosCd());
			pstmt.setString(9, vo.getPosName());
			pstmt.setInt(10, vo.getPhoneNo1());
			pstmt.setInt(11, vo.getPhoneNo2());
			pstmt.setInt(12, vo.getPhoneNo3());			
			pstmt.setString(13, vo.getEmail());
			pstmt.setInt(14, vo.getZipNo());			
			pstmt.setString(15, vo.getAddr());
			pstmt.setString(16, vo.getDetladdr());
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
}
