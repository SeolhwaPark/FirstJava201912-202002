package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class DataDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 메소드정의 15개

	public List<EmpVO> exam_01() {
		String query = "select ename,salary,salary+300 as temp from employee";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setTemp(rs.getInt("temp"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_02() {
		String query = "select ename,salary,salary*12+100 as temp from employee order by salary*12+100 desc";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setTemp(rs.getInt("temp"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_03() {
		String query = "select ename,salary from employee where salary>2000 order by salary desc";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public EmpVO exam_04() {
		String query = "select ename, dno from employee where eno =7788";
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				vo.setDno(rs.getInt("dno"));
				vo.setEname(rs.getString("ename"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public List<EmpVO> exam_05() {
		String query = "select ename,salary from employee where salary not between 2000 and 3000";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_06() {
		String query = "select ename, job, hiredate from employee where hiredate between '81/02/20' and '81/05/01'";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setHiredate(rs.getString("hiredate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_07() {
		String query = "select ename, dno from employee where dno in(20,30) order by ename";

		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setDno(rs.getInt("dno"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_08() {
		String query = "select ename, salary, dno from employee where salary between 2000 and 3000 and dno in(20,30) order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setDno(rs.getInt("dno"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_09() {
		String query = "select ename, hiredate from employee where hiredate like'81%'";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setHiredate(rs.getString("hiredate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_10() {
		String query = "select ename,job from employee where manager is null";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_11() {
		String query = "select ename,salary,commission from employee where commission is not null order by salary, commission";
		List<EmpVO> list = new ArrayList<EmpVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			EmpVO vo = null;
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ee) {
			}
		}
		return list;
	}

	public List<EmpVO> exam_12() {
		String query = "select ename from employee where ename like '__R%'";
		EmpVO vo = null;
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
			}
		}

		return list;
	}
}
