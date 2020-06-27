import java.util.Scanner;

/*
 * 키보드로 데이터 입력
 * 1. 입력자료는 1~100사이 정수 - if
 * 2. 입력자료 중 3의 배수이면서 - if
 * 	  7의 배수만 합계하고 그 평균을 구하여 출력
 * 3. 그 해당하는 입력자료(2번에 해당되면)가 7개이면 프로그램은 종료. 
 * 		1씩 카운트-if
 * 4. 입력 예시
 * 		입력자료 : 0
 * 		"error 입력범위가 아님"
 *		입력자료 : 8
 *		입력자료 : 77
 *		입렫자료 : 200
 *		"error 입력범위가 아님"
 *		입력자료 : 88
 *		합계 : XXX
 *		평균 : XX.XX
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0; //갯수
		int sum = 0; //합계
		int var = 0; //입력자료 보관
		
		while(true) {//무한뤂
			System.out.print("1~100사이의 정수를 입력하세요 : ");
			var = scn.nextInt();//반복해야할 대상
			//1~100사이 정수를 입력
			if(var>=1 && var<=100) {
				if(var%3==0 && var%7==0){
				//입력자료가 3의 배수이면서 7의 배수
					cnt++;
					sum+= var;
					if(cnt==7) //반복 되야할 수 
						break;
				}
			}else {
				System.out.println("error 입력범위가 아닙니다");
			}
		}//while끝 
		
		System.out.println("sum : "+ sum);
		System.out.println("ave : "+ (double)sum/cnt);
	}
}