package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;

/*
private int bun
private String name
private String sexual
private String cell
private String addr
private String birth
 */
public class DAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 학생정보 입력
	public int insert(int bun, String name, String sexual, String cell, String addr, String birth) {
		String Query = "insert into studentsample(bun,name,sexual,cell" + ",addr,birth) values (?,?,?,?,?,?)";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, bun);
			pstmt.setString(2, name);
			pstmt.setString(3, sexual);
			pstmt.setString(4, cell);
			pstmt.setString(5, addr);
			pstmt.setString(6, birth);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	// 학생정보 전체조회
	public List<VO> select() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select * from studentsample";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new VO();
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
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

	// 학생정보 검색 이름
	public List<VO> searchName(String name) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select bun,name,sexual,cell,addr," + "birth from studentsample where name =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
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

	// 학생정보 검색 전화번호
	public List<VO> searchCell(String cell) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select bun,name,sexual,cell,addr," 
		+ "birth from studentsample where cell =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, cell);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
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

	// 학생정보 검색 학번
	public List<VO> searchBun(String bun) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select bun,name,sexual,cell,addr," 
		+ "birth from studentsample where bun =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, bun);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
	
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

	// 학생정보 검색 주소
	public List<VO> searchAddr(String addr) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select bun,name,sexual,cell,addr," 
		+ "birth from studentsample where addr =?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, addr);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
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

	// 학생정보 검색 학년
	public List<VO> searchHak(String bun) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select bun,name,sexual,cell,addr," 
		+ "birth from studentsample where bun like ?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, bun);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.setBun(rs.getInt("bun"));
				v.setName(rs.getString("name"));
				v.setName(rs.getString("sexual"));
				v.setName(rs.getString("cell"));
				v.setName(rs.getString("addr"));
				v.setName(rs.getString("birth"));
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

	// 학생정보 수정
	public int update(String bun, String name, String sexual, 
			String cell, String addr, String birth) {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "update studentsample set name=? sexual =? cell =? addr =? birth=? where bun =?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name);
			pstmt.setString(2, sexual);
			pstmt.setString(3, cell);
			pstmt.setString(4, addr);
			pstmt.setString(5, birth);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(a>0)System.out.println("정보가 변경되었습니다.");
		else System.out.println("정보 변경에 실패하였습니다.");
		return a;
	}

	// 학생정보 삭제
	public void delete(String bun) {
		List<VO> list = new ArrayList<VO>();
		VO v= null;
		String Query = "delete from studentsample where bun=?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, bun);
			a = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(a>0)System.out.println("정보가 삭제되었습니다.");
		else System.out.println("정보 삭제에 실패하였습니다.");
	}

}
