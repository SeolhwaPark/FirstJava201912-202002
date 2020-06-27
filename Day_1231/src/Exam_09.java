import java.util.Scanner;

/*키보드 입력
 *50에서 90사이의 자료만 10개만 입력시키고 합계 출력
 *입력 예; 10,80,60,90,95.......
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt =0; 
		int sum = 0; 
		int var = 0; 
		while(cnt<10) {
			System.out.println("입력 : ");
			var = scn.nextInt();
			if(var>=50 && var<=90) {
				cnt++;
				sum+=var;
				}
			
		}
		System.out.println("sum = "+ sum);
		
	}

}
