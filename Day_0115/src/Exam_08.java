/*
 * ��ü��
 */

class DataA{
	static int id = 10; // ������� �ʱ�ȭ,��ÿ �������� �ʾƵ� staticŬ������ �ε��� ���� ��������� �ݹ� ȣ�Ⱑ��
	int pw = 111; // ����� �� �������
}
public class Exam_08 {
	public static void main(String[] args) {
		DataA a1 = new DataA(); //�ּҰ��� �ٸ�
		a1.id = 333;
		DataA.id = 444;
		
		DataA a2 = new DataA();// ������ ��ü�� �ƴ� 
		
		System.out.println("a1 == a2 :" + (a1 == a2));
		
		
		
	}

}
