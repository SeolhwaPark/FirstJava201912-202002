/*
 * sort 
 * 버블 : 큰 숫자 찾기 , 뒤부터 정렬되서 앞이 바뀜
 
 */
public class Exam_06 {
	public static void main(String[] args) {
		int[] score = {50,70,60,90,80,77,45,78};
		System.out.print("Data : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		
		for(int x=0; x<score.length-1; x++) { //기준
			for(int y=0; y<score.length-(x+1); y++) { //비교하면서 변수만큼 줄어들음
				if(score[y]>score[y+1]) {
					int temp = score[y];
					
					score[y] = score[y+1];
					score[y+1] = temp;
				}
			}
		}
		
		System.out.print("Sort : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
	}

}
