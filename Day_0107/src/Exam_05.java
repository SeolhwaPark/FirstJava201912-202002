import java.util.Scanner;

/*
 * Ű���� �Է� (100,000~ 1,000,000)
 * �Է��ڷᰡ -99 �� ������ ����
 * �Է� : 234567
 * �Է� : 345434
 * . . . 
 * �Է� : -99
 * �� �޿� : xxxxxxx
 * 	50000	 10000	 5000	 1000	 500	 100	 50	 10	 5	 1
 *  �ʿ����
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		int money[] = new int[10];
		int total = 0;
		
		while(true) {
			System.out.print("�Է� : ");
			int m = scn.nextInt();
			if(m==-99) {
				break;
			}
			total += m; //�ѱ޿�
			boolean flag = true;
			int mon=50000;
			for(int x=0; x<10; x++) {
				money[x] += m/mon;
				m = m%mon;
				if(flag) {
					mon/=5;
					flag = false;
				}else {
					mon /=2;
					flag = true;
				}
			}
		}
		
		//���
		System.out.println(money.length + "\t");
		System.out.println(total + "\t");

	}
}
