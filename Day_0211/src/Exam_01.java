import java.sql.*;
import java.sql.Connection;

/*
 * 1. DB����
 * 2. �˻�
 */
public class Exam_01 {
	public static void main(String[] args) {
		//1�ܰ� JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����Ŭ����̹� �ε� ����");
		}catch(Exception e){
			e.printStackTrace();
		}
		//2�ܰ� Connection ��ü ���� Ŀ�ؼ� ����
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";
		//����Ŭ�� �⺻��Ʈ 1521
		//������ ��Ʈ��ȣ�� ���Ƿ� �����ϴ°� ������
		
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;
		
		try {			
			con=DriverManager.getConnection(myURL,myID,myPW);			
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3�ܰ� SQL���
		Statement stmt = null;
		ResultSet rs = null; //ResultSet����� Set���� �޴´� �ϳ��� �����´� select ���
		try {
			stmt = con.createStatement(); //���ο� ��ɹ��� ����ٰ� ����
			rs = stmt.executeQuery("select * from department");//����� �������
			while(rs.next()) {//�����ϸ� ��������
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\n");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//4�ܰ� �ݱ�
		try {
			rs.close(); //���� �� ���� ���ٷ� �ݱ�
			stmt.close();
			con.close(); //���ϸ� ��ŷ�� ������ ����
			
		} catch (Exception e) {
			
		}
	}

}
