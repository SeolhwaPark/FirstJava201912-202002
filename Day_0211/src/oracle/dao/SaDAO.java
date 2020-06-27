package oracle.dao;
import java.sql.*;
import java.util.*;

import oracle.db.DBManager;
import oracle.dto.EmpVO;
/*
 * VO�� ���̸� List�� �ȴ�
 */
public class SaDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//�μ����� ���̺� ��ü �˻� �޼ҵ� ����
	public List<EmpVO> deptList(){
		String query = "select * from department";
		
		//����Ÿ�� ����
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO v = new EmpVO();
				v.setEno(rs.getInt("eno"));
				v.setEname(rs.getString("ename"));
				v.setJob(rs.getString("job"));
				list.add(v);
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

}	
