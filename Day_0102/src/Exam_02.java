import java.util.Scanner;

/*
 * Ű����� ������ �Է�
 * 1. �Է��ڷ�� 1~100���� ���� - if
 * 2. �Է��ڷ� �� 7�� ����� ã�� �հ踦 ���
 * 		��ü �ڷᰡ 20��(��������) �̸� ����
 * 4. �Է� ����
 * 		�Է��ڷ� : 0
 * 		"error �Է¹����� �ƴ�"
 *		�Է��ڷ� : 8
 *		�Է��ڷ� : 77
 *		�Ԏ��ڷ� : 200
 *		"error �Է¹����� �ƴ�"
 *		�Է��ڷ� : 88
 *		20���� �ڷ� �� ������(%) : XX%	
 *		20���� �ڷ� �� 7�� ��� ��(%) : XX%
 *		7�� ��� �� : XXX
 *		7�� ��� ��� : XXX
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; //����
		int sum = 0; //�հ�
		int var = 0; //�Է��ڷ� ����
		int err=0; //��������
		int acc=0; //��Ȯ���ڷ᰹��accuracy
		
		do {
			System.out.print("1~100������ ������ �Է��ϼ��� : ");
			var = scn.nextInt();
			cnt++;
			if(var>=1 && var<=100) {
				if(var%7==0){ //7�� ���
					sum+=var;
					acc++;// ��Ȯ�� �ڷ᰹��
				}
			}else { //������ ��
				System.out.println("error �Է¹����� �ƴմϴ�");
				err++; //������ �ڷ᰹��
			}
		}while(cnt<20);//while�� 		
			err = (int)(((double)err/20) *100); //Ȯ��
			acc = (int)(((double)acc/20) *100); //Ȯ��
		
		System.out.println("20���� �ڷ� �� ������(%) : "+ err + "%");
		System.out.println("20���� �ڷ� �� 7�� ��� ��(%) : "+ acc + "%");
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}

/*
		int cnt = 0; //����
		int sum = 0; //�հ�
		int var = 0; //�Է��ڷ� ����
		int errcnt=0; //��������
		int totcnt=0; //��Ȯ���ڷ᰹��
		
		do {
			System.out.print("1~100������ ������ �Է��ϼ��� : ");
			var = scn.nextInt();
			totcnt++;
			if(var>=1 && var<=100) {
				if(var%7==0){ //7�� ���
					sum+=var;//����� �հ�
					cnt++;// ��Ȯ
				}else { //������ ��
				System.out.println("error �Է¹����� �ƴմϴ�");
				errcnt++; //������ ���� �ľ�
				}
			}
		}while(totcnt<20);//while�� 		
		errcnt = (int)(((double)errcnt/cnt) *100); //Ȯ��
		totcnt = (int)(((double)totcnt/cnt) *100); //Ȯ��
			
		System.out.println("20���� �ڷ� �� ������(%) : "+ errcnt + "%");
		System.out.println("20���� �ڷ� �� 7�� ��� ��(%) : "+ totcnt + "%");
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}
*/