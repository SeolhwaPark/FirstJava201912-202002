package jslhrd6;

public class Exam_10 {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		//int b[] = a; == �ּҺ���
		for(int x = 0 ; x < a.length ; x++) {
			b[x] = a[x]; // �迭����, ��ü�� ���� ���� == clone,.. 
			//Ŭ������ �ּҰ� �������,�������� ��ü�� ������ �� ����
		}
		
		b[0] = 77;
		int c[] = a.clone();
		c[1] = 99;
		
		for(int x = 0 ; x < a.length ; x++) {
			System.out.println(a[x] + "\t" + b[x] + "\t" + c[x]);
		}
	}
}

//�Ф�..���� ..�Ф� ���ڷ��� ����