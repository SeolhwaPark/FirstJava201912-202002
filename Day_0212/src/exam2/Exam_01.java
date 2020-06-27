package exam2;

import model.DDLDao;

/*
 * DDL 데이터 정의어 : CREATE테이블, ALTER테이블, DROP 테이블
 * DML 데이터 조작어 : CRUD(INSER, SELECT, UPDATE, DELETE)
 * DCL 데이터 제어어 : GRANT(권한부여), REVOKE(권한회수)
 * TCL 트랜젝션제어어 : COMMIT , ROLLBACK, SAVEPOINT
 * 
 * mysql 데이터베이스 안에 클래스를 생성
 * 
 * CREATE DATABASE AA;
 * 
 * PRIMAY KEY 중복을 막고 검색속도가 빠름
 * 
 * INSERT INTO AAA(DNO,DNAME,REGDATE,SCORE)
 *           VALUES(10,'AAA',20200212,90) //날짜는 홀따움표 있어도 없어도 괜춘
 * INSERT INTO AAA VALUES(10,'AAA','20200212',90) //순서가 중요함
 * INSERT INTO AAA(DNO,SCORE)
 *           VALUES(10,90)
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {	
		DDLDao dao = new DDLDao();
		//dao.tabCreate();
		int dno = 10;
		int dname = 11;
		String date = "20200212";
		int score = 90;
		
		int row = dao.insertAAA(dno, dname, date, score);
		
		if(row == 0) {
			System.out.println("실패");
		}else System.out.println("성공");
		
		
		
		

	}

}
