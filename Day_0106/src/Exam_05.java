import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
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
	}
}