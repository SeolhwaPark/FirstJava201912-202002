package selfModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class ResumeDAO {
	private ResumeDAO() {
	}

	private static ResumeDAO instance = new ResumeDAO();

	public static ResumeDAO getInstance() {
		return instance;
	}

	public Connection getConnection() { // 커넥션풀 이용
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
	
	//입력
//	public int resumeInsert(ResumeVO vo) {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String query = "INSERT INTO blog_resume"
//				+ "(idx, school, school2, school3, intern, job, job2, job3, job4, job5, job6,"
//				+ " skill, skill2, skill3, skill4, skill5, languages, languages2, languages3,"
//				+ " qualifications,qualifications2,qualifications3,qualifications4,"
//				+ " fotoname) VALUES(blog_seq_idx.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//		int row = 0;
//
//		try {
//			con = getConnection();
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, vo.getSchool());
//			pstmt.setString(2, vo.getSchool2());
//			pstmt.setString(3, vo.getSchool3());
//			pstmt.setString(4, vo.getIntern());
//			pstmt.setString(5, vo.getJob());
//			pstmt.setString(6, vo.getJob2());
//			pstmt.setString(7, vo.getJob3());
//			pstmt.setString(8, vo.getJob4());
//			pstmt.setString(9, vo.getJob5());
//			pstmt.setString(10, vo.getJob6());
//			pstmt.setString(11, vo.getSkill());
//			pstmt.setString(12, vo.getSkill2());
//			pstmt.setString(13, vo.getSkill3());
//			pstmt.setString(14, vo.getSkill4());
//			pstmt.setString(15, vo.getSkill5());
//			pstmt.setString(16, vo.getLanguages());
//			pstmt.setString(17, vo.getLanguages2());
//			pstmt.setString(18, vo.getLanguages3());
//			pstmt.setString(19, vo.getQualifications());
//			pstmt.setString(20, vo.getQualifications2());
//			pstmt.setString(21, vo.getQualifications3());
//			pstmt.setString(22, vo.getQualifications4());
//			pstmt.setString(23, vo.getFotoname());
//			row = pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return row;
//	}
	
	//리스트
	public List<ResumeVO> resumeList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_resume";
		List<ResumeVO> list = new ArrayList<ResumeVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ResumeVO vo = new ResumeVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSchool(rs.getString("school"));
				vo.setSchool2(rs.getString("school2"));
				vo.setSchool3(rs.getString("school3"));
				vo.setIntern(rs.getString("intern"));
				vo.setJob(rs.getString("job"));
				vo.setJob2(rs.getString("job2"));
				vo.setJob3(rs.getString("job3"));
				vo.setJob4(rs.getString("job4"));
				vo.setJob5(rs.getString("job5"));
				vo.setJob6(rs.getString("job6"));
				vo.setSkill(rs.getString("skill"));
				vo.setSkill2(rs.getString("skill2"));
				vo.setSkill3(rs.getString("skill3"));
				vo.setSkill4(rs.getString("skill4"));
				vo.setSkill5(rs.getString("skill5"));
				vo.setLanguages(rs.getString("languages"));
				vo.setLanguages2(rs.getString("languages2"));
				vo.setLanguages3(rs.getString("languages3"));
				vo.setQualifications(rs.getString("qualifications"));
				vo.setQualifications2(rs.getString("qualifications2"));
				vo.setQualifications3(rs.getString("qualifications3"));
				vo.setQualifications4(rs.getString("qualifications4"));
				vo.setFotoname(rs.getString("fotoname"));
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
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	//리스트22222222222
	public List<ResumeVO> resumeList(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from blog_resume where idx=?";
		List<ResumeVO> list = new ArrayList<ResumeVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,idx);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ResumeVO vo = new ResumeVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSchool(rs.getString("school"));
				vo.setSchool2(rs.getString("school2"));
				vo.setSchool3(rs.getString("school3"));
				vo.setSchool4(rs.getString("school4"));
				vo.setIntern(rs.getString("intern"));
				vo.setJob(rs.getString("job"));
				vo.setJob2(rs.getString("job2"));
				vo.setJob3(rs.getString("job3"));
				vo.setJob4(rs.getString("job4"));
				vo.setJob5(rs.getString("job5"));
				vo.setJob6(rs.getString("job6"));
				vo.setJob7(rs.getString("job7"));
				vo.setJob8(rs.getString("job8"));
				vo.setSkill(rs.getString("skill"));
				vo.setSkill2(rs.getString("skill2"));
				vo.setSkill3(rs.getString("skill3"));
				vo.setSkill4(rs.getString("skill4"));
				vo.setSkill5(rs.getString("skill5"));
				vo.setSkill6(rs.getString("skill6"));
				vo.setLanguages(rs.getString("languages"));
				vo.setLanguages2(rs.getString("languages2"));
				vo.setLanguages3(rs.getString("languages3"));
				vo.setLanguages4(rs.getString("languages4"));
				vo.setQualifications(rs.getString("qualifications"));
				vo.setQualifications2(rs.getString("qualifications2"));
				vo.setQualifications3(rs.getString("qualifications3"));
				vo.setQualifications4(rs.getString("qualifications4"));
				vo.setQualifications5(rs.getString("qualifications5"));
				vo.setQualifications6(rs.getString("qualifications6"));
				vo.setFotoname(rs.getString("fotoname"));
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
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//수정
		public int resumeModify(ResumeVO vo) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query =  "update blog_resume set school=?, school2=?, school3=?, school4=?, "
					+ "intern=?, job=?, job2=?, job3=?, job4=?, job5=?, job6=?, job7=?, job8=?, "
					+ "skill=?, skill2=?, skill3=?, skill4=?, skill5=?, skill6=?, "
					+ "languages=?, languages2=?, languages3=?, languages4=?, "
					+ "qualifications=?, qualifications2=?, qualifications3=?, qualifications4=?,"
					+ " qualifications5=?, qualifications6=?, fotoname=? where idx=?";
			int row = 0;

			try {
				con = getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, vo.getSchool());
				pstmt.setString(2, vo.getSchool2());
				pstmt.setString(3, vo.getSchool3());
				pstmt.setString(4, vo.getSchool4());
				pstmt.setString(5, vo.getIntern());
				pstmt.setString(6, vo.getJob());
				pstmt.setString(7, vo.getJob2());
				pstmt.setString(8, vo.getJob3());
				pstmt.setString(9, vo.getJob4());
				pstmt.setString(10, vo.getJob5());
				pstmt.setString(11, vo.getJob6());
				pstmt.setString(12, vo.getJob7());
				pstmt.setString(13, vo.getJob8());
				pstmt.setString(14, vo.getSkill());
				pstmt.setString(15, vo.getSkill2());
				pstmt.setString(16, vo.getSkill3());
				pstmt.setString(17, vo.getSkill4());
				pstmt.setString(18, vo.getSkill5());
				pstmt.setString(19, vo.getSkill6());
				pstmt.setString(20, vo.getLanguages());
				pstmt.setString(21, vo.getLanguages2());
				pstmt.setString(22, vo.getLanguages3());
				pstmt.setString(23, vo.getLanguages4());
				pstmt.setString(24, vo.getQualifications());
				pstmt.setString(25, vo.getQualifications2());
				pstmt.setString(26, vo.getQualifications3());
				pstmt.setString(27, vo.getQualifications4());
				pstmt.setString(28, vo.getQualifications5());
				pstmt.setString(29, vo.getQualifications6());
				pstmt.setString(30, vo.getFotoname());
				pstmt.setInt(31, vo.getIdx());
				row = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
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
			return row;
		}
	
	
	//삭제
		public int resumeDelete(int idx) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "delete from blog_resume where idx=?";
			int row = 0;

			try {
				con = getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, idx);
				row = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
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
			return row;
		}
	
	
	

}
