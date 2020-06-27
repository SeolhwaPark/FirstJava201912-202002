import java.sql.*;
import java.sql.Connection;

/*
 * 1. DB연동
 * 2. 검색
 */
public class Exam_01 {
	public static void main(String[] args) {
		//1단계 JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클드라이버 로딩 성공");
		}catch(Exception e){
			e.printStackTrace();
		}
		//2단계 Connection 객체 생성 커넥션 연결
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";
		//오라클의 기본포트 1521
		//실제로 포트번호는 임의로 지정하는게 안전함
		
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;
		
		try {			
			con=DriverManager.getConnection(myURL,myID,myPW);			
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3단계 SQL사용
		Statement stmt = null;
		ResultSet rs = null; //ResultSet결과를 Set으로 받는다 하나씩 꺼내온다 select 등록
		try {
			stmt = con.createStatement(); //새로운 명령문을 만든다고 선언
			rs = stmt.executeQuery("select * from department");//결과를 집어너음
			while(rs.next()) {//존재하면 꺼내오기
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\n");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//4단계 닫기
		try {
			rs.close(); //닫을 때 순서 꺼꾸로 닫기
			stmt.close();
			con.close(); //안하면 해킹의 위험이 있음
			
		} catch (Exception e) {
			
		}
	}

}
