import java.util.Scanner;

/*
 * Ű���� �Է�
 * 1.���� 10���� �Է��ϰ� �հ踦 ���
 * 
 * 2.���� 10���� �Է��ϰ� �հ踦 ���(�� �Է� ���� ������ �����Ѵ�)
 * 
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//for();
		int sum = 0;
		for(int x=1; x<=10; x++) { //������ ����
			System.out.print("���� : ");
			int var = scn.nextInt();
			sum+=var;
		}
		System.out.println("�հ� : " + sum);
		
		//while();
		int cnt = 0; //����
		int tot = 0; //�հ�
		while(cnt<10) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			tot+=var;
			cnt++;
		}
		System.out.println("�հ� : " + tot);
	}

}
