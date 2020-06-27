package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PdsDAO {
	private PdsDAO() {
	}

	private static PdsDAO instance = new PdsDAO();

	public static PdsDAO getInstance() {
		return instance;

	}
	/*
	 * 커넥션풀 이용 안했을떄 public static Connection getConnection() { Connection conn =
	 * null; try { Class.forName("oracle.jdbc.OracleDriver"); conn =
	 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jsl40",
	 * "1234");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return conn; }
	 */

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

	// 리스트 구하기
	public List<PdsVO> pdsList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from pds order by idx desc";
		List<PdsVO> list = new ArrayList<PdsVO>();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsVO vo = new PdsVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setPass(rs.getString("pass"));
				vo.setEmail(rs.getString("email"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setFilename(rs.getString("filename"));
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
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// 전체 게시물 카운트
	public int pdsCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) counter from pds";
		int totcount = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
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

	// 작성
	public int pdsWrite(PdsVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "insert into pds values(pds_seq_idx.nextval,?,?,?,?,?,sysdate,0,?)";
		int row = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getSubject());
			pstmt.setString(5, vo.getContents());
			pstmt.setString(6, vo.getFilename());
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	// 내용 보기

	public PdsVO pdsView(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from pds where idx=" + idx + " order by idx desc";
		int cnt = 0;
		PdsVO vo = null;
		try {
			vo = new PdsVO();
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setIdx(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				String email = rs.getString(4);
				if (email.length() < 1)
					email = "";

				vo.setEmail(email);
				vo.setSubject(rs.getString(5));
				vo.setContents(rs.getString(6));
				vo.setRegdate(rs.getString(7));
				vo.setReadcnt(rs.getInt(8));
				String filename = rs.getString(9);
				if (filename.length() < 1)
					filename = "";
				vo.setFilename(filename);
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
		return vo;
	}

	// pds조회
	public void pdsCntUp(int idx) {
		String query = "update pds set readcnt=readcnt+1 where idx=?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 특정 게시글조회
	public PdsVO pdsSelect(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from pds where idx=" + idx + " order by idx desc";
		int cnt = 0;
		PdsVO vo = null;
		try {
			vo = new PdsVO();
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setIdx(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPass(rs.getString(3));
				String email = rs.getString(4);
				if (email.length() < 1)
					email = "";

				vo.setEmail(email);
				vo.setSubject(rs.getString(5));
				vo.setContents(rs.getString(6));
				vo.setRegdate(rs.getString(7));
				vo.setReadcnt(rs.getInt(8));
				String filename = rs.getString(9);
				if (filename.length() < 1)
					filename = "";
				vo.setFilename(filename);
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
		return vo;
	}

	// 수정
	public int pdsModify(PdsVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update pds set email=? ,subject=?, contents=? where idx=?";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getEmail());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			pstmt.setInt(4, vo.getIdx());
			pstmt.setString(5, vo.getPass());
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
		return row;
	}

	// 삭제
	public int pdsDelete(int idx, String pass) {
		String query = "delete from pds where idx=? and pass=?";
		int row = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	// 줄바꿈
	public String lineBreak(String str) {
		StringBuffer buf = new StringBuffer();
		for (int x = 0; x < str.length(); x++) {
			if (str.charAt(x) == '\n') {
				buf.append("<br>");// 줄바꿈 기능 추가
			} else {
				buf.append(str.charAt(x));
			}
		}
		return new String(buf);
	}

	// 게시글 검색조건에 맞는 목록 불러오기
	public List<PdsVO> PdsList(String search, String key) {
		// String query = "select * from pds where ? like ? order by idx desc";
		String query = "select * from pds where " + search + " like '%" + key + "%' order by idx desc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<PdsVO> list = new ArrayList<PdsVO>();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsVO vo = new PdsVO();
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
		return list;
	}
	// 검색건수

	public int pdsCount(String search, String key) {
		// String query = "select * from tbl_board where ? like ? order by idx desc";
		String query = "select count(*) as counter from pds where " + search + " like ?";
		int cnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
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
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

	// 게시물 페이지 시작과 끝
	public List<PdsVO> pdsList(int pagestart, int endpage) {
		String query = "select X.* from (select rownum rnum, A.* from(" + "select * from pds order by regdate desc) A "
				+ "where rownum <= ?) X where X.rnum >?"; // 엔드 ? 스타트?
		List<PdsVO> list = new ArrayList<PdsVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsVO vo = new PdsVO();
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
		return list;
	}

	// 게시글 중 조건에 맞는 게시글 카운트 메소드
	public int pdsCount(String s_query) {
		// String query = "select * from tbl_board where ? like ? order by idx desc";
		String query = "select count(*) as counter from pds where " + s_query;
		int cnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
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
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}	

	// 검색조건이 왔을 때의 전체목록
	public List<PdsVO> pdsList(String s_query, int pagestart, int endpage) {
		String query = "select X.* from (select rownum rnum, A.* from(" + "select * from pds order by regdate desc) A "
				+ "where " + s_query + " and rownum <= ?) X where " + s_query + " and X.rnum>?";
		List<PdsVO> list = new ArrayList<PdsVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsVO vo = new PdsVO();
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
		return list;
	}
}
