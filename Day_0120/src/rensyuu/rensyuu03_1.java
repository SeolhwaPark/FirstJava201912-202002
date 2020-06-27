package rensyuu;

import java.util.Scanner;

/*
 * 키보드로 10개 데이터 입력
 *  - 배열에 저장
 * 
 */
public class rensyuu03_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하세요 :");
		for(int x = 0; x<10; x++) {
		int a = scn.nextInt();
		System.out.println(a + "+");
		}
		
	//입력과 출력을 분리해서 배열에 저장하기	
		System.out.println("sum =");
	}

}
