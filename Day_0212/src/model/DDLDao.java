package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBManager;

public class DDLDao {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 메소드 정의
	public int tabCreate() {
		StringBuffer query = new StringBuffer();
		query.append("create table aaa(");
		query.append("dno number(2),");// dno number(2) primary key,
		query.append("dname number(2) not null,");
		query.append("regdate date,");
		query.append("score number(3),");
		query.append("primary key(dno))");

		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return row;
	}

	
	public int insertAAA(int dno, int dname, String date, int score) {
		String query = "insert into aaa values(?,?,?,?)";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setInt(2, dname);
			pstmt.setString(3, date);
			pstmt.setInt(4, score);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
			}
		}
		return row;
	}
	
	
	public int aaaUpdate(int dno,int dname,int score) {
		String query ="update aaa set dname = ?, score = ? where dno=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setInt(2, dname);
			pstmt.setInt(3, score);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return row;

	}
	
	
	public int aaaDelete(int dno) {
		String query ="delete from aaa where dno=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return row;

	}
}
