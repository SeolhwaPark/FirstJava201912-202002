package customer.db;
import java.sql.*;

public class DBManager {
	private DBManager() {} // �ܺο��� ��ü���� ���� - �̱� �� ���. Ŀ�ؼ��� �ϳ��� �������, �����ϴ� ���
	private static DBManager instance = new DBManager(); // ��ü������ ��ü ����.
	public static DBManager getInstance() { // �ܺο��� getInstance �޼ҵ带 ȣ���ϸ�, �ڵ����� DBManager ��ü�� ����.
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection conn = null;
		String myDriver="oracle.jdbc.driver.OracleDriver";
		String myURL="jdbc:oracle:thin:@localhost:1521:xe";
		String myID="hr";
		String myPW="1234";
		Class.forName(myDriver);
		try {
			conn = DriverManager.getConnection(myURL,myID,myPW);
			System.out.println("����̹� �ε� �� Ŀ�ؼ� ���� Ȯ��");
		}catch(Exception e) {}
		return conn;
	}
}
