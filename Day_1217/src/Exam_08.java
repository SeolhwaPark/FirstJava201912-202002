import java.util.Scanner;

/* ��ȣ �̸� �������� �������� ����������
 * �Է¹޾Ƽ� ���� ����� ����Ͽ� ���
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.print("��ȣ :");
		int bun = scn.nextInt();
		System.out.print("�̸� :");
		String irum = scn.next();
		System.out.print("�������� :");
		int kor = scn.nextInt();
		System.out.print("�������� :");
		int eng = scn.nextInt();
		System.out.print("�������� :");
		int mat = scn.nextInt();
		
		int tot=kor+eng+mat;
		double ave = tot/3.;
		
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println(bun+"\t"+irum+"\t"+tot+"\t"+ave+"\t");
		

	}

}
