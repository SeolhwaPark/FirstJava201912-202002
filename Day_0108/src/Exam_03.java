import java.util.Scanner;

/*
 * Ű���� �Է�(2~1024) �Է�
 * 10������ 16���� ���� ��������ϱ�
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[]; //�迭
		
		while(true) {
			a = new int[10];
			int cnt = 0;
			System.out.print("10������ �Է��ϼ��� : ");
			int data = scn.nextInt();
			int num = scn.nextInt();

			if(data == -99) break;
			
			if(data>=2 && data<=1024) {
				int temp = data;
				int mok; //
				int namoji; //
				do {
					mok=temp/num; // 10������ 16���� �̿��� ����
					namoji=temp%num; 
					a [cnt] = namoji; //���������� �迭�� ��
					temp= mok; 
					cnt++;
				}while(mok!=0);
					System.out.print(num+"���� : " );
				for(int x=cnt-1; x>=0; x--) {
					System.out.print(a[x] + " ");
				}
				System.out.println();
			}else {
				System.out.println("err �Է¿���!!! �ٽ� �Է��ϼ���");
			}
		}

	}
}
