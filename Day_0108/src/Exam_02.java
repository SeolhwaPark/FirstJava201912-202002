import java.util.Scanner;

/*
 * Ű���� �Է�(2~1024) �Է�
 * �Է� ���� 2���� ��ȯ�ؼ� ���
 * �Է� ���� -99�̸� ����
 * 
 * �Է� : 10
 * 2���� : 1010
 * �Է� : 1
 * �Է¿���
 * �Է� : 127
 * 2���� : 1111111
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[]; //�迭
		
		while(true) {
			a = new int[10];
			int cnt = 0;
			System.out.print("10������ �Է��ϼ��� : ");
			int data = scn.nextInt();
			if(data == -99) break;
			
			if(data>=2 && data<=1024) {
				int temp = data;
				int mok; //
				int namoji; //
				do {
					mok=temp/2; // 2����
					namoji=temp%2; // 2����
					a [cnt] = namoji; //���������� �迭�� ��
					temp= mok; 
					cnt++;
				}while(mok!=0);
					System.out.print("2���� : " );
				
				for(int x=cnt-1; x>=0; x--) {//2����(10������ 2�� ������ ���� �������� �������� ���)
					System.out.print(a[x] + " ");
				}
				System.out.println();
			}else {
				System.out.println("err �Է¿���!!! �ٽ� �Է��ϼ���");
			}
		}

	}
}
