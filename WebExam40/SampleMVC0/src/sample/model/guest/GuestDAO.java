package sample.model.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sample.util.DBManager;

public class GuestDAO {

	private GuestDAO() {

	}

	private static GuestDAO instance = new GuestDAO();

	public static GuestDAO getInstance() {
		return instance;
	}

	// 게시물 전체 카운트
	public int guestCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int row = 0;
		String query = "select count(*) as counter from tbl_guest";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				row = rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;

	}

	// 게시물 전체 리스트
	public List<GuestVO> guestList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<GuestVO> list = new ArrayList<GuestVO>();
		GuestVO vo = null;
		String query = "select * from tbl_guest";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new GuestVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 게시물 등록

	public int guestWrite(GuestVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "insert into tbl_guest(idx,name,subject,contents) values(tbl_guest_seq_idx.nextval,?,?,?)";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	// 특정게시물 보깅
		public GuestVO guestSelect(int idx) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<GuestVO> list = new ArrayList<GuestVO>();
			GuestVO vo = new GuestVO();
			String query = "select * from tbl_guest where idx=?";

			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, idx);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					vo = new GuestVO();
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setSubject(rs.getString("subject"));
					vo.setContents(rs.getString("contents"));
					vo.setRegdate(rs.getString("regdate"));
					vo.setReadcnt(rs.getInt("readcnt"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
			return vo;
		}
	
		
		//수정
		public int guestUpdate(GuestVO vo) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String query = "update tbl_guest set subject=? ,contents=? where idx=?";
			int row = 0;
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, vo.getSubject());
				pstmt.setString(2, vo.getContents());
				pstmt.setInt(3, vo.getIdx());
				
				row = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
			return row;
		}
		
		
		
		//삭제
		
		

}
