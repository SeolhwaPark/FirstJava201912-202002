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

	// ��ü�����ȸ
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

	// ��������ϱ�
	public int insert(String ename, String job, int manager1, String hiredate, 
			int salary, int commission, int dno) {
		String Query = "insert into employee values(ABC.nextval,?,?,?,?,?,?,?)";
		// ������ABC�� .nextval��ȣ �ڵ��������

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
			System.out.println("����");
		else
			System.out.println("����");
		return a;
	}

	// �̸��˻�
	public List<VO> searchName(String a) throws Exception {
		List<VO> list = new ArrayList<VO>();
		VO v = null;
		String Query = "select e.eno,e.ename, e.job, ee.ename as dname2," + 
				"e.hiredate,e.salary,e.commission, dname " + 
				"from employee e, employee ee, department d " + 
				"where e.ename = ? and ee.eno(+) = e.manager and d.dno= e.dno";
		// as ���Ƿ� �׸� �߰�
		// d.dno(+)=e.eno; d.dno�� �񱳰��� e.eno�� �Z�µ� (+) �� ������ eno�� �������� �ʾ e�� ���ؼ���µ�

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
				v.setDname2(rs.getString("dname2"));// �޴����� ���� ����
				v.setHiredate(rs.getString("hiredate"));
				v.setSalary(rs.getInt("salary"));
				v.setCommission(rs.getInt("commission"));
				v.setDname(rs.getString("dname"));// �μ��̸��� ���� ���뤱
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

	// ��ȣ�˻�
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

	// ����
	public void update(String ename, String job, int manager1, String hiredate, int salary, int commission, int dno) {
		String Query = "update employee set job =?,manager =? where ename = ?";
		int a = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, job); // ��������
			pstmt.setInt(2, manager1); // ���
			pstmt.setString(3, ename); // �̸�
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (a > 0)
			System.out.println("����");
		else
			System.out.println("����");
	}

	// ����
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
			System.out.println("����");
		else
			System.out.println("����");
	}
}