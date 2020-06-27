import java.util.Scanner;

/*
 * 정수 2개 입력
 *  만약 두 수의 차이가 10이상이면 큰 수에 -5, 작은 수에 +5
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수 1 : ");
		int a = scn.nextInt();
		System.out.print("정수 2 : ");
		int b = scn.nextInt();
		//두 수의 차이 계산
		int c = 0;
		if(a>=b) {
			c = a - b;
		}
		if(a<b) {
			c = -b - a;
		}
		if(c>=10) {
			if(a>=b) {
				a = a - 5;
				b = b + 5;
			}
			if(a<b) {
				b = b - 5;
				a = a + 5;
			}
		}
		System.out.println("");
	}

}
