package jdbc;
/*
 * java + DB
 * 1. JDBC ����̹� �ε� = API�ҷ��鿩����...
 * 2. Ŀ�ؼ� ���� = �ٸ�����. ����
 * 3. ��ɹ� ���� = �շ��ϱ�
 */
import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		//JDBC ����̹� �ε�
		try {
			//�ҷ����̱�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (Exception e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
		
		//Ŀ�ؼǿ���
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myUser= "system";
		String myPass= "1234";
		try {
			//�ٸ��� ���� ���ĳ���
			Connection con = 
					DriverManager.getConnection(myURL,myUser,myPass);
			System.out.println("Ŀ�ؼ� ���� ����");
			
		} catch (Exception e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
		}
		
		
	}

}
