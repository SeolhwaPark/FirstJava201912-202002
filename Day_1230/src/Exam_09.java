import java.util.Scanner;

/*
 * 세개의 정수 중 , 큰 값과 작은 값 찾기
 * 버전2
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		int max = a;//가장 큰 값 저장
		if (max < b){ //반대로
			max = b;
		}
		if (max < c){
			max = c;
		}
		System.out.print("Max : " + max);
	}

}