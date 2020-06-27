package model.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class memberDAO {
	//회원정보등록
	public boolean memberInsert(memberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into tbl_member(idx,name,userid,passwd,gubun,zipcode,addr1,addr2,tel,email,job,intro,favorite) "
				+ "values(tbl_member_seq_idx.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		boolean flag = false;
		try {
			con = DBManager.getInstance().getConnection();
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
			con = DBManager.getInstance().getConnection();
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
			con = DBManager.getInstance().getConnection();
			pstmt = con.prepareStatement(query);
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
	public List<memberVO> memberList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from tbl_member order by userid desc";
		List<memberVO> list = new ArrayList<memberVO>();
		
		try {
			con = DBManager.getInstance().getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				memberVO vo = new memberVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setPasswd(rs.getString("passwd"));
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
				con = DBManager.getInstance().getConnection();
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
		public memberVO memberSelect(String user) {
			memberVO vo = null;
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String query = "select * from tbl_member where userid=?";
			
			try {
				con = DBManager.getInstance().getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, user);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new memberVO();
					vo.setIdx(rs.getInt(1));
					vo.setName(rs.getString(2));
					vo.setUserid(rs.getString(3));
					vo.setPasswd(rs.getString(4));
					vo.setGubun(rs.getString(5));
					vo.setZipcode(rs.getString(6));
					vo.setAddr1(rs.getString(7));
					vo.setAddr2(rs.getString(8));
					vo.setTel(rs.getString(9));
					vo.setEmail(rs.getString(10));
					vo.setJob(rs.getString(11));
					vo.setIntro(rs.getString(12));
					vo.setFavorite(rs.getString(13));
					vo.setFirst_time(rs.getString(14));
					vo.setLast_time(rs.getString(15));
					
					
				}
			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt!= null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return vo;
		}
	
	//회원정보 수정
	public int memberModify(memberVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query ="update tbl_member set name=?,passwd=?,gubun=?,zipcode=?,"
				+ "addr1=?,addr2=?,tel=?,email=?,job=?,intro=?,favorite=? where idx=?";
		int row = 0;
		try {
			con = DBManager.getInstance().getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,vo.getName());
			pstmt.setString(2,vo.getPasswd());
			pstmt.setString(3,vo.getGubun());
			pstmt.setString(4,vo.getZipcode());
			pstmt.setString(5,vo.getAddr1());
			pstmt.setString(6,vo.getAddr2());
			pstmt.setString(7,vo.getTel());
			pstmt.setString(8,vo.getEmail());
			pstmt.setString(9,vo.getJob());
			pstmt.setString(10,vo.getIntro());
			pstmt.setString(11,vo.getFavorite());
			pstmt.setInt(12, vo.getIdx());
			row = pstmt.executeUpdate();
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
		return row;
	}
	
	
	
}
