import java.util.Scanner;

/*
 * Ű����� ������ �Է�
 * 1. �Է��ڷ�� 1~100���� ���� - if
 * 2. �Է��ڷ� �� 3�� ����̸鼭 - if
 * 	  7�� ����� �հ��ϰ� �� ����� ���Ͽ� ���
 * 3. �� �ش��ϴ� �Է��ڷ�(2���� �ش�Ǹ�)�� 7���̸� ���α׷��� ����. 
 * 		1�� ī��Ʈ-if
 * 4. �Է� ����
 * 		�Է��ڷ� : 0
 * 		"error �Է¹����� �ƴ�"
 *		�Է��ڷ� : 8
 *		�Է��ڷ� : 77
 *		�Ԏ��ڷ� : 200
 *		"error �Է¹����� �ƴ�"
 *		�Է��ڷ� : 88
 *		�հ� : XXX
 *		��� : XX.XX
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; //����
		int sum = 0; //�հ�
		int var = 0; //�Է��ڷ� ����
		
		while(true) {//���я�
			System.out.print("1~100������ ������ �Է��ϼ��� : ");
			var = scn.nextInt();//�ݺ��ؾ��� ���
			//1~100���� ������ �Է�
			if(var>=1 && var<=100) {
				if(var%3==0 && var%7==0){
				//�Է��ڷᰡ 3�� ����̸鼭 7�� ���
					cnt++;
					sum+= var;
					if(cnt==7) //�ݺ� �Ǿ��� �� 
						break;
				}
			}else {
				System.out.println("error �Է¹����� �ƴմϴ�");
			}
		}//while�� 
		
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}