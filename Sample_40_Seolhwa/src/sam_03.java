import java.util.Scanner;

//03 ���� �Է� �޾� ���߼� ���ϱ�
public class Sam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("a ������ �Է��ϼ��� :");
		int a = scn.nextInt();
		System.out.print("b ������ �Է��ϼ��� :");
		int b = scn.nextInt();
		System.out.print("c ������ �Է��ϼ��� :");
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
		if(a==b || a==c || b==c) {
			System.out.println("�Է¿���");
		}
	

	}
}