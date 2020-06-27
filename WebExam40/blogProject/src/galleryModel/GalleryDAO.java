package galleryModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class GalleryDAO {
	private GalleryDAO() {
	}

	private static GalleryDAO instance = new GalleryDAO();

	public static GalleryDAO getInstance() {
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
	public List<GalleryVO> galleryList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_gallery";
		List<GalleryVO> list = new ArrayList<GalleryVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				GalleryVO vo = new GalleryVO();
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
	public int galleryModify(GalleryVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update blog_gallery set fotoname=? where idx=?";
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
	public int galleryDelete(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "delete from blog_gallery where idx=?";
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
	
	public List<GalleryVO> galleryList(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_gallery where idx=?";
		List<GalleryVO> list = new ArrayList<GalleryVO>();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				GalleryVO vo = new GalleryVO();
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
