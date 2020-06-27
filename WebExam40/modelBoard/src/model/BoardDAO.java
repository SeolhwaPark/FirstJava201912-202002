package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private BoardDAO() {
	}

	public static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "jsl40", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 전체 자료 검색
	public List<BoardVO> Search() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_board order by idx desc";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setPass(rs.getString("pass"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setIp(rs.getString("ip"));
				vo.setComments(rs.getInt("comments"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// 글 등록 메소드
	public void Insert(int idx, String pass, String name, String subject, String contents) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "insert into tbl_board(idx,pass,subject,name,contents,regdate,readcnt) "
				+ "values(tbl_board_seq_idx.nextval,?,?,?,?,sysdate,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, pass);
			pstmt.setString(2, subject);
			pstmt.setString(3, name);
			pstmt.setString(4, contents);
			pstmt.setInt(5, 0);

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

	// 글 등록 메소드 -2
	public int Insert(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "insert into tbl_board(idx,pass,subject,name,contents,regdate,readcnt) "
				+ "values(tbl_board_seq_idx.nextval,?,?,?,?,sysdate,?)";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, vo.getPass());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getContents());
			pstmt.setInt(5, 0);

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

	// 기본키 (글번호)에 해당하는 글 추출하는 메소드
	public BoardVO Select(int idx) {
		BoardVO vo = new BoardVO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_board where idx=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("Name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setIp(rs.getString("ip"));
				vo.setComments(rs.getInt("comments"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	// 게시글 조회수 증가 메소드
	public void Readcnt(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "update tbl_board set readcnt = readcnt +1 where idx =?";

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

	// 글 수정 메소드
	public int Update(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "update tbl_board set subject =? ,contents= ? where idx=?";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getIdx());
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

	// 삭제 메소드
	public int Delete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "delete from tbl_board where idx=?";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
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

}
