import java.util.Scanner;

/*
 * 키보드로 정수 입력 
 * 
 * 홀수만 5개 골라서 갯수 , 합계 출력
 * 입력자료가 0이면 종료
 * 
 * 입력:34
 * 입력:55
 * 입력:67
 * 입력:89
 * 입력:66
 * 입력: 0
 */
public class sample_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = 0;
		int cnt = 0;
		System.out.print("입력하세요 :");
		for(int i = 1; i <= 10; i++) {
			s = scn.nextInt();
			if(i%2 == 1) {
				s+=i;
				cnt++;
			}
		}
		System.out.println("홀수의 개수 :" + cnt);			
		System.out.println("합계 " + s);
		
		
		
		
	}

}

