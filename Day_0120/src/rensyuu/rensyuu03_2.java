package rensyuu;

import java.util.Scanner;

/*
 * 키보드로 10개 데이터 입력
 *  - 배열에 저장
 * 
 */
public class rensyuu03_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하세요 :");
		int cnt = 0;
		while(true) {
			int a = scn.nextInt();
			cnt++;
			if(cnt == 10) break;
		}
		
	//입력과 출력을 분리해서 배열에 저장하기	
		System.out.print("AAA");
	}

}
