package exam2;

import model.DDLDao;

/*
 * Update 테비블명 set 항목 = 값, 항목 = 값 where 조건식
 * update aaa set dname = 'dddd',score = 100 where dno=10;
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		int dno = 10;
		int dname = 99;
		int score = 100;
		
		DDLDao dao = new DDLDao();
		int row = dao.aaaUpdate(dno,dname,score);
		if(row ==0) {
			System.out.println("실패");
		}else System.out.println("성공");
	}
}
