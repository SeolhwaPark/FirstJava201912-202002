import java.util.Scanner;

/*
 * ���� ���󳪴���(?) ���
 * M = 327658
 * s= m/50000
 * M=M-(s*50000)
 * 
 * s=m/10000
 * M=M-(s*5\10000)
 * 
 * s=m/5000
 * M=M-(s*5000)
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*
	System.out.print("���� �Է� >> ");
		int money = sc.nextInt();
		int m = 50000; // ȭ�����
		boolean sw = true; //�� 
		
		for(int x = 1; x <= 10; x++) {
			int s = money / m ;
			System.out.println(m+" : "+s);
			if(sw) {
				money = money-(s*m); // money = money % m; (������ �����ڰ� ������)
				m = m/5;
				sw = false;
			}else {
				money = money-(s*m);
				m = m/2;
				sw = true;
			}
		}
*/
		System.out.print("���� �Է� : ");
		int money = scn.nextInt(); //���� ���
		int m = 50000; //ȭ�����
		boolean sw = true; //switchó�� ������ 2���� ���ϸ� ����
		
		for (int x=1; x<=10; x++) { //���������� 10���ϱ�
			int s = money/m;//����������� ����Ϸ��� ���� ȭ������� ����
			System.out.println(m + ":" + s);
			
			if(sw) { 
				money = money - (s*m); //������ money = money%m;
				m = m/5; //ȭ������� 5�� ������ �������� 50000~5������ �ֵ�
				sw = false;
			}else {
				money = money - (s*m);//������
				m = m/2; //2�� ���� �� ������ 10000~1������ �ֵ�
				sw = true;
			}
		}
	}
}
