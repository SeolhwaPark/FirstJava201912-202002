import java.util.Scanner;

/*
 * Ű����� ������ 10�� �Է�
 * �հ� ����� ���Ͽ� ���
 * �Է��ڷᰡ 0�̸� ��
 * 
 */
public class sample_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = 0;
		int cnt = 0;
		System.out.print("�Է��ϼ��� :");
		while(true){
			int a = scn.nextInt();
			s += a;
			cnt++;
			if(a == 0)break;

		}
		System.out.println("�հ�� " + s);
		System.out.println("����� " + s/cnt);
		
		
		
		
	}

}
