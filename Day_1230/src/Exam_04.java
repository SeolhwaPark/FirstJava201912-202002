import java.util.Scanner;

/*
 * ���� 2�� �Է�
 *  ���� �� ���� ���̰� 10�̻��̸� ū ���� -5, ���� ���� +5
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("���� 1 : ");
		int a = scn.nextInt();
		System.out.print("���� 2 : ");
		int b = scn.nextInt();
		//�� ���� ���� ���
		int c = 0;
		if(a>=b) {
			c = a - b;
		}
		if(a<b) {
			c = -b - a;
		}
		if(c>=10) {
			if(a>=b) {
				a = a - 5;
				b = b + 5;
			}
			if(a<b) {
				b = b - 5;
				a = a + 5;
			}
		}
		System.out.println("");
	}

}