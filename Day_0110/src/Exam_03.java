/*
 * 1~10 �հ� ���
 * ��� : 1~10 =55
 * 
 * ����Ÿ���� ���� �Ű������� �ִ� ���
 */
public class Exam_03 {

	public static void main(String[] args) {
		sum(1000); //�Ű������� �ִ� ���. �Ű������� ��� �ڷ����� ���� �� ����
		//������ �ڷ���, �迭���� ���� �� ����
	}
	static void sum(int a) {
		int sum = 0;
		for(int x= 1; x<=a; x++) {
			sum += x;
		}
		System.out.println("1~" + a + "=" + sum);
	}
}
