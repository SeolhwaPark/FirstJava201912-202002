import java.util.Scanner;

/*
 * 키보드 입력(2~1024) 입력
 * 10진수와 16진수 외의 진수출력하기
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[]; //배열
		
		while(true) {
			a = new int[10];
			int cnt = 0;
			System.out.print("10진수를 입력하세요 : ");
			int data = scn.nextInt();
			int num = scn.nextInt();

			if(data == -99) break;
			
			if(data>=2 && data<=1024) {
				int temp = data;
				int mok; //
				int namoji; //
				do {
					mok=temp/num; // 10진수와 16진수 이외의 진수
					namoji=temp%num; 
					a [cnt] = namoji; //나머지값이 배열에 들어감
					temp= mok; 
					cnt++;
				}while(mok!=0);
					System.out.print(num+"진수 : " );
				for(int x=cnt-1; x>=0; x--) {
					System.out.print(a[x] + " ");
				}
				System.out.println();
			}else {
				System.out.println("err 입력오류!!! 다시 입력하세요");
			}
		}

	}
}
