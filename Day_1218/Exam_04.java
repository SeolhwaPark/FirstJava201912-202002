import java.util.Scanner;

/*
 * ��ȣ(����), �̸�, ����, ����, ����, ������ Ű����� �Է�
 * ����, ���(�Ҽ����� �ι�° �ڸ����� �ݿø�)
 *  - �� ������ ���� �Ǵ� �Ǽ� ��� ����
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.print("��ȣ :"); //����� ���Ǽ��� ���� ����
		int bun = s.nextInt();
		System.out.print("�̸� :");
		String name= s.next();
		System.out.print("���� :");
		int kor = s.nextInt();
		System.out.print("���� :");
		int eng = s.nextInt();
		System.out.print("���� :");
		int mat = s.nextInt();
		
		double tot = kor+eng+mat;
		double ave = (double)tot/3.; 
		ave = ((int)(ave*10+0.5))/10.;
		
		System.out.println("��ȣ :"+bun);
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+tot);
		System.out.println("��� :"+ave);
	}

}
