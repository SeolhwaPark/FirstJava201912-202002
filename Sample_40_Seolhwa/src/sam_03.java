import java.util.Scanner;

//03 세게 입력 받아 대중소 구하기
public class Sam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("a 정수를 입력하세요 :");
		int a = scn.nextInt();
		System.out.print("b 정수를 입력하세요 :");
		int b = scn.nextInt();
		System.out.print("c 정수를 입력하세요 :");
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
			System.out.println("입력오류");
		}
	

	}
}