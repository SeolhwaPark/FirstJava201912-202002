import java.util.Scanner;

/*
 * 키보드 입력
 * 1.정수 10개를 입력하고 합계를 출력
 * 
 * 2.정수 10개를 입력하고 합계를 출력(단 입력 값이 음수는 배제한다)
 * 
 */

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//while();
/*		int cnt = 0; //갯수
		int tot = 0; //합계
		while(true) {
			System.out.print("정수 : ");
			int var = scn.nextInt();
			if(var>0) {
				tot+=var;
				cnt++;
			}
		}
		System.out.println("합계 : " + tot);
*/		
		
		//for();==while(true) 무한뤂
		int sum = 0;
		for(int x=1; x<=10; x++) { //음수합계 불가능 버젼
			System.out.print("정수 : ");
			int var = scn.nextInt();
			if(var>0) {
				sum+=var;
			}else {
				x--; //0보다 적으면 마이너스, 0보다 크면 플러스
			}
		}
		System.out.println("합계 : " + sum);
	}

}
