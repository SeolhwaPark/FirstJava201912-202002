package test01;
/******************************************************************
 * ����
 * super
 * super() ����Ŭ������ ������ ȣ��
 * 
 * 
 * �ڱ��ڽ�
 * this.
 * this() �� Ŭ������ ������ ȣ��
 * 
 ******************************************************************
 */

class CC {
	int x = 10;

	void test() { // ���� super
		System.out.println("x =" + x);
	}
}

class DD extends CC {
	int y = 100;

	void test() { // �������̵� == �޼ҵ带 �ٽ� �����ϴ� ��.
		// ��Ӱ��迡�� ����Ŭ������ �޼ҵ尡 ������ ���ƾ���
		super.test();
		//System.out.print("x =" + x); // �� ����� ���빰�� Ʋ��
		System.out.print("y =" + y);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		CC c1 = new CC();
		c1.test();
		System.out.println("------------------");
		DD d1 = new DD();
		d1.test(); // ����Ŭ������ �������

	}

}
