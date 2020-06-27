package oracle.exam2;

import java.sql.*;
/*
 * dao 수정 삭제
 * dto 데이터보네는 역할
 */

import oracle.db.DBManager;

public class DBTest {
	public static void main(String[] args) throws Exception {
		DBManager manager = DBManager.getInstance();
		Connection conn = manager.getConnection();
		System.out.println(conn);
		
		
		
	}
}
