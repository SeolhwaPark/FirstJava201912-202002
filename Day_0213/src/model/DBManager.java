package model;

import java.sql.*;
//�̱��� ���

public class DBManager {
	private DBManager() {}
	private static DBManager instance = new DBManager();
	
	public static DBManager getInstance() {
		return instance;
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
			System.out.println("����Ȯ��");
		} catch (Exception e) {}
		return conn;
	}

}
