import java.util.Scanner;

/*
 * 세개의 정수 중 , 큰 값과 작은 값 찾기
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수 1 : ");
		int a = scn.nextInt();
		System.out.print("정수 2 : ");
		int b = scn.nextInt();
		System.out.print("정수 3 : ");
		int c = scn.nextInt();
		
		int max = 0;//가장 큰 값 저장
		if(a>b) { //a가 클 때
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c) { //b가 클 때
				max = b;
			}else {
				max = c;
			}
		}
		
		
	}

}
