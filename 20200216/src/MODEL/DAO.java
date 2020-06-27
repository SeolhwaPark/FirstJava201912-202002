package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DB.DBManager;

/*String id;
String name;
String passwd;
String email;
String tel;
String address;
int age;
String regdate;*/
public class DAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 전체목록
	public List<VO> select() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select id,name,email,tel,address,age,regdate from test";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				v = new VO();
				v.setId(rs.getString("id"));
				v.setName(rs.getString("name"));
				v.setEmail(rs.getString("email"));
				v.setTel(rs.getString("tel"));
				v.setAddress(rs.getString("address"));
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

	// 회원등록
	public int insert(String id, String name, String passwd, String email, String tel, String address, int age) {
		String Query = "insert into test(id,name,passwd,email,tel,address,age) values(?,?,?,?,?,?,?)";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, passwd);
			pstmt.setString(4, email);
			pstmt.setString(5, tel);
			pstmt.setString(6, address);
			pstmt.setInt(7, age);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	// 로그인
	public List<VO> login(String id, String passwd) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select id from test where id =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			while(true) {
				v = new VO();
				v.setId(rs.getString("id"));
				v.setPasswd(rs.getString("passwd"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return list;
	}

	// 로그인용 id
	public List<VO> testId() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select id from test";
		conn = manager.getConnection();
		try {
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while(true) {
				v = new VO();
				v.setId(rs.getString("id"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return list;
	}

	// 로그인용 pass
	public List<VO> testPasswd() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select passwd from test";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while(true) {
				v = new VO();
				v.setPasswd(rs.getString("passwd"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return list;
	}

	// 검색
	public List<VO> search(Scanner sc, String id) throws Exception{
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select id,name,passwd,email,tel,address,age,regdate from test where id =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(true) {
				v = new VO();
				v.setId(rs.getString("id"));
				v.setName(rs.getString("name"));
				v.setPasswd(rs.getString("passwd"));
				v.setEmail(rs.getString("email"));
				v.setTel(rs.getString("tel"));
				v.setAddress(rs.getString("address"));
				v.setAge(rs.getInt("age"));
				v.setRegdate(rs.getString("regdate"));
				list.add(v);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return list;
	}

	// 수정
	public void update(String id, String name, String email, String tel, String address, int age) {
		String Query = "update test set id =?,name=?,email=?,tel=?,address=?,age=? where id = ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
			pstmt.setInt(5, age);
			a = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(a>0) System.out.println("수정 성공");
			
		else System.out.println("수정 실패");
			
	}

	// 삭제
	public void delete() {

	}

	// 끝내기
	public void exit() {

	}

}
