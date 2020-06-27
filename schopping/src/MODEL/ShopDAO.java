package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;

public class ShopDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
//	 [1] 회원정보 등록
	public int Insert(int custno, String custname, String phone, String gender, String grade) {
		String Query = "insert into tbl_member_20200219(custno,custname,phone,gender,grade) values(?,?,?,?,?)";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1,custno);
			pstmt.setString(2,custname);
			pstmt.setString(3,phone);
			pstmt.setString(4,gender);
			pstmt.setString(5,grade);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	

//	 [2] 회원정보현황 조회
	public List<ShopVO> Select() throws Exception {
		List<ShopVO> list = new ArrayList<ShopVO>();
		ShopVO v = null;
		String Query = "select * from tbl_member_20200219";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new ShopVO();
				v.setCustno(rs.getInt("custno"));
				v.setCustname(rs.getString("custname"));
				v.setPhone(rs.getString("phone"));
				v.setGender(rs.getString("gender"));
				v.setJoindate(rs.getString("joindate"));
				v.setGrade(rs.getString("grade"));
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
	

//	 [3] 회원정보 수정
	public int Update(String custno, String custname, String phone, String gender, String grade) throws Exception {
		String Query = "update tbl_member_20200219 set custname=?, phone=?,gender =?,grade =? where custno= ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, custname); 
			pstmt.setString(2, phone); 
			pstmt.setString(3, gender); 
			pstmt.setString(4, grade);
			pstmt.setInt(5, Integer.parseInt(custno));

			a = pstmt.executeUpdate();
			
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
		return a;
	}
	
//	 [4] 회원정보 삭제
	public void Delete(int custno) {
		List<ShopVO> list = new ArrayList<ShopVO>();
		ShopVO v = null;
		String Query = "delete from tbl_member_20200219 where custno = ?";
		int a = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, custno);
			a = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a > 0)
			System.out.println("삭제 성공");
		else
			System.out.println("삭제 실패");
	}
	
}
