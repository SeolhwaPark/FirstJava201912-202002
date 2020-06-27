package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	
	private DBManager() {
	}
	
	private static DBManager instance = new DBManager();
	
	public static DBManager getInstance() {
		return instance;
	}
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = 
			DriverManager.getConnection(
		"jdbc:oracle:thin:@//localhost:1521/xe","jsl40","1234");
		return con;
	}
	
}
