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

class HH1{
	
	AA a = new AA();
	//출력
	void hhPrint(int []a, int cnt, String str){
		System.out.print(str + " :");
		for(int x = 0; x<cnt; x++) {
			System.out.print(a[x] + "\t");
		}
		System.out.println();
	}
	
	//정렬
	void dataSort(int a[],int cnt) {
		for(int x = 0; x<cnt-1; x++) {
			for(int y= x+1; y<cnt; y++) {
				if(a[x]<a[y]) {
					int imsi = a[x];
					a[x] = a[y];
					a[y] = imsi;
				}
			}
		}
	}
	
}

public class Exam_08_sam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int cnt = 0;
		//입력
		System.out.print("입력 : ");
		for(int x = 0 ; x<10; x++) {
			a[x] = scn.nextInt();
			if(a[x] == -99) break;
			cnt++;
		}
		System.out.println("입력건수 : " + cnt);
		//객체생성
		HH1 h = new HH1();
		
		//전 출력
		h.hhPrint(a,cnt, "전");
		//정렬
		h.dataSort(a, cnt);
		
		//후 출력
		h.hhPrint(a,cnt, "후");

	}
}
