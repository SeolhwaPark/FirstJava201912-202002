package studyModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class WebDAO {
	private WebDAO() {
	}

	private static WebDAO instance = new WebDAO();

	public static WebDAO getInstance() {
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
	public int webWrite(WebVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into blog_web(idx,name,subject,contents,fotoname,regdate,readcnt)"
				+ " VALUES(blog_seq_idx.nextval, ?, ?, ?, ?, sysdate, 0)";
		int row = 0;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			pstmt.setString(4, vo.getFotoname());
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

	// 리스트

	public List<WebVO> webList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_web";
		List<WebVO> list = new ArrayList<WebVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				WebVO vo = new WebVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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
	
	//뷰22222222222
	public List<WebVO> webList(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_web where idx=?";
		List<WebVO> list = new ArrayList<WebVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				WebVO vo = new WebVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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

	// 게시글 검색조건에 맞는 목록 불러오기
	public List<WebVO> webList(String search, String key) {
		String query = "select * from blog_web where " + search + " like '%" + key + "%' order by idx desc";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<WebVO> list = new ArrayList<WebVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				WebVO vo = new WebVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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
	public int webCount(String search, String key) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from blog_web where " + search + " like ?";
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
	public List<WebVO> webList(int pagestart, int endpage) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from blog_web order by regdate desc) A " + "where rownum <= ?) X where X.rnum >?"; // 엔드 ?
																												// 스타트?
		List<WebVO> list = new ArrayList<WebVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				WebVO vo = new WebVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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
	public int webCount(String s_query) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from blog_web" + s_query;
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
	public List<WebVO> webList(String s_query, int pagestart, int endpage) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from("
				+ "select * from blog_web order by regdate desc) A " + "where " + s_query + " and rownum <= ?) X where "
				+ s_query + " and X.rnum>?";
		List<WebVO> list = new ArrayList<WebVO>();

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				WebVO vo = new WebVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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

	// 뷰
	public WebVO webSelect(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_web where idx=?";
		WebVO vo = new WebVO();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFotoname(rs.getString("fotoname"));
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

	//조회수증가
	public void countUp(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update blog_web set readcnt = readcnt+1 where idx=?";
		
		try {
			con = getConnection();
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
	
	// 수정
	public int webModify(WebVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update blog_web set subject=?, contents=?, " + "fotoname=? where idx=?";
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
	public int webDelete(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "delete from blog_web where idx=?";
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
