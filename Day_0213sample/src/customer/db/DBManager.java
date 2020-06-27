package customer.db;
import java.sql.*;

public class DBManager {
	private DBManager() {} // 외부에서 객체생성 금지 - 싱글 톤 방식. 커넥션을 하나를 열어놓고, 공유하는 방식
	private static DBManager instance = new DBManager(); // 자체적으로 객체 생성.
	public static DBManager getInstance() { // 외부에서 getInstance 메소드를 호출하면, 자동으로 DBManager 객체를 생성.
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
			System.out.println("드라이버 로딩 및 커넥션 연결 확인");
		}catch(Exception e) {}
		return conn;
	}
}
