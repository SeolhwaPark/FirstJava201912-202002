import java.util.Scanner;

/*
 * ������ ���� �� , ū ���� ���� �� ã��
 *  ���� ������ (���ǽ�)? �� : ���� ;
 *  ���� 4
 */
public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("����1 : ");
		int a = scn.nextInt();
		System.out.print("����2 : ");
		int b = scn.nextInt();
		System.out.print("����3 : ");
		int c = scn.nextInt();
		
		int max, med , min;
		if(a>b) { //a>b
			if(a>c) { //a>c
				System.out.println("Max ="+ a);
				if(b>c) {
					System.out.println("Me ="+ b);
					System.out.println("Min ="+ c);
				}else {
					System.out.println("Me ="+ c);
					System.out.println("Min ="+ b);
				}
			}else {
				System.out.println("Max ="+ c);
				System.out.println("Me ="+ a);
				System.out.println("Min ="+ b);
			}
		}else { //b>a
			if(b>c) {
				System.out.println("Max ="+ b);
				if(a>c) {
					System.out.println("Me ="+ a);
					System.out.println("Min ="+ c);
				}else {
					System.out.println("Me ="+ c);
					System.out.println("Min ="+ a);
				}
			}else { //b>c
				System.out.println("Max ="+ c);
				System.out.println("Me ="+ b);
				System.out.println("Min ="+ a);
			}
		}
	}

}