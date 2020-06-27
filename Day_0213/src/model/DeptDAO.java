package model;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	//��ü��� ȭ�� �޼ҵ� ȣ��
	public List<DeptVO> deptList(){
		String query = "select * from department";
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDno(rs.getInt("dno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception ee) {}
		}
		return list;
	}
	
	//���
	public int deptInsert(int dno, String dname, String loc) {
		String query = "insert into department values(?,?,?)";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();

			} catch (Exception e2) {}
		}
		return row;
	}
	//�μ���ȣ�� �Է½� �ش� �μ������� ���
	public List<DeptVO> deptSearch(int dno) {
		String query ="select * from department where dno = ?";
		int row = 0;
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDno(rs.getInt("dno"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception ee) {}
		}
		return list;
	}

	//�μ���ȣ, �μ���, ������ ����
	public int deptUpdate(int dno,String dname, String loc) {
		String query ="update department set dname = ?, loc = ? where dno=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, dno);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {}
		}
		return row;

	}

	//�μ���ȣ�� �̿��� ����
	public int deptDelete(int dno) {
		String query ="delete from department where dno=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);//������ �ݺ�
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();//������ ����

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {}
		}
		return row;

	}

}
