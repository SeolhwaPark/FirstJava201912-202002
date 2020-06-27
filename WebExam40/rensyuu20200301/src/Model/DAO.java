package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DB.DBManager;

public class DAO {
	DBManager manager = DBManager.getInstance();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//로그인 체크
    public int loginCheck(String idx, String pass) {
       
        String dbPW = ""; // db에서 꺼낸 비밀번호를 담을 변수
        int x = -1;
 
        try {
            // 쿼리 - 먼저 입력된 아이디로 DB에서 비밀번호를 조회한다.
            String query = "select password from tbl_board where idx =?";
 
            con = manager.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
            
            pstmt.setString(1, idx);
            rs = pstmt.executeQuery();
 
            if (rs.next()) // 입려된 아이디에 해당하는 비번 있을경우
            {
                dbPW = rs.getString("password"); // 비번을 변수에 넣는다.
 
                if (dbPW.equals(pass)) 
                    x = 1; // 넘겨받은 비번과 꺼내온 배번 비교. 같으면 인증성공
                else                  
                    x = 0; // DB의 비밀번호와 입력받은 비밀번호 다름, 인증실패
                
            } else {
                x = -1; // 해당 아이디가 없을 경우
            }
 
            return x;
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                
            	
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
	
	
	//회원가입
	
	
	
	
	//게시글 전체 카운트
		public int boardCount() {
			String query = "select count(*) as counter from tbl_board";
			int cnt = 0;
			try {
				con = manager.getConnection();
				pstmt = con.prepareStatement(query);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					cnt = rs.getInt("counter");
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
			return cnt;
		}
		
		//게시물 전체 목록 메소드
		public List<VO> boardList() {
			String query = "select * from tbl_board  order by idx desc";
			List<VO> list = new ArrayList<VO>();
			try {
				con = manager.getConnection();
				pstmt = con.prepareStatement(query);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					VO vo = new VO();
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setSubject(rs.getString("subject"));
					vo.setRegdate(rs.getString("regdate"));
					vo.setReadcnt(rs.getInt("readcnt"));
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
		//게시글 등록
		
		public int boardWrite(VO vo) {
			String query = "insert into tbl_board(idx,name,email,subject,contents,pass)"
			                + "values(tbl_board_seq_idx.nextval,?,?,?,?,?)";
			int row = 0;
			try {
				con = manager.getConnection();
				pstmt = con.prepareStatement(query);
				
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getEmail());
				pstmt.setString(3, vo.getSubject());
				pstmt.setString(4, vo.getContents());
				pstmt.setString(5, vo.getPass());
				row=pstmt.executeUpdate();
				
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
		//특정 게시글 조회수 증가
		//특정 게시글 선택
				public void boardCntUp(int idx) {
					String query = "update tbl_board set readcnt = readcnt+1 where idx=?";
					
					try {
						con = manager.getConnection();
						pstmt = con.prepareStatement(query);
						pstmt.setInt(1, idx);
						pstmt.executeUpdate();
						
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
				}
				
		//특정 게시글 선택
			public VO boardSelect(int idx) {
				String query = "select * from tbl_board where idx=?";
				VO vo = new VO();
				try {
					con = manager.getConnection();
					pstmt = con.prepareStatement(query);
					pstmt.setInt(1, idx);
					rs = pstmt.executeQuery();
					if(rs.next()) {
						vo.setIdx(rs.getInt("idx"));
						vo.setName(rs.getString("name"));
						vo.setSubject(rs.getString("subject"));
						vo.setContents(rs.getString("contents"));
						vo.setRegdate(rs.getString("regdate"));
						vo.setReadcnt(rs.getInt("readcnt"));
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
				return vo;
			}
			//수정
			
			public int boardModify(VO vo) {
					String query = "update tbl_board set email=? ,subject=?, contents=? where idx=? and pass=?";
					int row=0;
					try {
						con = manager.getConnection();
						pstmt = con.prepareStatement(query);
						pstmt.setString(1, vo.getEmail());
						pstmt.setString(2, vo.getSubject());
						pstmt.setString(3, vo.getContents());
						pstmt.setInt(4, vo.getIdx());
						pstmt.setString(5, vo.getPass());
						row= pstmt.executeUpdate();
						
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
			//삭제
			public int boardDelete(int idx,String pass) {
				String query = "delete from tbl_board where idx=? and pass=?";
				int row=0;
				try {
					con = manager.getConnection();
					pstmt = con.prepareStatement(query);
					pstmt.setInt(1, idx);
					pstmt.setString(2, pass);
					row= pstmt.executeUpdate();
					
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

}
