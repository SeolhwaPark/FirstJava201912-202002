package model;
import java.util.*;
import java.sql.*;

public class DAO {
	private DAO() {}
	private static DAO instance = new DAO();
	public static DAO getInstance() {
		return instance;
	}
	private static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con =
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40", "1234");
		return con;
	}

	// 회원현황리스트
	public List<VO> memList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select userno,name,phone1,phone2,phone3,gender,birthday,regdate " + 
				" from tbl_member_003";
		
		List<VO> list = new ArrayList<VO>();
		con = getConnection();
		pstmt=con.prepareStatement(query);
		rs = pstmt.executeQuery();
		VO vo = null; ;
		while(rs.next()) {
			vo = new VO();
			vo.setUserno(rs.getInt("userno"));
			vo.setName(rs.getString("name"));
			vo.setPhone1(rs.getString("phone1"));
			vo.setPhone2(rs.getString("phone2"));
			vo.setPhone3(rs.getString("phone3"));
			vo.setGender(rs.getString("gender"));
			vo.setBirthday(rs.getString("birthday"));
			vo.setRegdate(rs.getString("regdate"));
			list.add(vo);
		}
		return list;
	}

	// 회원정보검색
	public VO memSelect(int userno) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select * from tbl_member_003 where userno=?";
		
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, userno);
		rs = pstmt.executeQuery();
		VO vo = new VO();
		while(rs.next()) {
			vo.setUserno(rs.getInt("userno"));
			vo.setName(rs.getString("name"));
			vo.setPhone1(rs.getString("phone1"));
			vo.setPhone2(rs.getString("phone2"));
			vo.setPhone3(rs.getString("phone3"));
			vo.setGender(rs.getString("gender"));
			vo.setBirthday(rs.getString("Birthday"));
			vo.setRegdate(rs.getString("Regdate"));
		}
		return vo;
	}
	
	// 도서대출 현황 목록
	public List<VO> lentList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select lentno,d.userno, d.name ,bookname,outdate,indate from (" + 
				"    select lentno,userno,B.bookname,outdate,indate " + 
				"         from tbl_booklent_003 A, tbl_bookcode_003 B where A.bookno=B.bookno) S ," + 
				"              tbl_member_003 D where S.userno=D.userno";
		
		List<VO> list = new ArrayList<VO>();
		con = getConnection();
		pstmt=con.prepareStatement(query);
		rs = pstmt.executeQuery();
		VO vo = null; ;
		while(rs.next()) {
			vo = new VO();
			vo.setLentno(rs.getInt("lentno"));
			vo.setUserno(rs.getInt("userno"));
			vo.setName(rs.getString("name"));
			vo.setBookname(rs.getString("bookname"));
			vo.setOutdate(rs.getString("outdate"));
			vo.setIndate(rs.getString("indate"));
			list.add(vo);
		}
		return list;
	}

	// 도서별 대출현황
	public List<VO> bookLentList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select bookno,bookname,regdate,count(outdate) as outcnt,count(indate) as incnt from( " + 
				"    select A.bookno,B.bookname,B.amount, B.regdate,outdate, indate from " + 
				"      tbl_booklent_003 A, tbl_bookcode_003 B where A.bookno=B.bookno) " + 
				"         group by bookno,bookname,regdate order by count(outdate) desc";
		
		List<VO> list = new ArrayList<VO>();
		con = getConnection();
		pstmt=con.prepareStatement(query);
		rs = pstmt.executeQuery();
		VO vo; 
		while(rs.next()) {
			vo = new VO();
			vo.setBookno(rs.getInt("bookno"));
			vo.setBookname(rs.getString("bookname"));
			vo.setRegdate(rs.getString("regdate"));
			vo.setOutcnt(rs.getInt("outcnt"));
			vo.setIncnt(rs.getInt("incnt"));
			list.add(vo);
		}
		return list;
	}
	
/*	
	// 등록 메소드
	public int resInsert(VO vo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="insert into tbl_booklent_002(lentno,custname,bookno,"
				+ "phone,gender,outdate,status) values (?,?,?,?,?,?,'1')";
		int row=0;
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, vo.getLentno());
		pstmt.setString(2, vo.getCustname());
		pstmt.setString(3, vo.getPhone());
		pstmt.setString(4, vo.getGender());
		pstmt.setInt(5, vo.getBookno());
		pstmt.setString(6, vo.getOutdate());
		
		row=pstmt.executeUpdate();
		return row;
	}

	// 도서대출 edit 용 검색
	public VO resEdit(int lentno) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select * from tbl_reservation_001 where lentno=?";
		
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, lentno);
		rs = pstmt.executeQuery();
		VO vo = new VO();
		while(rs.next()) {
			vo.setLentno(rs.getInt("lentno"));
			vo.setCustname(rs.getString("custname"));
			vo.setPhone(rs.getString("phone"));
			vo.setBookno(rs.getInt("bookno"));
			vo.setOutdate(rs.getString("outdate"));
			vo.setIndate(rs.getString("indate"));
			vo.setStatus(rs.getString("status"));
		}
		return vo;
	}

	// 도서정보전체목록
	public List<VO> bookinfoList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select * from tbl_bookinfo_001";
		
		List<VO> list = new ArrayList<VO>();
		con = getConnection();
		pstmt=con.prepareStatement(query);
		rs = pstmt.executeQuery();
		VO vo ;
		while(rs.next()) {
			vo = new VO();
			vo.setBookno(rs.getInt("bookno"));
			vo.setBookname(rs.getString("bookname"));
			list.add(vo);
		}
		return list;
	}
	//도서정보 edit 용 검색
	public VO bookEdit(int bookno) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select * from tbl_bookinfo_001 where bookno=?";
		
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, bookno);
		rs = pstmt.executeQuery();
		VO vo = new VO();
		while(rs.next()) {
			vo.setBookno(rs.getInt("bookno"));
			vo.setBookname(rs.getString("bookname"));
		}
		return vo;
	}

	// 도서별 대출현황
	public List<VO> bookLenList() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select bookno,bookname,count(outdate) as outcnt,count(indate) as incnt,amount-count(outdate)+count(indate) as amount from( " + 
				"    select A.bookno,B.bookname,B.amount, outdate, indate from " + 
				"      tbl_booklent_002 A, tbl_bookcode_002 B where A.bookno=B.bookno) " + 
				"         group by bookno,bookname,amount order by bookname";
		
		List<VO> list = new ArrayList<VO>();
		con = getConnection();
		pstmt=con.prepareStatement(query);
		rs = pstmt.executeQuery();
		VO vo; 
		while(rs.next()) {
			vo = new VO();
			vo.setBookname(rs.getString("bookname"));
			vo.setOutcnt(rs.getInt("outcnt"));
			vo.setIncnt(rs.getInt("incnt"));
			vo.setAmount(rs.getInt("amount"));
			list.add(vo);
		}
		return list;
	}
	// 대출번호를 이용한 검색
	public VO lenSearch(int lentno) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="select * from tbl_booklent_002 where lentno=?";
		
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, lentno);
		rs = pstmt.executeQuery();
		VO vo = new VO();
		while(rs.next()) {
			vo.setLentno(rs.getInt("lentno"));
			vo.setCustname(rs.getString("custname"));
			vo.setPhone(rs.getString("phone"));
			vo.setGender(rs.getString("gender"));
			vo.setBookno(rs.getInt("bookno"));
			vo.setOutdate(rs.getString("outdate"));
		}
		return vo;
	}
	
	//도서 반납처리
	public int lentUpdate(VO vo) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String query="update tbl_booklent_002 set indate=? where lentno=?";
		int row=0;
		con = getConnection();
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, vo.getIndate());
		pstmt.setInt(2, vo.getLentno());
		row = pstmt.executeUpdate();
		return row;
	}

*/
}
