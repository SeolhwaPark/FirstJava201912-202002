import java.util.Scanner;

/*
 * 키보드로 임의의 정수 data 10개 입력
 *  단, data는 50이상 100이하 만 입력  
 *  1,60,50,70,-99,69,60
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			int[] score = new int [10];  // 입ㄹ력받고
			int cnt = 0;  //data 갯수 카운트하기
			
			while(true) {  //무한 반복 
				System.out.print("정수 입력 : ");
				int jumsu = scn.nextInt();
				if (jumsu>=50 && jumsu<=100) {
					score[cnt] = jumsu ;  // 0번째의 배열에서 부터 들어가게 함
					cnt++;  //카운트할 갯수 증가
					if(cnt==10) { //입력수
						break;  //탈출 
					}
				}
			}
			//출력
			for(int i=0; i<10; i++ ) {  //정해진 횟수 반복
				System.out.println(score[i]+"	");
			}
	}

}
