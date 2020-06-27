import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

/*
 * 1. DB연동
 * 2. 검색
 * 
 *사원번호:7788
7788	SCOTT	ANALYST	7566	1987-07-13 00:00:00	3000	0	20
 */
public class Exam_04 {
	public static void main(String[] args) {
	
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";		
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;
		Statement stmt = null;//한번만 수행
		ResultSet rs = null; //ResultSet결과를 Set으로 받는다 하나씩 꺼내온다 select 등록
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사원이름:");
		String name = sc.next();
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL,myID,myPW);
			stmt = con.createStatement();
			String query = "select * from employee where ename = "+"'"+name+"'";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int eno = rs.getInt(1); // rs.getInt("eno")변수이름을 알때 씀
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hiredate = rs.getString("hiredate");//localDate하면 시분초도 나옴
				int salary = rs.getInt("salary");
				int comm = rs.getInt("commission");
				int dno = rs.getInt("dno");
	
				System.out.print(eno + "\t" + ename + "\t");
				System.out.print(job + "\t" + manager + "\t");
				System.out.print(hiredate + "\t" + salary + "\t");
				System.out.print(comm + "\t" + dno + "\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			rs.close(); //닫을 때 순서 꺼꾸로 닫기
			stmt.close();
			con.close(); //안하면 해킹의 위험이 있음
			
		} catch (Exception e) {
			
		}
	}

}
