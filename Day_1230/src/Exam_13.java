import java.util.Scanner;

/*
 * ������ ���� �� , �߰��� ã�Ƽ� ����ϱ�
 *  ���� ������ (���ǽ�)? �� : ���� ;
 *  ���� 6
 *  ���� �ٲٱ� a->b->b->imsi->imsi->a
 */
public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("����1 : ");
		int a = scn.nextInt();
		System.out.print("����2 : ");
		int b = scn.nextInt();
		System.out.print("����3 : ");
		int c = scn.nextInt();
		
		int med = 0;
		if(a>b) { 
			if(a>c) {
				med = b;
			}else {
				med = c;
			}
		 }else {
			if(b>c) { 
				med = c;
			}else {
				med = b;
			}
		}
	
		//���
		System.out.print("����1 : " + a + "\t");
		System.out.print("����2 : " + b + "\t");
		System.out.print("����3 : " + c + "\t");
		System.out.print("�߾Ӱ� : " + med);
	}

}