import java.util.Scanner;

/*
 * 키보드 입력
 * 1.정수 10개를 입력하고 합계를 출력
 * 
 * 2.정수 10개를 입력하고 합계를 출력(단 입력 값이 음수는 배제한다)
 * 
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//for();
		int sum = 0;
		for(int x=1; x<=10; x++) { //음수도 가능
			System.out.print("정수 : ");
			int var = scn.nextInt();
			sum+=var;
		}
		System.out.println("합계 : " + sum);
		
		//while();
		int cnt = 0; //갯수
		int tot = 0; //합계
		while(cnt<10) {
			System.out.print("정수 : ");
			int var = scn.nextInt();
			tot+=var;
			cnt++;
		}
		System.out.println("합계 : " + tot);
	}

}
