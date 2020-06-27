import java.util.Scanner;

/*
 * 세개의 정수 중 , 큰 값과 작은 값 찾기
 *  조건 연산자 (조건식)? 참 : 거짓 ;
 *  버전 5
 *  값을 바꾸기 a->b->b->imsi->imsi->a
 */
public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		if(a<b) {
			int imsi = a;
			a=b;
			b=imsi;
		}
		if(a<c) {
			int imsi = a;
			a=c;
			c=imsi;
		}
		if(b<c) {
			int imsi = b;
			b=c;
			c=imsi;
		}
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

}