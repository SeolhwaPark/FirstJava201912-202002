import java.util.Scanner;

/*
 * ������ ���� �� , ū ���� ���� �� ã��
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("���� 1 : ");
		int a = scn.nextInt();
		System.out.print("���� 2 : ");
		int b = scn.nextInt();
		System.out.print("���� 3 : ");
		int c = scn.nextInt();
		
		int max = 0;//���� ū �� ����
		if(a>b) { //a�� Ŭ ��
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c) { //b�� Ŭ ��
				max = b;
			}else {
				max = c;
			}
		}
		
		
	}

}
