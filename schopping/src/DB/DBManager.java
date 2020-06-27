package DB;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {}
	private static DBManager instance = new DBManager(); 
	public static DBManager getInstance() { 
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
