import java.util.Scanner;

/*Ű���� �Է�
 *�ڷ� ������ �Է�
 *�Է� ��; 10,80,60,90,95.......-1
 *��, �Է��ڷῡ ������ �ԷµǸ� ����� ���ÿ�,
 *�Է� �ڷ��� 50 ~ 90 ������ �ڷḸ *�հ�*�� *���* ���
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; 
		int sum = 0; 
		int var = 0;
		int n = 0;
		while(true) {
			System.out.println("�Է� : ");
			var = scn.nextInt();
			if(var<0) 
				break; //���ѹݺ�
			}
			if(var>=50 && var<=90) { //50 ~ 90 ������ �ڷ�
				cnt++;
				sum+=var;
		}
		System.out.println("sum = "+ sum);
		System.out.println("ave = "+ (double)sum/cnt);
	}

}
