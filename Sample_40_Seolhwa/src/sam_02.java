import java.util.Scanner;

/*
 * 02.
 */
public class sam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a =0;
		int b = 0;
		
		System.out.println("�Է�a :");
		a = scn.nextInt();
		System.out.println("�Է�b :");
		b = scn.nextInt();
		
		if(a==b) {
			System.out.println("�Է¿���");
		}else if(a>b) {
			System.out.println("max = a");
			System.out.println("min = b");

		}else {
			System.out.println("max = b");
			System.out.println("max = a");
		}

	}

}
