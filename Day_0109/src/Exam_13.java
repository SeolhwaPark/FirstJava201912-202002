import java.util.Scanner;

/* Ű����  = �л����������Է� �ִ� 10���
 * 
 * 1. �Է� (��ȣ �̸� ���� ���� ����)
 * �Է� : 1 Ȧ�浿 89 80 90
 * �Է� : 2 ���ڹ� 77 88 99
 * �Է� : -99 ����
 * 
 * 2. 1��° ���
 * ��ȣ �̸� ���� ���� ���� ���� ��� ����
 * 
 * 3. 2��° ��� (������ �������� �����Ͽ� ����)
 * ��ȣ �̸� ���� ���� ���� ���� ��� ����
 */

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int score[][] = new int[10][6]; // 10����� �迭�� 6�׸��� ����
			int cnt; //���� �Է��� �����
			double avg[] = new double[10];//���
			String name[] = new String[10]; //�̸�

			//��ȣ �̸� ���� ���� ���� �Է¹ޱ�
			for(cnt = 0; cnt<10; cnt++) {
				System.out.print((cnt+1)+ "��° �Է� : ");
				score[cnt][0] = scn.nextInt();
				if(score[cnt][0]==-99)break;
				name[cnt] = scn.next();
				for(int x=1; x<4; x++) {
					score[cnt][x] = scn.nextInt();
					score[cnt][4]+=score[cnt][x];
			}
				avg[cnt] = (int)(score[cnt][4]/3.*10+0.5)/10.;
			}
			
			//�׽�Ʈ��� 
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			for(int x=0; x<cnt; x++) {
				System.out.print(score[x][0]+"\t");//��ȣ
				System.out.print(name[x]+"\t");//�̸�
				for(int y=1; y<5; y++) { //y<�׸��
					System.out.print(score[x][y]+"\t"); //��������
				}
				System.out.print(avg[x]+"\t");//���
				//System.out.println(score[x][5]+"\n"); //����
			}
			//�������
			for(int x=0; x<cnt; x++) {
				int r = 1;//�ʱⰪ 1�ִ°� ����
				for(int y=0; y<cnt; y++) {
					if(score[x][4]<score[y][4]){
					r++;
					}
				}
				System.out.println();
				score[x][5]=r;
			}
			//1�� ���
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
			for(int x=0; x<cnt; x++) {
				System.out.print(score[x][0]+"\t");//��ȣ
				System.out.print(name[x]+"\t");//�̸�
				for(int y=1; y<5; y++) { //y<�׸��
					System.out.print(score[x][y]+"\t"); //��������
				}
				System.out.print(avg[x]+"\t");//���
				System.out.println(score[x][5]+"\n"); //����
			}
				
			//��Ʈ
			for(int x=0; x<cnt-1; x++) {
				for(int y=x+1; y<cnt; y++) { //���ؾߵǱ� ������ 1���� 
					
					if(score[x][5]>score[y][5]) { //��ȣ�� �������� ���� ����
						for(int k =0; k<score[x].length; k++) {//k = �׸�
							int temp = score[x][k]; //��ȣ
							score[x][k] = score[y][k];
							score[y][k] = temp;
						}
						
						String na = name[x];
						name[x] = name[y];
						name[y] =  na;
						
						double imsi = avg[x];
						avg[x] = avg[y];
						avg[y] = imsi;
					}
				}
			}
	
			//2�� ���
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				for(int x=0; x<cnt; x++) {
					System.out.print(score[x][0]+"\t");//��ȣ
					System.out.print(name[x]+"\t");//�̸�
					for(int y=1; y<5; y++) { //y<�׸��
						System.out.print(score[x][y]+"\t"); //��������
					}
					System.out.print(avg[x]+"\t");//���
					System.out.println(score[x][5]+"\n"); //����
			}
		
		
		
		
	}
}
