package replyModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ReDAO {
	private ReDAO() {}
	private static ReDAO instance = new ReDAO();
	public static ReDAO getInstance() {
		return instance;
	}
	//커넥션풀
	public Connection getConnection() {
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
	
	
	//리플테이블의 idx로 한개의 데이터 가져오기
	public ReVO getOne(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_reply where idx=?";
		ReVO vo = new ReVO();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString("id"));
				vo.setParent(rs.getInt("parent"));
				vo.setReply(rs.getString("reply"));
				vo.setRegdate(rs.getString("regdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
	
	//댓글입력
	public int replyWrite(ReVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into blog_reply(IDX, ID, PARENT, REPLY, REGDATE) values(blog_reply_seq_idx.nextval,?,?,?,sysdate)";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getId());
			pstmt.setInt(2, vo.getParent());
			pstmt.setString(3, vo.getReply());
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	//댓글 뷰
	public List<ReVO> replyList(int parent) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_reply where parent=?";
		List<ReVO> list = new ArrayList<ReVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, parent);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ReVO vo = new ReVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString("id"));
				vo.setParent(rs.getInt("parent"));
				vo.setReply(rs.getString("reply"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<ReVO> replyList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_reply";
		List<ReVO> list = new ArrayList<ReVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ReVO vo = new ReVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString("id"));
				vo.setParent(rs.getInt("parent"));
				vo.setReply(rs.getString("reply"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	//댓글수카운트
	public int replyCount(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) from blog_reply where parent=?";
		int cnt = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	
	
	//댓글수정
	public int replyModify(ReVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update blog_reply set ID=?, PARENT=?, REPLY=?, REGDATE=? where idx=?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getId());
			pstmt.setInt(2, vo.getParent());
			pstmt.setString(3, vo.getReply());
			pstmt.setString(4, vo.getRegdate());
			pstmt.setInt(5, vo.getIdx());
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	
	//댓글삭제
	public int replyDelete(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "delete from blog_reply where idx=?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	
	
}
