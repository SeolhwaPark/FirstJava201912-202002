/*
 * ������ ����
 * 1.���� ����(static) - Ŭ��������
 * 2.��� (�ν��Ͻ�)
 * 3.��������(�Ű�����)
 * 
 * JVM ����ӽ�
 * �޼ҵ念��(BB), ������(BB ), ���ÿ���(B)
�޼ҵ忡�� ����,Ŭ����, ���� ��ü�� ����,������ ���ÿ� �����ؼ� �޼ҵ忡 ����Ȱ� ������
 */

class BB{
	int a = 10; //�ν��Ͻ�����
	static int b = 20; // Ŭ��������
	
}
public class Exam_04 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		b1.b = 100;
		System.out.println("b1.a =" + b1.a);
		System.out.println("b1.b =" + b1.b);
		System.out.println("b2.a =" + b2.a);
		System.out.println("b2.b =" + b2.b);
		b1.a++;
	}
}
