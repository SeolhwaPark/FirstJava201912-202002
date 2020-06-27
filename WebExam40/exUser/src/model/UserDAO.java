package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {

	public UserDAO() {//싱글톤맨들기
		
	}
	private static UserDAO instance = new UserDAO();
	private static UserDAO getInstance() {
		return instance;
	}
	
	//커넥션 풀
	public Connection getConnection() { // 커넥션풀 이용
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	//메소드 구현
	
	//전체 회원수 카운트
	public int userCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) counter from userbl";
		int totcount = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				totcount = rs.getInt("counter");
			}
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
		return totcount;
	}

	//회원등롥
	public boolean UserInsert(UserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into usertbl(idx,name,userid,passwd,tel,email,first_time,last_time) "
				+ "values(tbl_member_seq_idx.nextval,?,?,?,?,?,?,?,?)";
		boolean flag = false;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,vo.getName());
			pstmt.setString(2,vo.getUserid());
			pstmt.setString(3,vo.getPasswd());
			pstmt.setString(4,vo.getTel());
			pstmt.setString(5,vo.getEmail());
			pstmt.setString(6,vo.getFirst_time());
			pstmt.setString(7,vo.getLast_time());
			flag = pstmt.execute();
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public int UserIdCheck(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select count(*) from usertbl where userid = ?";
		int row = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
}
