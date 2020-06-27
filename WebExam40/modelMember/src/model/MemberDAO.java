package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	private MemberDAO() {
	}

	public static MemberDAO instance = new MemberDAO(); // 객체생성 싱글톤방식. 메모리에 저장되어 있응

	public static MemberDAO getInstance() {// 메소드호출
		return instance;
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jsl40", "1234");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	//회원정보등록
	public boolean memberInsert(MemberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into tbl_member(idx,name,userid,passwd,gubun,zipcode,addr1,addr2,tel,email,job,intro,favorite) "
				+ "values(tbl_member_seq_idx.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		boolean flag = false;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,vo.getName());
			pstmt.setString(2,vo.getUserid());
			pstmt.setString(3,vo.getPasswd());
			pstmt.setString(4,vo.getGubun());
			pstmt.setString(5,vo.getZipcode());
			pstmt.setString(6,vo.getAddr1());
			pstmt.setString(7,vo.getAddr2());
			pstmt.setString(8,vo.getTel());
			pstmt.setString(9,vo.getEmail());
			pstmt.setString(10,vo.getJob());
			pstmt.setString(11,vo.getIntro());
			pstmt.setString(12,vo.getFavorite());
			flag = pstmt.execute();
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	//id중복검사
	public int memberIdCheck(String userid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select count(*) from tbl_member where userid = ?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	//우편번호 검색
	
	public List<Zipcode> zipcodeList(String addr) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from zipcode where dong like '%" + addr + "%'";
		//String query1 = "select * from zipcode where dong like ?";

		List<Zipcode> list = new ArrayList<Zipcode>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			//pstmt = con.prepareStatement(query1);			
			//pstmt.setString(1, "%"+addr+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Zipcode zip = new Zipcode();
				zip.setZipcode(rs.getString("zipcode"));
				zip.setSido(rs.getString("sido"));
				zip.setGugun(rs.getString("gugun"));
				zip.setDong(rs.getString("dong"));
				zip.setBunji(rs.getString("bunji"));
				list.add(zip);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	//회원 전체 목록 검색 (관리자)
	public List<MemberVO> memberList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from tbl_member order by userid desc";
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setGubun(rs.getString("gubun"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setAddr1(rs.getString("addr1"));
				vo.setAddr2(rs.getString("addr2"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setJob(rs.getString("job"));
				vo.setIntro(rs.getString("intro"));
				vo.setFavorite(rs.getString("favorite"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//로그인 검사(id,pass 체크)
	public int memberLogin(String userid, String passwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select passwd from tbl_member where userid=?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String pass = rs.getString("passwd");
				if(pass.equals(passwd)) {
					//로그인 성공
					query = "update tbl_member set last_time = sysdate where userid=?";
					pstmt= con.prepareStatement(query);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
					row = 1;
					
				}else {
					//로그인 실패 비번 오류
					row = 0;
				}
			}else {
				//아이디 입력이 안되어있은ㅁ
				row = -1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	
	//id 또는 기본키에 해당하는 회원정보 (검색 하나만 검색할 거임)
	
	
	
	//회원정보 수정
	
	
	
	//회원정보 삭제
	
	
	
	
	
	
}
