import java.util.Scanner;

/*
 * Ű����� ���� �Է� 
 * 
 * Ȧ���� 5�� ��� ���� , �հ� ���
 * �Է��ڷᰡ 0�̸� ����
 * 
 * �Է�:34
 * �Է�:55
 * �Է�:67
 * �Է�:89
 * �Է�:66
 * �Է�: 0
 */
public class sample_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = 0;
		int cnt = 0;
		System.out.print("�Է��ϼ��� :");
		for(int i = 1; i <= 10; i++) {
			s = scn.nextInt();
			if(i%2 == 1) {
				s+=i;
				cnt++;
			}
		}
		System.out.println("Ȧ���� ���� :" + cnt);			
		System.out.println("�հ� " + s);
		
		
		
		
	}

}

