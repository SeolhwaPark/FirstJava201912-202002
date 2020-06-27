package board;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.util.DBManager;

public class BoardDAO {
	DBManager manager = DBManager.getInstance();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 메소드정의
	// 게시글 전체 카운트
	public int boardCount() {
		String query = "select count(*) as counter from tbl_board";
		int cnt = 0;
		try {
			con = manager.getConnection();
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

	// 게시물 전체 목록 메소드
	public List<BoardVO> boardList() {
		String query = "select * from tbl_board order by idx desc";
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	// 게시글 등록

	public int boardWrite(BoardVO vo) {
		String query = "insert into tbl_board(idx,name,email,subject,contents,pass)"
				+ "values(tbl_board_seq_idx.nextval,?,?,?,?,?)";
		int row = 0;
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getSubject());
			pstmt.setString(4, vo.getContents());
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	// 특정 게시글 조회수 증가
	// 특정 게시글 선택
	public void boardCntUp(int idx) {
		String query = "update tbl_board set readcnt = readcnt+1 where idx=?";

		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();

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
	}

	// 특정 게시글 선택
	public BoardVO boardSelect(int idx) {
		String query = "select * from tbl_board where idx=?";
		BoardVO vo = new BoardVO();
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
	// 수정

	public int boardModify(BoardVO vo) {
		String query = "update tbl_board set email=? ,subject=?, contents=? where idx=? and pass=?";
		int row = 0;
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;

	}

	// 삭제
	public int boardDelete(int idx, String pass) {
		String query = "delete from tbl_board where idx=? and pass=?";
		int row = 0;
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
	public List<BoardVO> boardList(String search, String key) {
		// String query = "select * from tbl_board where ? like ? order by idx desc";
		String query = "select * from tbl_board where " + search + " like '%" + key + "%' order by idx desc";

		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// 검색건수

	public int boardCount(String search, String key) {
		// String query = "select * from tbl_board where ? like ? order by idx desc";
		String query = "select count(*) as counter from tbl_board where " + search + " like ?";
		int cnt = 0;
		try {
			con = manager.getConnection();
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
	public List<BoardVO> boardList(int pagestart, int endpage) {
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from tbl_board order by regdate desc) A " + "where rownum <= ?) X where X.rnum >?"; // 엔드 ?
																												// 스타트?
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// 게시글 중 조건에 맞는 게시글 카운트 메소드
	public int boardCount(String s_query) {
		// String query = "select * from tbl_board where ? like ? order by idx desc";
		String query = "select count(*) as counter from tbl_board where " + s_query;
		int cnt = 0;
		try {
			con = manager.getConnection();
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
	public List<BoardVO> boardList(String s_query, int pagestart, int endpage) {
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from tbl_board order by regdate desc) A " + "where " + s_query
				+ " and rownum <= ?) X where " + s_query + " and X.rnum>?";
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
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
				if (con != null)
					con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
