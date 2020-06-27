package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	private DBManager() {}
	
	private static DBManager instance = new DBManager();
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		Connection con = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "jsl40";
		String myPass= "1234";
		
		try {
			Class.forName(myDriver);
			con = DriverManager.getConnection(myURL,myID,myPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
}
