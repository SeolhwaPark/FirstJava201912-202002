/*p.203
 * ��ü������ - ��ü �� �繰,��ü, ���� ���� ��� ���....
 * oop ��ü���� ���α׷��� object oriented programming
 * ��뼺 Ȯ�强 ��������
 
 * 
 * 1.��ü�𵨸� - ���(�޼ҵ�),�Ӽ�(����) - >Ư¡(����)�� ����� ���
 * 2.class���� (����) - 
 * 3.��ü�� ���� �� ���
 * 
 * 		object ��ü
 * 
 * 		class ��ü�� ����� ���� ���赵
 * 
 * 		method �Լ�(�ɺθ���)
 
�л� Ŭ������ ����
 	��� - �������, �򱺰�� , ���
	�Ӽ� - �̸�, ��ȣ ���� ���� ���� ���� ��� ����
 */

class Student{ //������������ ���尡�� �ڷ���, ���� Ŭ�������� ���� ���� �ڷ���, ��ü ���赵
	//�Ӽ�
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	void  totAccount() { // ����
		tot = kor + eng + mat;
		//(���������� ����Ÿ�� �޼ҵ� �Ű�����)
	}
	void aveAccount() { //���
		ave = tot/3.;
	}
	void dataPrint() {
		System.out.println("����ǥ");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.print(hakbun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\n");
	
	}
	
}
public class Exam_01 {
	public static void main(String[] args) { //main ���赵�� ������ ����� �ϴ�, ��ü����...
		Student stu; //���۷��� ==������ ���� (�ν��Ͻ� == ��ü�� ����Ŵ) ��ü�� ������ ����
		stu = new Student();// �ν��Ͻ� ���� //
		Student s = new Student() ;
		stu.hakbun = 1101;
		stu.name = "ȫ�浿" ;
		stu.kor = 90;
		stu.eng = 80;
		stu.mat = 88;
		
		stu.dataPrint();
		s.dataPrint();
	}

}
