/*
 * sort ��������
 * ���� : ù��°�� �����ؼ� �������μ� ��� ���� ���������� ����. �����ϴ� ���� ������
 */
public class Exam_05 {
	public static void main(String[] args) {
		int[] score = {50,70,60,90,80,77,45,78};
		System.out.print("Data : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		for(int x=0; x<score.length-1; x++) {//���� //���ذ� ���� ����� ���� -1
			for(int y=x+1; y<score.length; y++) {//���ؼ�
				if(score[x]>score[y]) { //�������������� ����
					int temp = score[x]; //�־�� ��
					score[x] = score[y];//�����ͱ�ȯ���
					score[y] = temp;
				}
			}
		}
		System.out.print("Sort : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
	}

}
