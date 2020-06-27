import java.util.Scanner;

public class sam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int a = scn.nextInt();
		
		for(int i = 2; i<=a; i++) {
			if(a % i == 0) {
				if(a == i){
					System.out.println("소수 ");
				}else {
					System.out.println("소수아님");
					break;
				}
			}
		}

	}

}
