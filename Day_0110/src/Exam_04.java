/*
 * 1~10 �հ� ���
 * ��� : 1~10 =55
 * 
 * ����Ÿ���� ���� �Ű������� �ִ� ���
 */
public class Exam_04 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50}; 
		aPrint(a); //�迭�� �ּҰ� �Ѿ
		int b = 100;
		bPrint(b);
	}
	static void bPrint(int b) { //�۾��� ������ �����Ͱ� �����
		System.out.println(b);

	}
	static void aPrint(int[] dd) { //�ּҸ� ������ 
		for(int x= 0; x<dd.length; x++) {
		System.out.println(dd[x]);

		}
	
	}
}
