/*
 * �迭�� ����� ���� �ʱ�ȭ
 *  ���ϴ� ������ �ʱ�ȭ�Ϸ���...->  int[] a = {}; 
 */

public class Exam_04 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,45,67,5,89,7,54,5}; // �ε����� 9���� ��
		//int a[] = new int [9];
		//a[0]=1;
		// �迭�� ���̸� ����ؾ��� ��  : ���� ��� a.length
		System.out.println("�迭 ���� : " + a.length);// �迭�� ���̸� ���
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+ i +"]= " + a[i]);
		}
		
	}

}
