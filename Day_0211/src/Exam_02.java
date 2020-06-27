import java.awt.dnd.DragGestureEvent;
import java.sql.*;
import java.sql.Connection;

/*
 * 1. DB����
 * 2. �˻�
 */
public class Exam_02 {
	public static void main(String[] args) {
	
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";		
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;		
		Statement stmt = null;
		ResultSet rs = null; //ResultSet����� Set���� �޴´� �ϳ��� �����´� select ���
		
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL,myID,myPW);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				int eno = rs.getInt(1); // rs.getInt("eno")�����̸��� �˶� ��
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hiredate = rs.getString("hiredate");//localDate�ϸ� �ú��ʵ� ����
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
			rs.close(); //���� �� ���� ���ٷ� �ݱ�
			stmt.close();
			con.close(); //���ϸ� ��ŷ�� ������ ����
			
		} catch (Exception e) {
			
		}
	}

}
