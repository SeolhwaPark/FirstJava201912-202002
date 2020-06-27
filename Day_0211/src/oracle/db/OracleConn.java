package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * �߻�Ŭ���� ����
 * ��ӹ޾Ƽ� ������...
 */
public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String myID = "hr";
	private String myPW = "1234";
	
	protected Connection myConn; //������� ����
	
	public OracleConn() {}
	
	public void makeConn() throws Exception{ 
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL,myID,myPW);
		System.out.println("����̹��ε� & Ŀ�ؼǿ���");
	}
		
	public abstract void cleanUp() throws Exception; //�߻�޼ҵ�
	
	public void takeDown() throws Exception{
		cleanUp();
		myConn.close(); //Ŀ�ؼ�  �ݱ�
	}
	
	
}
