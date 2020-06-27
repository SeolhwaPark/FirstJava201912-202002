import java.util.Scanner;

/*
 * 메인
 * 키보드입력(최대 10개)
 * 오름차순 정렬하는 클래스 생성
 * 입력 : 2 6 9 7 5 2 6
 *
 *메소드
 * 출력
 * 전 : 2 6 9 7 5 2 6 
 * 후 : 2 2 5 6 6 7 9
 * 

 */

class HH{
	//출력
	void hhPrint(int a[],int cnt) {
		System.out.print("출력 :");
		for(int x = 0; x < cnt; x++) {
			System.out.print( a[x] + "\t" );
		}
		System.out.println();
	}
	//정렬
	void sort(int a[],int cnt) {
		for(int x=0; x<cnt-1; x++) {//기준 //기준과 비교할 대상이 없게 -1
			for(int y=x+1; y < cnt; y++) {//비교해서
				if(a[x] > a[y]) { //오름차순구조로 정렬
					int temp = a[x]; //넣어둘 곳
					a[x] = a[y];//데이터교환방법
					a[y] = temp;			
				}
			}
		}
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int cnt = 0; //개수
		System.out.print("입력 : ");
		//입력작업
		for(int x = 0; x < a.length; x++) {
			a[x] = scn .nextInt();
			if(a[x] == -99) break;
			cnt++;
		}
		//객체생성
		HH hh = new HH();
		
		// 전 (출력 메소드) 호출
		hh.hhPrint(a, cnt);
		
		// 정렬 메소드) 호출
 		hh.sort(a, cnt);
		
		// 후 (출력 메소드) 호출
		hh.hhPrint(a, cnt);
	}
}
