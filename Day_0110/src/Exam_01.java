/*
 * �޼ҵ�(�Լ�)�� ���� �� ȣ��
 * �Է��ؼ� ����ؼ� ���
 * �Է¸żҵ�,���ĸ޼ҵ�,��¸޼ҵ�
 * 
 * �޼ҵ����� �ɺθ��� ����
 * 
 * ���������� :�޼ҵ带 �� �� �ִ� ���� = public��δ�, private����, �ϰ͵� �Ⱦ��� ������ ����
 * ����Ÿ�� : ����۾�
 * �޼ҵ��(�Ű�����): ���(����)
 * 
 * 	public�������� ,static void ����Ÿ�Ծ���, 
 * main�� �޼ҵ�(String[]�ڷ������ڿ��� �迭 args����)

�޼ҵ� �ȿ� �� �ϳ��� �޼ҵ�� �� �� ����
 * 
 */
public class Exam_01 {
// ����Ÿ�� x, �Ű����� x = �����Ӱ� �ض�~ �׷� ����
	static void printA() {
		System.out.println("Method test"); //2
	}
	public static void main(String[] args) {
		System.out.println("Method call test"); //1
		printA();
		System.out.println("Method call test End"); //3


	}

}
