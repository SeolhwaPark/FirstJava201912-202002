import java.util.Scanner;

/*	Ŭ���� �迭ó��
 * Ű���� �Է� �ִ� 10�� 
 * �Է� : ��ȣ �̸� ���� ���� ���� 
 * . . . . . . . . . . . .
 * 
 * ��� (������ �������� ��������)
 * ��ȣ �̸� ���� ���� ���� ���� ���
 * 
 * ��ȣ�� -99�̸� �Է�����
 * 1.�л� ���� Student
 * 2.�л� ���� ó�� StudentData
 * 3.�ڷ� �Է� main()
 * 
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Gakusei[] gaku =  new Gakusei[10];
	
		while(cnt<10) {
			
			System.out.print((cnt + 1)+"�� �Է��ϼ��� :");
	
			int bunho = scn.nextInt();
			if(bunho == -99) break;
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
	
			Gakusei gak = new Gakusei(bunho,name,kor,eng,mat);
			gaku[cnt] = gak;
			cnt++;
		}
		
		GakuseiData data = new GakuseiData(gaku,cnt);
		data.gakuseiPrint();
		
	}

}
