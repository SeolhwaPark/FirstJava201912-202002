import java.util.Scanner;

/*
 * Ű����� �����ȣ, �̸�, �޿� �Է� �ִ� 10
 * �����ȣ -99 ����
 * 
 * �Է� 
 * ��� �̸� �޿�
 * 
 * ���
 * ��� �̸� �޿� 50,000 10,000 . . . .1
 * �հ�
 * 
 * ��� Sawon, ���ó�� SawonData
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Sawon1 sawon[] = new Sawon1[10];
		while(cnt < 10) {
			System.out.print("�Է� :");
			int number = scn.nextInt();
			if(number == -99) break;
			String name = scn.next();
			int money = scn.nextInt();
		
		sawon[cnt] = new Sawon1(number,name,money);
		cnt++;
		}
		
		SawonData1 saD1 = new SawonData1();
		saD1.payPrint(sawon, cnt);
		saD1.DataPrint(sawon, cnt);
		//SawonData1 saD2 = new SawonData1();
		//saD2.payPrint(sawon, cnt);
	}
}
