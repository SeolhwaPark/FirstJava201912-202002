import java.util.Scanner;
// �޿��� ������������ ���

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sa[] = new Sawon[10]; //��ü10����� �迭
		int cnt = 0;
		
		while (cnt<10) {
			System.out.print("�Է��ϼ��� :");
			int s = scn.nextInt();
			if(s == -99)break;
		
		String n = scn.next();
		int p = scn.nextInt();
		sa[cnt] = new Sawon(s,n,p);
		cnt++;
		}
		
		SawonData saD = new SawonData();
		saD.sourceDataPrint(sa,cnt); //sa ������ ���� ȣ��
		
		System.out.print("���ı��� �޿�(1/2) :");
		int n = scn.nextInt();
	
		saD.sortDataPrint(sa,cnt,n); // n=1 ����, n=2 ����
		saD.sourceDataPrint(sa,cnt);
	
	}

}
