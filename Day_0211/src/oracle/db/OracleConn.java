package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 추상클래스 생성
 * 상속받아서 쓰려고...
 */
public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String myID = "hr";
	private String myPW = "1234";
	
	protected Connection myConn; //멤버변수 선언
	
	public OracleConn() {}
	
	public void makeConn() throws Exception{ 
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL,myID,myPW);
		System.out.println("드라이버로딩 & 커넥션연결");
	}
		
	public abstract void cleanUp() throws Exception; //추상메소드
	
	public void takeDown() throws Exception{
		cleanUp();
		myConn.close(); //커넥션  닫기
	}
	
	
}
