package oracle.dao;
import java.sql.*;
import java.util.*;

import oracle.db.DBManager;
import oracle.dto.DeptVO;
import oracle.dto.EmpVO;
/*
 * VO가 모이면 List가 된다
 */
public class SawonDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//부서정보 테이블 전체 검색 메소드 정의
	public List<DeptVO> deptList(){
		String query = "select * from department";
		
		//리턴타입 정의
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
			}catch (Exception ee) {
		}
		}
		return list;
	}
	
	public EmpVO selectEmp(int dno, String job) {
		String query = "select * from employee where dno =? and job=?";
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, job);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setManager(rs.getInt("manager"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
				vo.setDno(rs.getInt("dno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			
			}
		}
		return vo;
	}
	
	public EmpVO empList() {
		List<EmpVO> list = new ArrayList<EmpVO>();
		String query = "select * from employee where dno =? and job=?";
		
		//리턴타입 정의
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setManager(rs.getInt("manager"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
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
			}catch (Exception ee) {
			}
		}
		
		return (EmpVO) list;
		
	}

}	
