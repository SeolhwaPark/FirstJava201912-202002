import java.util.Scanner;

/*
 * Ű���� �Է�
 * 1.���� 10���� �Է��ϰ� �հ踦 ���
 * 
 * 2.���� 10���� �Է��ϰ� �հ踦 ���(�� �Է� ���� ������ �����Ѵ�)
 * 
 */

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//while();
/*		int cnt = 0; //����
		int tot = 0; //�հ�
		while(true) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			if(var>0) {
				tot+=var;
				cnt++;
			}
		}
		System.out.println("�հ� : " + tot);
*/		
		
		//for();==while(true) ���я�
		int sum = 0;
		for(int x=1; x<=10; x++) { //�����հ� �Ұ��� ����
			System.out.print("���� : ");
			int var = scn.nextInt();
			if(var>0) {
				sum+=var;
			}else {
				x--; //0���� ������ ���̳ʽ�, 0���� ũ�� �÷���
			}
		}
		System.out.println("�հ� : " + sum);
	}

}
