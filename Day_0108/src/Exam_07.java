/*
 * sort 
 * 버블 : 큰 숫자 찾기 , 뒤부터 정렬되서 앞이 바뀜
 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[] bun = {5,3,1,4,2};
		int[] score = {50,70,60,90,80};
		// 출력
		// 1 2 3 4 5
		// 60 80 70 90 50
		System.out.print("정렬 전 번호 : "); // 번호 원본
		for (int x = 0; x < bun.length; x++) {
			System.out.print(bun[x] + "\t");
		}
		System.out.println();

		System.out.print("정렬 전 점수 : "); // 점수 원본
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();

		for (int x = 0; x < bun.length - 1; x++) {// 기준
			for (int y = x + 1; y < bun.length; y++) {// 비교해서
				if (bun[x] > bun[y]) { // 오름차순구조로 정렬
					int temp = bun[x]; // 넣어둘 곳
					int tempp = score[x]; //
					
					bun[x] = bun[y];// 데이터교환방법
					bun[y] = temp;
					
					score[x] = score[y];
					score[y] = tempp;
				}
			}

		}
		System.out.print("번호 : "); // 번호 원본
		for (int x = 0; x < bun.length; x++) {
			System.out.print(bun[x] + "  ");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.print("점수  : "); // 점수 원본
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
	}
}