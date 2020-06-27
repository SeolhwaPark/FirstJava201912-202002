/*
 * 10개의 배열에 저장된 데이터 중 최대 최소값 찾기
 */

public class Exam_07 {
	public static void main(String[] args) {
		int score[] = {90,44,77,88,67,94,83,54,86,57};
		int max =score[0];
		int min = score[0];
		
		for(int x = 1; x<score.length; x++) {
			if(max < score[x]) {
				max = score[x];
			}
			if(min > score[x]) {
				min = score[x];
			}
		}
		System.out.print("입력자료 : ");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x] + "\t ");
		}
		System.out.println();
		System.out.println("최대 : "+ max);
		System.out.println("최소 : "+ min);
	}

}

