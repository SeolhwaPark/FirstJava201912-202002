package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class DAO {
	public DAO() {}

	// 학생성적 등록
	public int StudentInsert(VO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into tbl_score_001(bun,name,gender,kor,eng,mat,regdate) values(?,?,?,?,?,?,?)";
		int flag = 0;

		try {
			con = DBManager.getInstance().getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, vo.getBun());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getGender());
			pstmt.setInt(4, vo.getKor());
			pstmt.setInt(5, vo.getEng());
			pstmt.setInt(6, vo.getMat());
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	// 학생성적 조회
	public List<VO> StudentView() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<VO> list = new ArrayList<VO>();
		String query = "select * from tbl_score_001";
		try {
			con = DBManager.getInstance().getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				VO vo = new VO();
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				String gender = rs.getString("gender");
				if (gender.equalsIgnoreCase("m")) {
					gender = "남자";
				} else {
					gender = "여자";
				}
				vo.setGender(gender);
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMat(rs.getInt("mat"));
				int sum = vo.getKor() + vo.getEng() + vo.getMat();
				vo.setSum(sum);
				double avg = (int) ((sum / 3.) * 100) / 100.;
				vo.setAvg(avg);
				String level = "";
				if ((int) avg >= 90) {
					level = "수";
				} else if ((int) avg >= 80) {
					level = "우";
				} else if ((int) avg >= 70) {
					level = "미";
				} else if ((int) avg >= 60) {
					level = "양";
				} else {
					level = "가";
				}
				vo.setLevel(level);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}




























