import java.util.Scanner;
/*
 * Ű����� �Է�(1~100) �ִ� 10�� �Է�
 *  ��, ¦���� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		for(int x=0; x<10; x++) {
			System.out.print("�Է� : ");
			int a = scn.nextInt();
			if(a%2==0) {
				System.out.print(a);		
			}
		}
*/	
		int val[] = new int[10]; //�迭 ����
		
		//�Է��۾�
		for(int x=0; x<10; x++) { //10�� �Է��� �� �ְ� �ݺ� ��
			System.out.print("�Է� : ");
			int a = scn.nextInt();
			val[x] = a;
			//val[x] = scn.nextInt();

		}
		//�Էµ� �ڷḦ ��� ���
		System.out.print("�Է��ڷ� : ");
		for(int x=0; x<10; x++) {
			System.out.print(val[x] + "\t");
		}
		//¦���� ���
		System.out.println("\n ¦�� : ");
		for(int x=0; x<10; x++) {
			if(val[x]%2==0) { //¦���� 2�� �������� 0�� ����
				System.out.print(val[x] + "\t");
			}
		}
	}
}
