import java.util.Scanner;

/*
 * Ű����� �����Է�
 * 1. 	�Է� ����(2 ~ 100)
 * 2. 	�Էµ� ������ 2������ ��ȯ �� ���
 * 3.	��
 *  	�����Է� : 101 
 *  	�Է¿��� ---> ���Է�
 *  	�����Է� : 10
 *  	10���� (10) : 2����(1010) 
 *  	����
 */

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dec; //10����
		while(true) {
			System.out.print("������ �Է��ϼ��� : ");
			dec = scn.nextInt();
			if(dec >=2 && dec <=100) {
				break;
			}
			System.out.print("�Է� ����! ");
		}
		int temp = dec;//10���� ����
		String bin = ""; // 2���� ����
		int mok, na; //��, ������
		do {
			mok = temp/2; // �� // 8���� ���鶩 temp/8
			na = temp%2; //������
			bin = na + bin; //2����.. na�� ������ ���� �� 
			temp = mok; //
		}while(mok != 0); //!= 0�� ���� ���� ����
		
		System.out.println("10����(" + dec  +")" );
		System.out.println("2����(" + bin  +")" );
	}
}
