package student;

import java.util.List;
/*
 *  * ���
 * �й�	  �̸� 	����		����(����� ����)
 * 1-1-1  ȫ�浿 	95 		A
 * �й��� �ߺ�üũ�� �����ϸ�..!
 * 
 */
public class StudentData {
	Student[] arr;
	List list ;
	int cnt;
	
	StudentData(){}
	StudentData(List list,int cnt){
		this.list = list;
		this.cnt = cnt;
	}
	
	private void StudentPrint() {
		System.out.println("�й�\t�̸�\t����\t����");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
}
