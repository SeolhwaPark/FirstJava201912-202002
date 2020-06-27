package db;
import java.sql.*;
//싱글톤 방식

public class DBManager {
	private DBManager() {}
	private static DBManager instance = new DBManager();
	//자체생산 자기자신의 객체주소를 저장한
	//static은 딱 한번만 만들어짐
	
	public static DBManager getInstance() {
		return instance; // 자기자신의 주소를 리턴

	}
	
	public Connection getConnection() throws Exception{
		Connection conn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "hr";
		String myPW = "1234";
		Class.forName(myDriver);

		try {
			conn = DriverManager.getConnection(myURL,myID,myPW);
			System.out.println("드라이버 로딩 및 커넥션 연결 확인");
		} catch (Exception e) {}
		return conn;
			
	}

}
