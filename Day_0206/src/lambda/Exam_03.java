package lambda;

//�ϳ����� �޼ҵ带 ���� �����ϱ� ���ؼ�....�������̽��� ��ȸ�� �Լ����� == ����

interface BBB{
	void test(int x);
	
}
public class Exam_03 {
	public static void main(String[] args) {
		BBB b; //�������̽� ����
		b =(x)->{ //�������̵�����...�Լ�, ������ �������� ��
			int result = 100;
			System.out.println(x*result);
		};
		
		b.test(5); //�Լ��� ȣ��. 5�� x�� ���Ե�
		
		
	}

}
