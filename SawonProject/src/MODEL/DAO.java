package MODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;

public class DAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 전체목록조회
	public List<VO> select() throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select e.*,dname from employee e, department d "
				+ "where e.dno = d.dno";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new VO();
				v.setEno(rs.getInt("eno"));
				v.setEname(rs.getString("ename"));
				v.setJob(rs.getString("job"));
				v.setManager(rs.getInt("manager"));
				v.setHiredate(rs.getString("hiredate"));
				v.setSalary(rs.getInt("salary"));
				v.setCommission(rs.getInt("commission"));
				v.setDname(rs.getString("dname"));
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

	// 정보등록하기
	public int insert(String ename, String job, int manager1, String hiredate, 
			int salary, int commission, int dno) {
		String Query = "insert into employee values(ABC.nextval,?,?,?,?,?,?,?)";
		// 시퀀스ABC의 .nextval번호 자동생성기능

		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, manager1);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);
			pstmt.setInt(6, commission);
			pstmt.setInt(7, dno);
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a > 0)
			System.out.println("성공");
		else
			System.out.println("실패");
		return a;
	}

	// 이름검색
	public List<VO> searchName(String a) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select e.eno,e.ename, e.job, ee.ename as dname2," + 
				"e.hiredate,e.salary,e.commission, dname " + 
				"from employee e, employee ee, department d " + 
				"where e.ename = ? and ee.eno(+) = e.manager and d.dno= e.dno";
		// as 임의로 항목 추가
		// d.dno(+)=e.eno; d.dno에 비교값으 e.eno을 줫는데 (+) 를 넣으면 eno가 존재하지 않어도 e에 관해서출력됨

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, a);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new VO();
				v.setEno(rs.getInt("eno"));
				v.setEname(rs.getString("ename"));
				v.setJob(rs.getString("job"));
				v.setDname2(rs.getString("dname2"));// 메니져를 위해 만듬
				v.setHiredate(rs.getString("hiredate"));
				v.setSalary(rs.getInt("salary"));
				v.setCommission(rs.getInt("commission"));
				v.setDname(rs.getString("dname"));// 부서이름을 위해 만듬ㅁ
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

	// 번호검색
	public List<VO> searchNo(int a) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select * from employee where dno = ?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v = new VO();
				v.setEno(rs.getInt("eno"));
				v.setEname(rs.getString("ename"));
				v.setJob(rs.getString("job"));
				v.setManager(rs.getInt("manager"));
				v.setHiredate(rs.getString("hiredate"));
				v.setSalary(rs.getInt("salary"));
				v.setCommission(rs.getInt("commission"));
				v.setDno(rs.getInt("dno"));
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
	public void update(String ename, String job, int manager1, String hiredate, int salary, int commission, int dno) {
		String Query = "update employee set job =?,manager =? where ename = ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, job); // 직무내용
			pstmt.setInt(2, manager1); // 상사
			pstmt.setString(3, ename); // 이름
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (a > 0)
			System.out.println("성공");
		else
			System.out.println("실패");
	}

	// 삭제
	public void delete(int eno) {
		String Query = "delete from employee where eno =?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, eno);
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a > 0)
			System.out.println("성공");
		else
			System.out.println("실패");
	}
}