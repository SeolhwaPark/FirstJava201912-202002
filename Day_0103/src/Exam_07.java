import java.util.Scanner;

/*
 * 키보드로 정수입력
 * 1. 	입력 범위(2 ~ 100)
 * 2. 	입력된 정수를 2진수로 변환 후 출력
 * 3.	예
 *  	정수입력 : 101 
 *  	입력오류 ---> 재입력
 *  	정수입력 : 10
 *  	10진수 (10) : 2진수(1010) 
 *  	종료
 */

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dec; //10진수
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			dec = scn.nextInt();
			if(dec >=2 && dec <=100) {
				break;
			}
			System.out.print("입력 오류! ");
		}
		int temp = dec;//10진수 기억용
		String bin = ""; // 2진수 기억용
		int mok, na; //몫, 나머지
		do {
			mok = temp/2; // 몫 // 8진수 만들땐 temp/8
			na = temp%2; //나머지
			bin = na + bin; //2진수.. na가 앞으로 오게 함 
			temp = mok; //
		}while(mok != 0); //!= 0과 같지 않을 동안
		
		System.out.println("10진수(" + dec  +")" );
		System.out.println("2진수(" + bin  +")" );
	}
}
