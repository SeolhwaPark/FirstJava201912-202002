import java.util.Scanner;

/*
 * Ű���� �Է�(2~1024) �Է�
 * 10������ n������ ����ϱ�
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char str[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char a[]; //�迭
		
		while(true) {
			a = new char[11];
			String bin = "";
			int cnt = 0;
			
			System.out.print("10������ �Է��ϼ��� : ");
			int data = scn.nextInt();
			int num = scn.nextInt();
			if(data == -99) break;
			
			if(data>=2 && data<=1024) {
				int temp = data;
				int mok; 
				int namoji; 
				do {
					mok=temp/num; // 10������ 16���� �̿��� ����
					namoji=temp%num; 
					a [cnt] = str[namoji]; //���������� �迭�� ��
					bin = str[namoji] + bin; //���ڿ� ����
					temp= mok; 
					cnt++;
				}while(mok!=0);
					System.out.print(num+"���� : " );
					
				for(int x=cnt-1; x>=0; x--) {
					System.out.print(a[x] + " ");
				}
				
				System.out.println();
				System.out.print(num+"���� : " + bin);
			}else {
				System.out.println("err �Է¿���!!! �ٽ� �Է��ϼ���");
			}
			
		}

	}
}
