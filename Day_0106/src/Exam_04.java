import java.util.Scanner;

/*
 * Ű����� �޿��� �Է�(1 ~ 500000) 
 * �Է��ڷᰡ -999 �̸� ���� �Ǵ� �ο����� �ִ� 10��
 * 
 * 50000 : xx 
 * 10000 : xx 
 * 5000 : xx 
 * 1000 : xx 
 * . . . . .
 * 1 : xx 
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		int t5 = 0;
		int t6 = 0;
		int t7 = 0;
		int t8 = 0;
		int t9 = 0;
		int t10 = 0;
		
		while(true) {
			System.out.print("�޿��� �Է��ϼ��� : ");
			int money = scn.nextInt();
			cnt++;
			if(money == -999) break;
			int m = 50000; //ȭ�����
			boolean sw = true; 
			
			for (int x=1; x<=10; x++) {
				int s = money/m;
				if(x==1) t1+=s;
				if(x==2) t2+=s;
				if(x==3) t3+=s;
				if(x==4) t4+=s;
				if(x==5) t5+=s;
				if(x==6) t6+=s;
				if(x==7) t7+=s;
				if(x==8) t8+=s;
				if(x==9) t9+=s;
				if(x==10) t10+=s;
			
				if(sw) { 
					money = money - (s*m); 
					m = m/5;
					sw = false;
				}else {
					money = money - (s*m);
					m = m/2;
					sw = true;
				}
			}
			if(cnt == 10) break;
		}
		System.out.println("5���� : " + t1);
		System.out.println("���� : " + t2);
		System.out.println("5õ�� : " + t3);
		System.out.println("õ�� : " + t4);
		System.out.println("5��� : " + t5);
		System.out.println("��� : " + t6);
		System.out.println("50�� : " + t7);
		System.out.println("10�� : " + t8);
		System.out.println("5�� : " + t9);
		System.out.println("1�� : " + t10);

/*
		int sum[] = new int[10]; 
		int total[] = new int[10];
		int inwon = 0;//�迭�̸� ���� 10����� �޿���
			
		while(true) {
			int kyuryo;
			int m = 50000; //�������
			boolean sw = true;
			System.out.print("�޿��� �Է� �ϼ���(1 ~ 500,000) >> ");
			kyuryo = sc.nextInt();
			
			if(kyuryo == -999) break; //�Է��ڷᰡ -999 �̸� ����
			if(inwon == -999) break; //�Է��ڷᰡ -999 �̸� ����
				
				for(int x = 0; x <= 9; x++) {
					
					int mok = kyuryo / m ; //���󼼱�
					sum[x] = mok;
					
					if(sw) {
						kyuryo = kyuryo%m; //���󼼱�
						m = m/5;
						sw = false;
					}else {
						kyuryo = kyuryo%m;//���󼼱�
						m = m/2;
						sw = true;
					}
					total[x]= total[x]+sum[x];//���� �� ��
				}
				inwon++;//10���� ����
		}
	
		int m = 50000;
		boolean sw = true;
		
		for(int x = 0; x <= 9; x++) {
			System.out.println(m+" : "+total[x]);
			if(sw) {
				m = m/5;
				sw = false;
			}else {
				m = m/2;
				sw = true;
			}
			
		}
		System.out.println("�ο� : "+inwon);
		
*/
		
	}
}
