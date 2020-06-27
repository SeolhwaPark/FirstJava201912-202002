package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DB.DBManager;
import VO.JoinVO;

/*String userid; 
String name;
String passwd; 
String email;
int age;
String regdate;
*/public class JoinDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 목록
	public List<JoinVO> select() throws Exception {
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO v = null;

		String Query = "select userid,name,email,age,regdate from join order by regdate desc";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new JoinVO();
				v.setUserid(rs.getString("userid"));
				v.setName(rs.getString("name"));
				v.setEmail(rs.getString("email"));
				v.setAge(rs.getInt("age"));
				v.setRegdate(rs.getString("regdate"));
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

	// 등록
	public int insert(String userid, String name, String passwd, String email, int age) {
		String Query = "insert into join(userid, name, passwd, email, age) values(?,?,?,?,?)";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, userid);
			pstmt.setString(2, name);
			pstmt.setString(3, passwd);
			pstmt.setString(4, email);
			pstmt.setInt(5, age);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	// 로그인
	public List<JoinVO> login(String userid, String passwd) throws Exception {
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO v = null;
		String Query = "select userid from join where userid =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new JoinVO();
				v.setUserid(rs.getString("userid"));
				v.setPasswd(rs.getString("passwd"));
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

	// 아이디
	public List<JoinVO> id() throws Exception {
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO v = null;
		String Query = "select userid from join";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new JoinVO();
				v.setUserid(rs.getString("userid"));
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
	
	// 패스워드
	public List<JoinVO> pass() throws Exception {
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO v = null;
		String Query = "select passwd from join";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new JoinVO();
				v.setPasswd(rs.getString("passwd"));
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
	
	// 검색
	public List<JoinVO> search(Scanner sc, String userid) throws Exception {
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO v = null;
		String Query = "select userid,passwd,name,email,age,regdate from join where userid = ?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new JoinVO();
				v.setName(rs.getString("name"));
				v.setUserid(rs.getString("userid"));
				v.setPasswd(rs.getString("passwd"));
				v.setEmail(rs.getString("email"));
				v.setAge(rs.getInt("age"));
				v.setRegdate(rs.getString("regdate"));
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

	// 수정
	public void update(String userid,String name, String passwd, String email, int age) {
		String Query = "update join set name=?, passwd =?, email =?, age=? where userid = ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name); // 이름
			pstmt.setString(2, passwd); // 비번
			pstmt.setString(3, email); // 이멜
			pstmt.setInt(4, age); // 나이
			pstmt.setString(5, userid); // 이름
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (a > 0)
			System.out.println("수정 성공");
		else
			System.out.println("수정 실패");
	}

	// 삭제
	public void delete(String userid) {
		String Query = "delete from join where userid =?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, userid);
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
