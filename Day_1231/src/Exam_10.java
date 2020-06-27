import java.util.Scanner;

/*키보드 입력
 *자료 무제한 입력
 *입력 예; 10,80,60,90,95.......-1
 *단, 입력자료에 음수가 입력되면 종료와 동시에,
 *입력 자료중 50 ~ 90 사이의 자료만 *합계*와 *평균* 출력
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; 
		int sum = 0; 
		int var = 0;
		int n = 0;
		while(true) {
			System.out.println("입력 : ");
			var = scn.nextInt();
			if(var<0) 
				break; //무한반복
			}
			if(var>=50 && var<=90) { //50 ~ 90 사이의 자료
				cnt++;
				sum+=var;
		}
		System.out.println("sum = "+ sum);
		System.out.println("ave = "+ (double)sum/cnt);
	}

}
