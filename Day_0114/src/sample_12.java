import java.util.Scanner;

/*
 * 키보드로 정수를 10개 입력
 * 합과 평균을 구하여 출력
 * 입력자료가 0이면 끝
 * 
 */
public class sample_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = 0;
		int cnt = 0;
		System.out.print("입력하세요 :");
		while(true){
			int a = scn.nextInt();
			s += a;
			cnt++;
			if(a == 0)break;

		}
		System.out.println("합계는 " + s);
		System.out.println("평균은 " + s/cnt);
		
		
		
		
	}

}
