package rensyuu;

import java.util.Scanner;

/*
 * 1차원 배열을 이용한 검색
 * 
 * 1. 선형검색
 * 2. 이진검색
 * 
 */
public class Sample_01 {
	public static void main(String[] args) {
		int [] score = {90,49,78,67,55,34,55,15,64,89};
		System.out.print("Data Print");
		for(int x = 0; x<score.length ; x++) {
			System.out.print(score[x] + ",");
		}
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("찾는 값 :");
		int var = scn.nextInt();
		boolean flag = false;
		
		for(int x = 0; x<score.length; x++) { //선형검색법
			if(var == score[x]) {
				System.out.println(var + "는 " + x + "번째에 있음");
				flag = true;
				break;
			}
		}
		if(!flag) { //동일한 값은 없다
		System.out.println(var + "는 없음");
		}
	}

}
