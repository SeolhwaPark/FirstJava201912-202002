import java.util.Scanner;

/*
 * Ű���� �Է�
 * ��ȣ: 
 * ����:
 * ����:
 * ����:
 * 
 *  ���
 *  ��ȣ ���� ���� ���� ���� ��� ����
 * 
 * ó������:
 * ���� = ���� + ���� +���� 
 * ��� = ����/3.
 * ���������� ����� 3���� ��� 40�̻��̰� ��� 60�̻� "�հ�"
 * 1�����̶� 40�̸��̸� "����"
 * 3���� ��� 40�̻��̳� ��� 60 �̸��̸�"���հ�"
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȣ:");
		int bun = scan.nextInt();
		System.out.print("����:");
		int kor = scan.nextInt();
		System.out.print("����:");
		int eng = scan.nextInt();
		System.out.print("����:");
		int mat = scan.nextInt();
		
		int tot = kor+eng+mat;
		double ave = (double)tot/3.; 
		String panjeng="";
/*		if(ave>=60) {
			if(kor>=40 && eng>=40 && mat>=40) {
				panjeng="�հ�";
			}else {
				panjeng="����";
			}}
		
			else {
				panjeng="���հ�";
			}
*/
		
		if(kor>=40 && eng>=40 && mat>=40 && ave>=60) {
			panjeng="�հ�";
		}else {
			if(ave<60) { //if(kor<40 || eng<40 || mat<40)
				panjeng="���հ�"; //����
			}else {
				panjeng="����";}
			} //���հ�

		System.out.print("���");
		System.out.println("");
			System.out.print(bun+"\t");
			System.out.print(kor+"\t");
			System.out.print(eng+"\t");
			System.out.print(mat+"\t");
			System.out.print(tot+"\t");
			System.out.print(ave+"\t");
			System.out.print(panjeng+"\t");
	}

}

