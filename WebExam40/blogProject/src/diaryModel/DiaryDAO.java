package diaryModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DiaryDAO {
	private DiaryDAO() {
	}

	private static DiaryDAO instance = new DiaryDAO();

	public static DiaryDAO getInstance() {
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

	// 입력
	public int diaryWrite(DiaryVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "INSERT INTO blog_diary"
				+ "(idx, subject, contents, fotoname, name, regdate) "
				+ "VALUES(blog_seq_idx.nextval, ?, ?, ?, ?, sysdate)";
		int row = 0;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setString(3, vo.getFotoname());
			pstmt.setString(4, vo.getName());
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

	// 다이어리 뷰
	public List<DiaryVO> diaryList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_diary";
		List<DiaryVO> list = new ArrayList<DiaryVO>();

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
				vo.setRegdate(rs.getString("regdate"));
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
	// 다이어리 뷰2222222
		public List<DiaryVO> diaryList(int idx) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select * from blog_diary where idx=?";
			List<DiaryVO> list = new ArrayList<DiaryVO>();

			try {
				con = getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, idx);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					DiaryVO vo = new DiaryVO();
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setSubject(rs.getString("subject"));
					vo.setContents(rs.getString("contents"));
					vo.setFotoname(rs.getString("fotoname"));
					vo.setRegdate(rs.getString("regdate"));
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
	// 수정
	public int diaryModify(DiaryVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update blog_diary set subject=?, contents=?, "
				+ "fotoname=? where idx=?";
		int row = 0;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setString(3, vo.getFotoname());
			pstmt.setInt(4, vo.getIdx());
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

	// 삭제
	public int diaryDelete(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "delete from blog_diary where idx=?";
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
	
	
	// 게시글 검색조건에 맞는 목록 불러오기
	public List<DiaryVO> diaryList(String search, String key) {
		String query = "select * from blog_diary where " + search + " like '%" + key 
						+ "%' order by idx desc";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DiaryVO> list = new ArrayList<DiaryVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
				vo.setRegdate(rs.getString("regdate"));
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

	// 검색건수
	public int diaryCount(String search, String key) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// String query = "select * from blog_diary where ? like ? order by idx desc";
		String query = "select count(*) as counter from blog_diary where " + search + " like ?";
		int cnt = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt("counter");
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
		return cnt;
	}

	// 게시물 페이지 시작과 끝
	public List<DiaryVO> diaryList(int pagestart, int endpage) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from blog_diary order by regdate desc) A " 
				+ "where rownum <= ?) X where X.rnum >?"; // 엔드 ?
																													// 스타트?
		List<DiaryVO> list = new ArrayList<DiaryVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
				vo.setRegdate(rs.getString("regdate"));
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

	// 게시글 중 조건에 맞는 게시글 카운트 메소드
	public int diaryCount(String s_query) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// String query = "select * from blog_diary where ? like ? order by idx desc";
		String query = "select count(*) as counter from blog_diary" + s_query;
		int cnt = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt("counter");
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
		return cnt;
	}

	// 검색조건이 왔을 때의 전체목록
	public List<DiaryVO> diaryList(String s_query, int pagestart, int endpage) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from blog_diary order by regdate desc) A " + "where " + s_query
				+ " and rownum <= ?) X where " + s_query + " and X.rnum>?";
		List<DiaryVO> list = new ArrayList<DiaryVO>();

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
				vo.setRegdate(rs.getString("regdate"));
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
}