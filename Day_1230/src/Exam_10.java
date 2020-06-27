import java.util.Scanner;

/*
 * 세개의 정수 중 , 큰 값과 작은 값 찾기
 *  조건 연산자 (조건식)? 참 : 거짓 ;
 * 버전 3
 *  
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		int max = (a>b)? a : b;
		max = (max<c)? c : max;
		System.out.print("Max : " + max);
	}

}