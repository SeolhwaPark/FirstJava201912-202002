package customer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

import customer.db.DBManager;

/*
num
name
tel
addr
office
birthday 날짜
sex
indate 날짜
 */
public class CustDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 커넥션 시작
	void custStart(String query) throws Exception {
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
	}

	// 커넥션 종료
	void custExit() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
		}
	}

	// [1] 고객 전체 목록
	public List<CustVO> custList() {
		String Query = "select * from custom";
		List<CustVO> list = new ArrayList<CustVO>();
		CustVO vo = null;
		try {
			custStart(Query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new CustVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setOffice(rs.getString("office"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate"));
				list.add(vo);
			}

		} catch (Exception e) {
		} finally {
			custExit();
		}
		return list;
	}

	// [2] 신규 고객 등록
	public int custInsert(int num, String name, String tel, String addr, String office, String birthday, String sex) {
		String Query = "insert into custom(num,name,tel,"
				+ "addr,office,birthday,sex)" + "values(?,?,?,?,?,?,?)";
		int row = 0;
		try {
			custStart(Query);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, addr);
			pstmt.setString(5, office);
			pstmt.setString(6, birthday);
			pstmt.setString(7, sex);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			custExit();
		}
		return row;
	}

	// [3] 고객이름 검색
	public CustVO custSearch(String name) {
		String Query = "select * from custom where name= ?";
		CustVO v = null;
		try {
			custStart(Query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CustVO vo = new CustVO();
				vo = new CustVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setOffice(rs.getString("office"));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate"));
			}
		} catch (Exception e) {
		} finally {
			custExit();
		}
		return v;
	}

	// [4] 고객 정보 수정
	public int custUpdate(int num, String tel, String office) {
		String Query = "update department set tel = ?, office = ? where num=?";
		int row = 0;
		try {
			custStart(Query);
			pstmt.setInt(3, num);
			pstmt.setString(1, tel);
			pstmt.setString(2, office);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			custExit();
		}
		return row;
	}

	// [5] 고객번호 검색
	public CustVO custSearch(int num) {
		String Query = "select * from custom where num= ?";
		CustVO v = null;
		try {
			custStart(Query);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CustVO vo = new CustVO();
				vo = new CustVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setOffice(rs.getString("office"));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate"));
			}
		} catch (Exception e) {
		} finally {
			custExit();
		}
		return v;
	}

	// [6] 고객 정보 삭제
	public int custDelete(int num) {
		String query = "delete from custom where num=?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			custExit();
		}
		return row;
	}

}
