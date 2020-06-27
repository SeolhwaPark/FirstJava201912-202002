import java.util.Scanner;

/*
 * 키보드로 정수를 10개 입력
 * 합과 평균을 구하여 출력
 * 입력자료가 10이면 끝
 * 
 */
public class sample_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0;
		int s = 0;
		System.out.print("입력하세요 :");
		for(int i = 1; i <= 10; i++) {
			a = scn.nextInt();
			s+=a;
		}
		System.out.println(s);
		System.out.println(s);
		
		
		
		
	}

}
