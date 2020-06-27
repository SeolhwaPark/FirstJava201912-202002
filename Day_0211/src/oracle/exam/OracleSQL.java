package oracle.exam;

import java.sql.*;

import oracle.db.OracleConn;

public class OracleSQL extends OracleConn { //��ӹ�����
	Statement stmt = null; //������ ���� �� ���� ������
	PreparedStatement pstmt = null; //������ ���� �� ���� ������
	ResultSet rs = null;
	
	//��ü�˻� �޼ҵ�
	public void deptListPrint() throws Exception{
		String query = "select * from department";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(dno + "\t" + dname + "\t" + loc);
		}
	}
	
	//�μ���ȣ �˻� �޼ҵ�
	
	public void deptSearch(int dno) throws Exception{
		String query = "select * from department where dno = ?";//prepare�ϱ�
		pstmt =myConn.prepareStatement(query);
				pstmt.setInt(1, dno);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(dno + "\t" + dname + "\t" + loc);
		}
	}
	
	//�μ���ȣ�� �ش��ϴ� ������� ���
	
	public void deptEmployee(int no) throws Exception{
		String query = "select * from employee where dno = ?";
		pstmt =myConn.prepareStatement(query);
				pstmt.setInt(1, no);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int eno = rs.getInt(1);
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int manager = rs.getInt("manager");
			String hiredate = rs.getString("hiredate");
			int salary = rs.getInt("salary");
			int comm = rs.getInt("commission");
			int dno = rs.getInt("dno");
			
			System.out.print(eno + "\t" + ename + "\t");
			System.out.print(job + "\t" + manager + "\t");
			System.out.print(hiredate + "\t" + salary + "\t");
			System.out.print(comm + "\t" + dno + "\n");
		}
	}
	
	//��������� �Ի��� ���
	
		public void deptHiredate(String date) throws Exception{
			String query = "select * from employee where hiredate >= ?";
			pstmt =myConn.prepareStatement(query);
			pstmt.setString(1, date);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int eno = rs.getInt(1); 
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hiredate = rs.getString("hiredate");
				int salary = rs.getInt("salary");
				int comm = rs.getInt("commission");
				int dno = rs.getInt("dno");
				
				System.out.print(eno + "\t" + ename + "\t");
				System.out.print(job + "\t" + manager + "\t");
				System.out.print(hiredate + "\t" + salary + "\t");
				System.out.print(comm + "\t" + dno + "\n");
			}
		}
		
	//�̸� �˻� �޼ҵ�
	public void deptName(String name) throws Exception{
		String query = "select eno, ename, job, hiredate from"
				+ "employee where ename like ?";//prepare�ϱ�
		pstmt =myConn.prepareStatement(query);
				pstmt.setString(1, "%"+name+"%");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String hiredate = rs.getString("hiredate").substring(0,10);

			System.out.print(eno + "\t" + ename + "\t");
			System.out.print(job + "\t" + hiredate + "\n");
		}
	}
	
	@Override
	public void cleanUp() throws Exception {
		if(rs != null) rs.close(); //������ ������ ����, ������ �ȉ����� �������� ����
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
	}

}
