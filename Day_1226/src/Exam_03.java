import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in); //��ü�� ����
		
		int a = scn.nextInt(); //������ �Է½� �� 
		System.out.println("a =" + a);
		
		double b = scn.nextDouble(); //�Ǽ��� �Է½� ��
		System.out.println("b =" + b);
		
		String c = scn.next(); // ���ڿ� �Է½� ��,��. 
		System.out.println("c =" + c); // ���鵵 ��
		
		//String d = scn.nextLine(); //���ڿ� �Է½� ��
		//System.out.println("d =" + d); // ������ ��°�� �Է�. ���鵵 ��
		
		//a = 10;
		//System.out.println("a =" + a);
		//System.out.println("scn =" + scn);

	}

}
