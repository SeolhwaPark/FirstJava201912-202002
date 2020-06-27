package exam2;

import model.DDLDao;

/*
 * delete from 테이블 where조건식
 * delete는 한번에 한명의 레코드를 삭제함. 반드시 조건절이 들어가야함
 * delete from aaa where dno=10
 */
public class Exam_03 {
	public static void main(String[] args) {
		int dno = 10;
		DDLDao dao = new DDLDao();
		int row = dao.aaaDelete(dno);
		if(row ==0) {
			System.out.println("실패");
		}else System.out.println("성공");

	}
}
