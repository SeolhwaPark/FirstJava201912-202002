import java.util.Scanner;

/*����Ÿ�� 0, �Ű����� 

 * Ű����� ���� �Է�
 * �Էµ� �������� �հ� ���
 */
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = scn.nextInt();
		int ss = sum(num);
		System.out.print(ss);
	}
	
	static int sum(int s) {
		int sum = 0;
		for(int x=1; x<=s; x++) {
			sum+=x;
		}
		
		return sum; //������ ������ ������ �ʿ��ؼ� ������ �־����.���� �ϳ��� ���;���
		//������ �۾��� �ʿ��� �� ��. ������� ���ο� ������������ ��
	}

}
