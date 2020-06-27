import java.util.Scanner;

/*
 * 조건과 반복은 중요함
 */

public class Exam_03 {
	public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
				int var;
				while(true) {
					System.out.print("정수 입력 (1~99) : ");
					var = scn.nextInt();
					if(var==0) {
						break;
					}
					if(var>=1 && var<=99) {
						int sum =0; //1 ~ var 합계
						for(int x=1;x<=var;x++) {
							sum+=x;
					}
						System.out.println("1~"+ var + "합계 : " + sum);
			}
		}
	}
}