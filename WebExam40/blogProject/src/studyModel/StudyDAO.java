package studyModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import galleryModel.GalleryVO;


public class StudyDAO {
	private StudyDAO() {
	}

	private static StudyDAO instance = new StudyDAO();

	public static StudyDAO getInstance() {
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
	public List<StudyVO> studyList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_study";
		List<StudyVO> list = new ArrayList<StudyVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				StudyVO vo = new StudyVO();
				vo.setIdx(rs.getInt("idx"));
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
		public int studyModify(StudyVO vo) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "update blog_study set fotoname=? where idx=?";
			int row = 0;
			try {
				con = getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, vo.getFotoname());
				pstmt.setInt(2, vo.getIdx());
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
		public int studyDelete(int idx) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "delete from blog_study where idx=?";
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
		
		
		public List<StudyVO> studyList(int idx) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select * from blog_study where idx=?";
			List<StudyVO> list = new ArrayList<StudyVO>();
			try {
				con = getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, idx);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					StudyVO vo = new StudyVO();
					vo.setIdx(rs.getInt("idx"));
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

		
		
}
