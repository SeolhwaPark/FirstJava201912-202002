import java.util.Scanner;

/*키보드 입력(10개)
 * 오름차순 정렬 출력
 * 1. 입력 출력은 main()
 *  source Data :xx xx xx . . . 
 *  sort Data : xx xx xx . . . 
 *  
 * 2.오름차순 정렬은 메소드 이용
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		for(int x=0; x<score.length; x++) {
			System.out.print("정수 입력하세요 : ");
			score[x] = scn.nextInt();
		}
		
		printData1("Source", score);
		//오름차순
		selectionSort(score);
		
		printData1("Sort", score);
		
		
	}
	static void selectionSort(int[] score){
	 	System.out.println(score);
		for(int x=0; x<score.length-1; x++) {//기준 //기준과 비교할 대상이 없게 -1
			for(int y=x+1; y<score.length; y++) {//비교해서
				if(score[x]>score[y]) { //오름차순구조로 정렬
					int temp = score[x]; //넣어둘 곳
					score[x] = score[y];//데이터교환방법
					score[y] = temp;
				}
			}
		}
		
	}
	static void printData1(String str , int[] score){
		System.out.println(str + " Data : ");
		for(int x=0; x<score.length; x++) {
			System.out.println(score[x] + "\t");
		}
		System.out.println();
		
	}
}