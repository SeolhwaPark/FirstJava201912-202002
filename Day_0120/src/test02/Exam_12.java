package test02;

/* �������̽�(interface) ���� , ���߻���� ����...�������̽��ȿ� �ִ� ��� �޼ҵ尡 100%�� �߻�ȭ
 * ���, �߻�޼ҵ常 ����. ��ɸ� ����ִ� ����
 * 	�����ڵ�  �������̽�  ��ü
 * 
 */
interface Car{ // �������̽� �ȿ� ������ �ڵ������� �߻�ȭ��
	static final int MAX = 100;
	void test(); // �߻�޼ҵ�
	int sum(int x, int b);
	//void aa() { �̷��� ������ �� ����
		
	//}
}

//interface Truck extends Car{ // �������̽��� Ŭ������ ���� �� ����
//	void aa(); // �߻�޼ҵ�


//�������̽��� ����
class Truck implements Car{
	@Override
	public int sum(int x, int b) {
		return 0;
	}
	@Override
	public void test() {
		
	}
}

public class Exam_12 {
	public static void main(String[] args) {
		
		
		
		
	}

}
