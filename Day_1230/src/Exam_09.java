import java.util.Scanner;

/*
 * ������ ���� �� , ū ���� ���� �� ã��
 * ����2
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("����1 : ");
		int a = scn.nextInt();
		System.out.print("����2 : ");
		int b = scn.nextInt();
		System.out.print("����3 : ");
		int c = scn.nextInt();
		
		int max = a;//���� ū �� ����
		if (max < b){ //�ݴ��
			max = b;
		}
		if (max < c){
			max = c;
		}
		System.out.print("Max : " + max);
	}

}