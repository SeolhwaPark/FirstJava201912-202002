import java.util.Scanner;

/*
 * 정수 2개입력 크기 비교하기
 *  예) 79,88 입력시
 *  => 79<=88
 *  
 *  70,60 입력시
 *  => 70>=60
 */ 

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("a=");
		int a=scn.nextInt();
		System.out.print("b=");
		int b=scn.nextInt();
		
		if(a>=b) {
			System.out.println(a+">="+b);
		}else {
			System.out.println(a+"<="+b);
		
		}
	
	}
}


