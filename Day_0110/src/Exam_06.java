/*
 *�޼ҵ� ȣ�� ��� 
 *1. ���� ���� ȣ��
 *2. ������ ���� ȣ�� 
 * 
 * 
 */
public class Exam_06 {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("-------------------------");
		//a,b��ȯ
		
		swap(a,b);
		
/*		int c = a;
		a=b;
		b=c;
*/
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
	//��ȯ �޼ҵ�
	static void swap(int a, int b) { //���� ���� ȣ�� ,�� �ȿ����� �ٲ�
		int c = a;
		a = b;
		b = c;
	}
}
