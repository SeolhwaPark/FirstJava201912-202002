import java.util.Scanner;

/*
 * 키보드 입력(2~1024) 입력
 * 입력 값을 2진수 변환해서 출력
 * 입력 값이 -99이면 종료
 * 
 * 입력 : 10
 * 2진수 : 1010
 * 입력 : 1
 * 입력오류
 * 입력 : 127
 * 2진수 : 1111111
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[]; //배열
		
		while(true) {
			a = new int[10];
			int cnt = 0;
			System.out.print("10진수를 입력하세요 : ");
			int data = scn.nextInt();
			if(data == -99) break;
			
			if(data>=2 && data<=1024) {
				int temp = data;
				int mok; //
				int namoji; //
				do {
					mok=temp/2; // 2진수
					namoji=temp%2; // 2진수
					a [cnt] = namoji; //나머지값이 배열에 들어감
					temp= mok; 
					cnt++;
				}while(mok!=0);
					System.out.print("2진수 : " );
				
				for(int x=cnt-1; x>=0; x--) {//2진수(10진수를 2로 나눴을 때의 나머지를 역순으로 출력)
					System.out.print(a[x] + " ");
				}
				System.out.println();
			}else {
				System.out.println("err 입력오류!!! 다시 입력하세요");
			}
		}

	}
}
