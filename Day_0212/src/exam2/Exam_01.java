package exam2;

import model.DDLDao;

/*
 * DDL ������ ���Ǿ� : CREATE���̺�, ALTER���̺�, DROP ���̺�
 * DML ������ ���۾� : CRUD(INSER, SELECT, UPDATE, DELETE)
 * DCL ������ ����� : GRANT(���Ѻο�), REVOKE(����ȸ��)
 * TCL Ʈ����������� : COMMIT , ROLLBACK, SAVEPOINT
 * 
 * mysql �����ͺ��̽� �ȿ� Ŭ������ ����
 * 
 * CREATE DATABASE AA;
 * 
 * PRIMAY KEY �ߺ��� ���� �˻��ӵ��� ����
 * 
 * INSERT INTO AAA(DNO,DNAME,REGDATE,SCORE)
 *           VALUES(10,'AAA',20200212,90) //��¥�� Ȧ����ǥ �־ ��� ����
 * INSERT INTO AAA VALUES(10,'AAA','20200212',90) //������ �߿���
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
			System.out.println("����");
		}else System.out.println("����");
		
		
		
		

	}

}
