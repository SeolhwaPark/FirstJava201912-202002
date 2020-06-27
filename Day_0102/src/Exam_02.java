import java.util.Scanner;

/*
 * 키보드로 데이터 입력
 * 1. 입력자료는 1~100사이 정수 - if
 * 2. 입력자료 중 7의 배수를 찾고 합계를 출력
 * 		전체 자료가 20개(오류포함) 이면 종료
 * 4. 입력 예시
 * 		입력자료 : 0
 * 		"error 입력범위가 아님"
 *		입력자료 : 8
 *		입력자료 : 77
 *		입렫자료 : 200
 *		"error 입력범위가 아님"
 *		입력자료 : 88
 *		20개의 자료 중 오류율(%) : XX%	
 *		20개의 자료 중 7의 배수 율(%) : XX%
 *		7의 배수 합 : XXX
 *		7의 배수 평균 : XXX
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; //갯수
		int sum = 0; //합계
		int var = 0; //입력자료 보관
		int err=0; //오류갯수
		int acc=0; //정확한자료갯수accuracy
		
		do {
			System.out.print("1~100사이의 정수를 입력하세요 : ");
			var = scn.nextInt();
			cnt++;
			if(var>=1 && var<=100) {
				if(var%7==0){ //7의 배수
					sum+=var;
					acc++;// 정확한 자료갯수
				}
			}else { //거짓일 때
				System.out.println("error 입력범위가 아닙니다");
				err++; //오류난 자료갯수
			}
		}while(cnt<20);//while끝 		
			err = (int)(((double)err/20) *100); //확률
			acc = (int)(((double)acc/20) *100); //확률
		
		System.out.println("20개의 자료 중 오류율(%) : "+ err + "%");
		System.out.println("20개의 자료 중 7의 배수 율(%) : "+ acc + "%");
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}

/*
		int cnt = 0; //갯수
		int sum = 0; //합계
		int var = 0; //입력자료 보관
		int errcnt=0; //오류갯수
		int totcnt=0; //정확한자료갯수
		
		do {
			System.out.print("1~100사이의 정수를 입력하세요 : ");
			var = scn.nextInt();
			totcnt++;
			if(var>=1 && var<=100) {
				if(var%7==0){ //7의 배수
					sum+=var;//배수의 합계
					cnt++;// 정확
				}else { //거짓일 때
				System.out.println("error 입력범위가 아닙니다");
				errcnt++; //오류난 갯수 파악
				}
			}
		}while(totcnt<20);//while끝 		
		errcnt = (int)(((double)errcnt/cnt) *100); //확률
		totcnt = (int)(((double)totcnt/cnt) *100); //확률
			
		System.out.println("20개의 자료 중 오류율(%) : "+ errcnt + "%");
		System.out.println("20개의 자료 중 7의 배수 율(%) : "+ totcnt + "%");
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}
*/