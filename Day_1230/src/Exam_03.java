import java.util.Scanner;

/*
 *키보드로 정수 2개 입력 크기 비교하기 
 *
 *if문의 코딩방식 3가지
 *
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("정수 1 : ");
		int a = scn.nextInt();
		System.out.print("정수 2 : ");
		int b = scn.nextInt();
		if(a>b) System.out.println("a>b");
		
		if(a<b)
			System.out.println("a<b");
		
		if(a==b) {
			System.out.println("a=b");
		}
	}

}
