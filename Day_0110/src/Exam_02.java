/*
 * 1~10 �հ� ���
 * ��� : 1~10 =55
 * 
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		sum(); //���� ȣ���ؼ� ����� �κ�
	}
	static void sum() {
		int sum = 0;
		for(int x= 1; x<=10; x++) {
			sum += x;
		}
		System.out.println("1~10 =" + sum);
	}
}
