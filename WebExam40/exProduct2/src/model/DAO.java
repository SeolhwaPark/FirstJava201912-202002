package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	private DAO() {
	}

	private static DAO instance = new DAO();
	public static DAO getInstance() {
		return instance;
	}
	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "jsl40", "1234");
		return con;
	}

	// 등록
	public int insertDB(VO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into tbl_product(code,pname,cost,pnum,jnum,sale,gcode) values(?,?,?,?,?,?,?)";
		int row = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getPname());
			pstmt.setInt(3, vo.getCost());
			pstmt.setInt(4, vo.getPnum());
			pstmt.setInt(5, vo.getJnum());
			pstmt.setInt(6, vo.getSale());
			pstmt.setString(7, vo.getGcode());
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

	// 현황
	public List<VO> listDB() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_product";
		List<VO> list = new ArrayList<VO>();
		VO vo = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new VO();
				vo.setCode(rs.getString("code"));
				vo.setPname(rs.getString("pname"));
				vo.setCost(rs.getInt("cost"));
				vo.setPnum(rs.getInt("pnum"));
				vo.setJnum(rs.getInt("jnum"));
				vo.setSale(rs.getInt("sale"));
				vo.setGcode(rs.getString("gcode"));
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

	// 현황
	public VO getDB(String code) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_product where code=?";
		VO vo = new VO();
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo.setCode(rs.getString("code"));
				vo.setPname(rs.getString("pname"));
				vo.setCost(rs.getInt("cost"));
				vo.setPnum(rs.getInt("pnum"));
				vo.setJnum(rs.getInt("jnum"));
				vo.setSale(rs.getInt("sale"));
				vo.setGcode(rs.getString("gcode"));
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
	public int modifyDB(VO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "update tbl_product set cost=?,pnum=?,jnum=?,sale=?,gcode=? where code=?";
		int row = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, vo.getCost());
			pstmt.setInt(2, vo.getPnum());
			pstmt.setInt(3, vo.getJnum());
			pstmt.setInt(4, vo.getSale());
			pstmt.setString(5, vo.getGcode());
			pstmt.setString(6, vo.getCode());
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

	// 그룹별 재고현황
	public List<VO> groupList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select gcode,gname, sum(jnum) as tot FROM"
				+ " (select a.gcode, b.gname, jnum from tbl_product a, tbl_groupcode b"
				+ " where a.gcode = b.gcode) group by gcode,gname order by sum(jnum) desc";
		List<VO> list = new ArrayList<VO>();
		VO vo = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new VO();
				vo.setGcode(rs.getString("gcode"));
				vo.setGname(rs.getString("gname"));
				vo.setJnum(rs.getInt("tot"));
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
