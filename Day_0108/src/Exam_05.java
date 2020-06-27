/*
 * sort 순차정렬
 * 선택 : 첫번째를 선택해서 기준으로서 잡고 옆과 차례적으로 비교함. 종료하는 값이 일정함
 */
public class Exam_05 {
	public static void main(String[] args) {
		int[] score = {50,70,60,90,80,77,45,78};
		System.out.print("Data : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		for(int x=0; x<score.length-1; x++) {//기준 //기준과 비교할 대상이 없게 -1
			for(int y=x+1; y<score.length; y++) {//비교해서
				if(score[x]>score[y]) { //오름차순구조로 정렬
					int temp = score[x]; //넣어둘 곳
					score[x] = score[y];//데이터교환방법
					score[y] = temp;
				}
			}
		}
		System.out.print("Sort : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
	}

}
