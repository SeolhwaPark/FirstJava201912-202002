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

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int score[][] = new int[10][6]; // 10����� �迭�� 6�׸��� ����
			int cnt = 0;
			double avg[] = new double[5];//���
			String name[] = new String[10]; //�̸�

			//��ȣ �̸� ���� ���� ���� �Է¹ޱ�
			while(true) {
				System.out.print((cnt+1) + "�� �Է� : ");
				int data = scn.nextInt(); //�ڷ��Է¹޴¾�
				if(data == -99)break;
				score[cnt][0] = data;
				name[cnt] = scn.next();
				score[cnt][1] =scn.nextInt(); //����
				score[cnt][2] = scn.nextInt(); //����
				score[cnt][3] = scn.nextInt(); //����
				cnt++;
				if(cnt == 10)break;
				}//while
			
			//����	
			for(int x=0; x<score.length; x++) {
				for(int y=1; y<4; y++) {
					score[x][4]+=score[x][y];
				}
				//��հ��
				avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //�Ҽ����� 2�ڸ����� ����
			}
			
			//�������
			for(int x=0; x<score.length;x++) {
				for(int y=0; y<score.length;y++) {//�ڱ� �ڽŰ� �񱳸� �� ����
					if(score[x][4]<score[y][4]){//������ �������� �� ��
					score[x][5]++;//�ڱ��ڽ��� ����
					}
				}
			}

			//�̸�
			for(int x=0; x<score.length; x++) {
				for(int y=1; y<4; y++) {
					score[x][4]+=score[x][y];
				}
				//��հ��
				avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //�Ҽ����� 2�ڸ����� ����
			}
			
			//���
			System.out.println("��ȣ\t����\t����\t����\t����");
			for(int x=0; x<score.length; x++) {
				for(int y=0; y<score[x].length; y++) {
					System.out.print(score[x][y] + "\t");
				}
				System.out.println();
			}
	}
}
