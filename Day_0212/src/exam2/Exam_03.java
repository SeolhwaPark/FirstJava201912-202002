package exam2;

import model.DDLDao;

/*
 * delete from ���̺� where���ǽ�
 * delete�� �ѹ��� �Ѹ��� ���ڵ带 ������. �ݵ�� �������� ������
 * delete from aaa where dno=10
 */
public class Exam_03 {
	public static void main(String[] args) {
		int dno = 10;
		DDLDao dao = new DDLDao();
		int row = dao.aaaDelete(dno);
		if(row ==0) {
			System.out.println("����");
		}else System.out.println("����");

	}
}
