import java.util.Scanner;

/*
 * 키보드입력 (1~10)-> 7개 입력
 * 입력 ;5
 * 입력 ; 0
 * 입력오류
 * 입력;9
 * . . . 
 * 0을 입력시 입력오류 , 7개 출력시 출력되게 해야함
 * 
 * [출력]
 * 입력자료 : 5 9 x x x x x
 * 최대값 :
 * 최소값 :
 * 합계(최대 최소를 뺀 합계)
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		int a = score[0];
		int cnt = 0;
		//입력
		while(cnt<7) { //7개가 클 때
			System.out.print("입력 : ");
			int data = scn.nextInt();
			if(data>=1 && data<=10) {
				score[cnt] = data;
				cnt++;
			}
		}
		//출력테스트
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		//계산
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		
		for(int x=1; x<score.length; x++) {
			if(max<score[x]) {
				max = score[x];
			}
			if(min>score[x]) {
				min = score[x];
			}
		sum += score[x];
		
		}
		//출력
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
		System.out.println("합계 : " + (sum - max - min));
		
	}//main
}//class
