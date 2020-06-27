import java.util.Scanner;

/*
 * 2자리 이내의 정수를 입력 
 * 1부터 입력된 정수까지 합계를 출력
 *모든 변수는 괄호안에 있는 한 괄호안에서만 유효
 */

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var;
		while(true) {
			System.out.print("정수 입력 (1~99) : ");
			var = scn.nextInt();
			if(var>=1 && var<=99) {
				break;
			}
		}
		int sum =0; //1 ~ var 합계
		for(int x=1;x<=var;x++) {
			sum+=x;
		}
		System.out.println("1~"+ var + "합계 : " + sum);
	}
}
