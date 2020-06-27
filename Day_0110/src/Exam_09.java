import java.util.Scanner;

/*Ű���� �Է�(10��)
 * �������� ���� ���
 * 1. �Է� ����� main()
 *  source Data :xx xx xx . . . 
 *  sort Data : xx xx xx . . . 
 *  
 * 2.�������� ������ �޼ҵ� �̿�
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		for(int x=0; x<score.length; x++) {
			System.out.print("���� �Է��ϼ��� : ");
			score[x] = scn.nextInt();
		}
		
		printData1("Source", score);
		//��������
		selectionSort(score);
		
		printData1("Sort", score);
		
		
	}
	static void selectionSort(int[] score){
	 	System.out.println(score);
		for(int x=0; x<score.length-1; x++) {//���� //���ذ� ���� ����� ���� -1
			for(int y=x+1; y<score.length; y++) {//���ؼ�
				if(score[x]>score[y]) { //�������������� ����
					int temp = score[x]; //�־�� ��
					score[x] = score[y];//�����ͱ�ȯ���
					score[y] = temp;
				}
			}
		}
		
	}
	static void printData1(String str , int[] score){
		System.out.println(str + " Data : ");
		for(int x=0; x<score.length; x++) {
			System.out.println(score[x] + "\t");
		}
		System.out.println();
		
	}
}