import java.util.Scanner;

public class sam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i=0, s=0;
		
		while(true) {
		System.out.print("�Է��ϼ��� :");
		int a = scn.nextInt();
		
		if(a == 0) {
			System.out.println("�����Ǽ� :"+ i);
			System.out.println("�����հ� :"+ s);
		break;
		}
			i++;
			s+=a;
		}
	 }
}
