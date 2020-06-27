import java.util.Scanner;

/*키보드 입력
 *50에서 90사이의 자료만 10개 입력시키고 합계 출력
 *입력 예; 10,80,60,90,95.......
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt =0; //카운트
		int sum = 0; //합계
		int var = 0; //입력자료 보관
		while(true) {
			System.out.println("입력해주세요 : ");
			var = scn.nextInt();//반복해야할 대상
			if(var>=50 && var<=90) {
				cnt++;
				sum+=var;
				if(cnt==10) //반복 되야할 수 
					break;
				}
		}
		System.out.println("sum = "+ sum);//sum
		
	}

}
