import java.util.Scanner;

/*Ű���� �Է�
 *50���� 90������ �ڷḸ 10�� �Է½�Ű�� �հ� ���
 *�Է� ��; 10,80,60,90,95.......
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt =0; //ī��Ʈ
		int sum = 0; //�հ�
		int var = 0; //�Է��ڷ� ����
		while(true) {
			System.out.println("�Է����ּ��� : ");
			var = scn.nextInt();//�ݺ��ؾ��� ���
			if(var>=50 && var<=90) {
				cnt++;
				sum+=var;
				if(cnt==10) //�ݺ� �Ǿ��� �� 
					break;
				}
		}
		System.out.println("sum = "+ sum);//sum
		
	}

}