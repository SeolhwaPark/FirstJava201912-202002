import java.util.Scanner;

/* Ű����� 10���� ������ �Է� �޾Ƽ�
 * �迭�� ���� �� ����,����� ���Ͽ� ���
 */

public class Exam_03 {
	public static void main(String[] args) {
		// �Է� �۾�
		Scanner scn = new Scanner(System.in);
		int var[] = new int[10];
		for(int i=0; i<10; i++) { // �ݺ�Ƚ�� ����������
			System.out.print("���� (" + (i+1) + ") : "); //*****************
			var[i] = scn.nextInt();
		}							
		// ��� �۾�
		int tot=0;
		for(int i=0; i<10; i++) {
			tot = tot + var[i];
			System.out.println(var[i] + "\t");
		}
		System.out.println("\ntot = " + tot); // ��
		System.out.println("ave = " + (tot/10)); //�� ��
	}
}
