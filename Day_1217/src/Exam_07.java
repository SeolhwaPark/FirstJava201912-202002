
/* ���ڿ� ó��("") �� �ڷ����Է�
 * ���ڿ� ó�� : String Ŭ���� 
 * String�� Ŭ������ �⺻�ڷ����� �ƴ�,�ڷ������� �������� ������ġ�� Ʋ���� ������ ������ Ŭ������)
 * 
 * 		char ch = 'A';
		String str = "ȫ�浿"; // ���ڿ� ����
		System.out.print("�̸� :"+str);

 * 
 * 
 * �ڷ��� �Է� : Scanner Ŭ����
 * Scanner scn = new Scanner(Systen.in)// ctrl+shift+o
 * 
 * //nextInt() ����, nextDouble() �Ǽ�
 */
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);// ctrl+shift+o
		System.out.print("�̸��� �Է��ϼ���");
		String name = scn.next();
		System.out.print("�̸� :" +name);
		
	}

}
