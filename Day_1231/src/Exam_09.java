import java.util.Scanner;

/*Ű���� �Է�
 *50���� 90������ �ڷḸ 10���� �Է½�Ű�� �հ� ���
 *�Է� ��; 10,80,60,90,95.......
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt =0; 
		int sum = 0; 
		int var = 0; 
		while(cnt<10) {
			System.out.println("�Է� : ");
			var = scn.nextInt();
			if(var>=50 && var<=90) {
				cnt++;
				sum+=var;
				}
			
		}
		System.out.println("sum = "+ sum);
		
	}

}
