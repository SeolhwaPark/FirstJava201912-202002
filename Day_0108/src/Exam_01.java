import java.util.Scanner;

/*
 * Ű�����Է� (1~10)-> 7�� �Է�
 * �Է� ;5
 * �Է� ; 0
 * �Է¿���
 * �Է�;9
 * . . . 
 * 0�� �Է½� �Է¿��� , 7�� ��½� ��µǰ� �ؾ���
 * 
 * [���]
 * �Է��ڷ� : 5 9 x x x x x
 * �ִ밪 :
 * �ּҰ� :
 * �հ�(�ִ� �ּҸ� �� �հ�)
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		int a = score[0];
		int cnt = 0;
		//�Է�
		while(cnt<7) { //7���� Ŭ ��
			System.out.print("�Է� : ");
			int data = scn.nextInt();
			if(data>=1 && data<=10) {
				score[cnt] = data;
				cnt++;
			}
		}
		//����׽�Ʈ
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		//���
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		
		for(int x=1; x<score.length; x++) {
			if(max<score[x]) {
				max = score[x];
			}
			if(min>score[x]) {
				min = score[x];
			}
		sum += score[x];
		
		}
		//���
		System.out.println("�ִ밪 : "+ max);
		System.out.println("�ּҰ� : "+ min);
		System.out.println("�հ� : " + (sum - max - min));
		
	}//main
}//class
