package student;
/*
 *  * ���
 * �й�	  �̸� 	����		����(����� ����)
 * 1-1-1  ȫ�浿 	95 		A
 * �й��� �ߺ�üũ�� �����ϸ�..!
 */
public class Student {
	int hak; //�г�
	int ban; //��
	int bun; //��ȣ
	String name; //�̸�
	int score; //����
	String hj; //����
	
	Student(){}
	
	Student(String[] arr){
		this.hak = Integer.parseInt(arr[0]);
		this.ban = Integer.parseInt(arr[1]);
		this.bun = Integer.parseInt(arr[2]);
		this.name = arr[3];
		this.bun = Integer.parseInt(arr[4]);
	}
	//System.out.println(list)
	//Object obj = list.get(0);
	
	
	
}
