package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;

public class DAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

//	 [1] 도서 대출 예약 등록
	public int Insert(String lentno, String custname, int bookno, 
			String phone, String outdate, String indate
			) {
		String Query = "insert into reservation values(book.nextval,?,?,?,?,?,?,?)";

		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, lentno);
			pstmt.setString(2, custname);
			pstmt.setInt(3, bookno);
			pstmt.setString(4, phone);
			pstmt.setString(5, outdate);
			pstmt.setString(6, indate);
			pstmt.setString(7, "1");
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a > 0)
			System.out.println("등록 성공");
		else
			System.out.println("등록 실패");
		return a;
	}

//	 [2] 도서 대출 현황 조회
	public List<VO> select() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select * from reservation";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new VO();
				v.setLentno(rs.getInt("lentno"));
				v.setCustname(rs.getString("custname"));
				v.setBookno(rs.getInt("bookno"));
				v.setPhone(rs.getString("phone"));
				v.setOutdate(rs.getString("Outdate"));
				v.setIndate(rs.getString("indate"));
				v.setStatus(rs.getString("status"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return list;
	}

//	 [3] 도서 대출 예약 수정
	public int update(String lentno, String custname, String phone, 
			int bookno, String outdate, String indate) throws Exception {		
		String Query = "update reservation set custname =?,phone=?,outdate=?,indate=?, where lentno = ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, lentno);
			pstmt.setString(2, custname);
			pstmt.setString(3, phone);
			pstmt.setInt(4, bookno);
			pstmt.setString(5, outdate);
			pstmt.setString(6, indate);
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
		return a;
	}

//	 [4] 도서 대출 반납 등록
	public int Return(String status) throws Exception {
		String Query = "insert into reservation values(?)";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, status);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
}
