/*�ڹ��� ���� p.91 ������
 * 
 * ���������� : ~ (��ǻ�ʹ� 2�� ����)
 * 00000111 -> 11111010 +1 = 11111011(-5)
 * ���������ڴ� 2�� ������ ���ϱ� �տ� ���̳ʽ� ���̰� +1���� = 5 -> -6
 * 
 * ! true -> not(����)
 * boolean sw = false -> !sw = true
 * int a = (int)3.14
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a = " + a++); // 6
		System.out.println("a = " + a--); // 5
		System.out.println("a = " + -a); // -5 
		System.out.println("a = " + ~a); // -6 
		System.out.println("a = " + (float)a); // 5.0 �Ǽ�
		System.out.println("a = " + (a>3)); // true
		System.out.println("a = " + !(a>3)); // false
	}

}
