package test01;

/*��ü������ �ǻ�Ȱ�� �޿�
 * 310p
 * ��Ӱ� ����� �ٸ�
 * �ڹٿ����� ���߻���� �Ұ���
 * 
 * Ŭ�������̾�׷�
 * 
 * Ŭ������ Ŭ������ ���� -> ��ӹ޴´�
 * 		+ public ->��Ӱ���
 *		# protected ->��Ӱ���
 *		defalt(������� ���� ����) ->��Ӱ���
 *
 * 		- private -> ���� ��Ӿȵ�
 * 
 * 		<<>> �������̽��� Ŭ������ ���� -> �����Ѵ�
 * 
 */

class AA {
	int a = 10, b = 20;
	private int c = 30;

	void print() {
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
	}
}

class BB extends AA { // ��ӹ޴� ��
	int d = 100;

	void test() {
		System.out.println("a =" + a + 100);
		System.out.println("b =" + b + 100);
		// System.out.println("c =" + c + 100);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.print();
		BB b1 = new BB();
		b1.print();
		b1.test();

	}

}
