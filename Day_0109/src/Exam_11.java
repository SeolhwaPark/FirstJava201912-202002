/*
 * 2���� �迭
 * �����Է� ��� �߰�
 * 
 * ��ȣ ���� ���� ���� ���� ��� ����
 */

public class Exam_11 {
	public static void main(String[] args) {
		int score[][]= {{1,90,78,79,0,1},{5,95,80,70,0,1},
				{2,79,88,77,0,1},{4,75,88,77,0,1},{3,95,88,75,0,1}};
		//double avg[] = {} //����� �Ǽ�
		double avg[] = new double[5];
		
		//�Է�
		System.out.println("��ȣ\t����\t����\t����");
		for(int x=0; x<score.length-2; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
		
		//�������
		for(int x=0; x<score.length; x++) {
			for(int y=1; y<4; y++) {
				score[x][4]+=score[x][y];
			}
			//��հ��
			avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //�Ҽ����� 2�ڸ����� ����
		}
		
		//�������
		for(int x=0; x<score.length;x++) {
			//int r=1; //����
			for(int y=0; y<score.length;y++) {//�ڱ� �ڽŰ� �񱳸� �� ����
				if(score[x][4]<score[y][4]){//������ �������� �� ��
				score[x][5]++;//�ڱ��ڽ��� ����
					//	r++;
				}
			}
		}
		//sort �� ���
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.print(avg[x]);//������
			System.out.println(score[x][score[x].length-1]);//�������
			System.out.println();
		}

		//��ȣ�� �������� �������� ����
		for(int x=0; x<score.length; x++) {
			for(int y=x+1; y<score.length;y++) { //���ؾߵǱ� ������ 1���� 
				
				if(score[x][0]>score[y][0]) { //��ȣ�� �������� ���� ����
					for(int k =0; k<score[0].length; k++) {//k = �׸�
						int temp = score[x][k]; //��ȣ
						score[x][k] = score[y][k];
						score[y][k] = temp;
					}
					double imsi = avg[x];
					avg[x] = avg[y];
					avg[y] = imsi;
				}
			}
		}

		//Sort �� ��� 
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.print(avg[x]);//������
			System.out.println(score[x][score[x].length-1]);//�������
			System.out.println();
		}
	}
}
