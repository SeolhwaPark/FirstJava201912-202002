import java.util.Scanner;

/*
 * 2���� �迭
 * �����Է��۾�
 * 
 * ��ȣ ���� ���� ����
 */

public class Exam_03 {
	public static void main(String[] args) {
		int score[][]= new int[5][4];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		for(int x=0; x<score.length; x++) {
			System.out.print((x+1) + "�� �Է� : ");
			score[x][0] = scn.nextInt();
			score[x][1] = scn.nextInt();
			score[x][2] = scn.nextInt();
			score[x][3] = scn.nextInt();

			//int b1 = scn.nextInt();
			//������ �̿��ؼ� �����Է°���
			//int b2 = scn.nextInt(); 
			//int b3 = scn.nextInt(); 
			//int b4 = scn.nextInt(); 			
		}
		// nextInt ���۶�� �ӽñ����ҿ��� �����͸� �������� ���� �ʿ���
		//���۴� ������� ������ �� �ӽñ�����
		//scn.NextLine();
		// ����Ű�� ������ �κ� ���� ����.���ο� ���ۿ� ����
		//���
		System.out.println("��ȣ\t����\t����\t����");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.println();

/*		for(int x=0; x<score.length; x++) {
			System.out.print(score[x][0]+"\t");
			System.out.print(score[x][1]+"\t");
			System.out.print(score[x][2]+"\t");
			System.out.print(score[x][3]+"\n");
*/
		}

	}

}
