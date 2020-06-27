package oracle.exam;

import java.sql.*;

import oracle.db.OracleConn;

public class OracleSQL extends OracleConn { //상속받은애
	Statement stmt = null; //조건이 없을 때 쓰기 좋은애
	PreparedStatement pstmt = null; //조건이 있을 때 쓰기 좋은애
	ResultSet rs = null;
	
	//전체검색 메소드
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
	
	//부서번호 검색 메소드
	
	public void deptSearch(int dno) throws Exception{
		String query = "select * from department where dno = ?";//prepare니까
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
	
	//부서번호에 해당하는 사원정보 출력
	
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
	
	//사원정보의 입사일 출력
	
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
		
	//이름 검색 메소드
	public void deptName(String name) throws Exception{
		String query = "select eno, ename, job, hiredate from"
				+ "employee where ename like ?";//prepare니까
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
		if(rs != null) rs.close(); //생성이 됬으면 닫음, 생성이 안됬으면 실행하지 않음
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
	}

}
