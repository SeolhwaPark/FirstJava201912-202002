/*
 * ���׿������� �⺻ (�Ǵ� ���ǿ����ڶ�� �Ҹ���)
 * ���� �����
 * 
 * ���������� ������. ��������� ���� ����
 * A += 2; (a=a+2) 
 * B -= 3; (b=b-3)
 * C *= 4; (c=c*4)
 */
public class Exam_04 {
	public static void main(String[] args) {
		//(���ǽ�) ? �� : ���� ;
		//int a = (10>5) ? 10: 5; // ���̸� 10�� ����, �����̸� 5�� ����
		//System.out.println("10>5 = " + a);
		//int a = 70 , b = 80;
		int a = 7 , b = 8;
		int max = (a>b) ? a : b ;
		int min = (a>b) ? b : a ;
		
		System.out.println("ū �� : " + max);
		System.out.println("���� �� : " + min);
	}

}
