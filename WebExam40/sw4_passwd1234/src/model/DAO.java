package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.swing.DefaultButtonModel;

import oracle.jdbc.driver.DBConversion;

public class DAO {
	private static DAO instance = new DAO();
	public static DAO getInstance() {
		return instance;}
	//커넥션풀
	public Connection getConnection() {
		Connection con = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	//제품 등록
	public int productInsert(VO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "insert into tbl_product(code,pname,cost,pnum,jnum,sale,gcode) values(?,?,?,?,?,?,?)";
		int row=0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getPname());
			pstmt.setInt(3, vo.getCost());
			pstmt.setInt(4, vo.getPnum());
			pstmt.setInt(5, vo.getJnum());
			pstmt.setInt(6, vo.getSale());
			pstmt.setString(7, vo.getGcode());
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();			
			}
		}
		return row;
	}

	//우선제품: 재고 수량이 목표 수량의 20% 미만인 우선 생산해야할 제품에 대한 정보(제품이름, 생산해야할 수량)를 표 형식으로 출력하시오. 
	public void productFirst() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	//이익제품: 현 재고 수량으로 모두 판매하였을 때 총이익 금액이 큰 제품부터 적은 제품으로
	//(제품이름, 총이익 금액) 순서대로 표 형식으로 출력하시오.
	public void productProfit() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	//그룹별: 제품 그룹별 재고 수량 정보(그룹이름, 재고 수량)를 표 형식으로 출력하시오.
	public void productGroup() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	//조회
	public List<VO> productView() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<VO> list = new ArrayList<VO>();
		String query = "select * from tbl_product";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				VO vo = new VO();
				vo.setCode(rs.getString("code"));
				vo.setPname(rs.getString("pname"));
				vo.setCost(rs.getInt("cost"));
				vo.setPnum(rs.getInt("pnum"));
				vo.setJnum(rs.getInt("jnum"));
				vo.setSale(rs.getInt("sale"));
				vo.setGcode(rs.getString("gcode"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	
	//수정
	public void productModify() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	//삭제
	public void productDelete() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
}
