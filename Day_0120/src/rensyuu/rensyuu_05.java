package rensyuu;

import java.util.Scanner;

/*
 * 키보드입력 최대 10개
 * 입력 값이 -99이면 출력
 * 
 * 
 * 출력 예
 * 	20
 * +30
 * +50
 * +60
 * ----
 * XXX
 * 
 */
public class rensyuu_05 {
	//출력
	static void print(int score[],int cnt) {
		int sum = 0;
		System.out.println(" " + score[0]);
		for(int x = 1; x < cnt; x++) {
			sum += score[x];
			System.out.println("+" + score[x]);
		}
		System.out.println("-=-=-");
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//입력
		int [] score = new int[10];
		int cnt = 0;
		System.out.print("입력 :");		
		do {
			score[cnt] = scn.nextInt();
			if(score[cnt] == -99) break;
		    cnt++;
		}while(cnt<10);
		
		//호출
		print(score,cnt-1);
		
	}

}
