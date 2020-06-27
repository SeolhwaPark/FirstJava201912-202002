package selfModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SelfDAO {
	private SelfDAO() {
	}

	private static SelfDAO instance = new SelfDAO();

	public static SelfDAO getInstance() {
		return instance;
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
	
	//리스트
	public List<SelfVO> selfList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_self";
		List<SelfVO> list = new ArrayList<SelfVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SelfVO vo = new SelfVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setMent(rs.getString("ment"));
				vo.setContents(rs.getString("contents"));
				vo.setContents2(rs.getString("contents2"));
				vo.setContents3(rs.getString("contents3"));
				vo.setContents4(rs.getString("contents4"));
				vo.setContents5(rs.getString("contents5"));
				vo.setFotoname(rs.getString("fotoname"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//리스트222222222222222
	public List<SelfVO> selfList(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_self where idx=?";
		List<SelfVO> list = new ArrayList<SelfVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SelfVO vo = new SelfVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setMent(rs.getString("ment"));
				vo.setContents(rs.getString("contents"));
				vo.setContents2(rs.getString("contents2"));
				vo.setContents3(rs.getString("contents3"));
				vo.setContents4(rs.getString("contents4"));
				vo.setContents5(rs.getString("contents5"));
				vo.setFotoname(rs.getString("fotoname"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	//수정
	public int selfModify(SelfVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query =  "update blog_self set ment=?, contents=?, "
				+ "contents2=?, contents3=?, contents4=?, contents5=?, "
				+ "fotoname=? where idx=?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getMent());
			pstmt.setString(2, vo.getContents());
			pstmt.setString(3, vo.getContents2());
			pstmt.setString(4, vo.getContents3());
			pstmt.setString(5, vo.getContents4());
			pstmt.setString(6, vo.getContents5());
			pstmt.setInt(7, vo.getIdx());
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	//삭제
	public int selfDelete(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query =  "delete from blog_self where idx=?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	
	
	
	
}
