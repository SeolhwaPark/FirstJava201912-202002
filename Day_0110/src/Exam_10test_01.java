/*
 * 1.�Է� �ڷ� ��� �޼ҵ� ����(dataPrint)
 *   ��ȣ ���� 1 ����2 ����3 ���� 4 ����5
 *   . . . . . 
 * 2.���� ���ϴ� �޼ҵ� ����(dataTot)
 * 3.������ �������� �������� ���� �޼ҵ� ����(totSort)
 * 4.��ü ��� �޼ҵ� ����(dataPrint2)
 *  ��ȣ ���� 1 ����2 ����3 ���� 4 ����5 ����
 *   . . . . . 
 */
public class Exam_10test_01 {

	public static void main(String[] args) {
		//�迭���� �� ������ �ʱ�ȭ
		int score[][] = {{1,11,22,33,44,55,0},{2,12,23,45,56,78,0},
			{3,99,88,77,66,55,0},{4,98,87,76,65,54,0},{5,14,25,36,47,58,0}};
		
		//dataPrint ȣ��
		dataPrint1(0,score);
		
		//dataTot ȣ��
		dataTot(score);
		
		//totSort ȣ��
		totSort(score);
		
		dataPrint1(1,score);
	}
	
	//�Է��ڷḦ ��� �޼ҵ�
	static void dataPrint1(int flag,int[][] score) {
		if(flag == 0){
		System.out.println("�Է��ڷ����-----------------------------------");
		System.out.println("��ȣ\t����1\t����2\t����3\t����4\t����5");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
				}
		System.out.println();
			}
		}else {
		System.out.println("����ڷ����-----------------------------------");
		System.out.println("��ȣ\t����1\t����2\t����3\t����4\t����5\t�հ�");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
				}
		System.out.println();
			}
		}
	}

	//������ ���ϴ� �޼ҵ�
	static void dataTot(int[][] score) {
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score.length; y++) {
				score[x][6]+=score[x][y];
			}
		}
	}

	//�������� ��������
	static void totSort(int[][] score) {
	for(int x=0; x<score.length; x++) {
		for(int y=x+1; y<score.length-1;y++) { //���ؾߵǱ� ������ 1���� 
			if(score[y][6]>score[x][6]) { //������ �������� ���� ����
				for(int k =0; k<score[0].length; k++) {//k = �׸�
				int temp = score[x][k]; //��ȣ
					score[x][k] = score[y][k];
					score[y][k] = temp;
					}
				}
			}
		}
	}	
}
	
	

