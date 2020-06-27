import java.util.Scanner;

/*
 * 세개의 정수 중 , 중간값 찾아서 출력하기
 *  조건 연산자 (조건식)? 참 : 거짓 ;
 *  버전 6
 *  값을 바꾸기 a->b->b->imsi->imsi->a
 */
public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		int med = 0;
		if(a>b) { 
			if(a>c) {
				med = b;
			}else {
				med = c;
			}
		 }else {
			if(b>c) { 
				med = c;
			}else {
				med = b;
			}
		}
	
		//출력
		System.out.print("정수1 : " + a + "\t");
		System.out.print("정수2 : " + b + "\t");
		System.out.print("정수3 : " + c + "\t");
		System.out.print("중앙값 : " + med);
	}

}