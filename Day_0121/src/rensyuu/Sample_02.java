package rensyuu;

/* 1차원 배열
 * 이진검색법
 * 데이터가 반드시 정렬되어 있어야 한다
 */
import java.util.Scanner;

public class Sample_02 {
	public static void main(String[] args) {
		int [] score = {11,23,35,40,55,60,70,98,90,95};
		System.out.print("Data Print");
		for(int x = 0; x<score.length ; x++) {
			System.out.print(score[x] + ",");
		}
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("찾는 값 :");
		int var = scn.nextInt();
		
		int low = 0; // 배열의 시작
		int high = score.length-1; //배열의 끝
		int mid = 0; // 중앙값
		while(true) {
			if(low > high) {
				System.out.println("검색불가");
				break;
			}
		}
			mid = (low + high) / 2;
			
			if(var == score[mid]) {
				System.out.println(var + "" + mid + "번째");
			}
			if (var > score[mid]){
				low = mid + 1;
			}else {
				high = mid -1;
			}
		
		//오른쪽 감소
		//왼쪽 증가
	}
	

}
