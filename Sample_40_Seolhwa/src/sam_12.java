import java.util.Scanner;

public class sam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�Է��ϼ��� : ");
		int a = scn.nextInt();
		
		for(int i = 2; i<=a; i++) {
			if(a % i == 0) {
				if(a == i){
					System.out.println("�Ҽ� ");
				}else {
					System.out.println("�Ҽ��ƴ�");
					break;
				}
			}
		}

	}

}
