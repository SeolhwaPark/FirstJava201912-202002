package model.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class guestDAO {
	private guestDAO() {
	}

	public static guestDAO instance = new guestDAO(); // 객체생성 싱글톤방식. 메모리에 저장되어 있응

	public static guestDAO getInstance() {// 메소드호출
		return instance;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jsl40", "1234");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 방명록 전체 자료 검색
	public List<guestVO> guestList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "select * from tbl_guest order by idx desc";

		// 리턴타입 정의
		List<guestVO> list = new ArrayList<guestVO>();

		try {
			conn = getConnection();// 자기가 자기 호출
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				guestVO vo = new guestVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
			list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt!= null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return list;

	}
	//글 등록 메소드 -1
	public void guestWrite(String name, String subject, String contents) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into tbl_guest(idx,subject,name,contents,regdate,readcnt) values(tbl_guest_seq_idx.nextval,?,?,?,sysdate,?)";
		//String query = "insert into tbl_guest values(?,?,?,?,?,?)"; //순서가 중요함
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,subject);
			pstmt.setString(2,name);
			pstmt.setString(3,contents);
			pstmt.setInt(4,0);
			
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!= null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//글 등록 메소드 -2
		public int guestWrite(guestVO vo) { //오버로딩
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			String query = "insert into tbl_guest(idx,subject,name,contents,regdate,readcnt) values(tbl_guest_seq_idx.nextval,?,?,?,sysdate,?)";
			//String query = "insert into tbl_guest values(?,?,?,?,?,?)"; //순서가 중요함
			int row = 0;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1,vo.getSubject());
				pstmt.setString(2,vo.getName());
				pstmt.setString(3,vo.getContents());
				pstmt.setInt(4,0);
				
				row = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstmt!= null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return row;
		}

		//기본키 (글번호)에 해당하는 글 추출하는 메소드
		public guestVO guestSelect(int idx) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String query = "select * from tbl_guest where idx=?";
			guestVO vo = new guestVO();
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, idx);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
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
				try {
					if (rs != null)
						rs.close();
					if (pstmt!= null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			return vo;
		}
		
		
		//게시글 조회수 증가 메소드
		public void guestReadcnt(int idx) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String query = "update tbl_guest set readcnt = readcnt +1 where idx=?";
			
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1,idx);
				pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstmt!= null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		//글 수정 메소드
		public int guestUpdate(guestVO vo) { 
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			String query = "update tbl_guest set subject=? ,contents=? where idx=?";
			int row = 0;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1,vo.getSubject());
				pstmt.setString(2,vo.getContents());
				pstmt.setInt(3,vo.getIdx());
				
				row = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstmt!= null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return row;
		}
		
		
		//삭제 메소드
		public int guestDelete(int idx) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String query = "delete from tbl_guest where idx=?";
			int row=0;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1,idx);
				row= pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstmt!= null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return row;
		}
		
		
		
		
		
}
