package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;
import VO.StudentVO;

public class studentDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
		// 학생정보입력//
		public int insert(int bun,String name, String addr, String email, String birth) {
			String Query = "insert into student(bun,name,addr,email,birth) values(?,?,?,?,?)";
			int a = 0;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setInt(1,bun);
				pstmt.setString(2,name);
				pstmt.setString(3,addr);
				pstmt.setString(4,email);
				pstmt.setString(5,birth);
				a = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return a;
		}

		// 학생정보전체조회//
		public List<StudentVO> select() throws Exception {
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "select bun,name,addr,email,birth from student";
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					v = new StudentVO();
					v.setBun(rs.getInt("bun"));
					v.setName(rs.getString("name"));
					v.setAddr(rs.getString("addr"));
					v.setEmail(rs.getString("email"));
					v.setBirth(rs.getString("birth"));
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

		// 학생정보검색//이름
		public List<StudentVO> searchName(String name) throws Exception{
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "select bun,name,addr,email,birth from student where name=?";
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setString(1, name);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					v = new StudentVO();
					v.setBun(rs.getInt("bun"));
					v.setName(rs.getString("name"));
					v.setAddr(rs.getString("addr"));
					v.setEmail(rs.getString("email"));
					v.setBirth(rs.getString("birth"));
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

		// 학생정보검색// 학번
		public List<StudentVO> searchBun(String bun) throws Exception{
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "select bun,name,addr,email,birth from student where bun= ?";
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setString(1, bun);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					v = new StudentVO();
					v.setBun(rs.getInt("bun"));
					v.setName(rs.getString("name"));
					v.setAddr(rs.getString("addr"));
					v.setEmail(rs.getString("email"));
					v.setBirth(rs.getString("birth"));
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
		
		// 학생정보검색// 학년
		public List<StudentVO> searchHak(String bun) throws Exception{
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "select bun,name,addr,email,birth from student where bun like ?";
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setString(1,bun);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					v = new StudentVO();
					v.setBun(rs.getInt("bun"));
					v.setName(rs.getString("name"));
					v.setAddr(rs.getString("addr"));
					v.setEmail(rs.getString("email"));
					v.setBirth(rs.getString("birth"));
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
		
		// 학생정보수정//
		public int update(String bun, String name, String addr, String email, String birth) {
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "update student set name=?, addr=?, "
					+ "email =?,birth =? where bun= ?";
			int a = 0;
			try {	
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setString(1, name); 
				pstmt.setString(2, addr); 
				pstmt.setString(3, email); 
				pstmt.setString(4, birth);
				pstmt.setString(5, bun);
				a = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (a > 0)
				System.out.println("수정 성공");
			else
				System.out.println("수정 실패");
			return a;
		}

		// 학생정보삭제//
		public void delete(String bun) {
			List<StudentVO> list = new ArrayList<StudentVO>();
			StudentVO v = null;
			String Query = "delete from student where bun =?";
			int a = 0;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(Query);
				pstmt.setString(1, bun);
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
