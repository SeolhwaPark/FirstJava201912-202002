/*
 * 2차원 배열
 * 
 * 
 * 번호 국어 영어 수학
 */

public class Exam_07 {
	public static void main(String[] args) {
		int score[][]= {{1,90,78,79,0},{5,95,80,70,0},
				{2,79,88,77,0},{4,75,88,77,0},{3,95,88,75,0}};
		
		//입력
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.println();

		}
		
		//총점계산
		
		for(int x=0; x>score.length; x++) {
			for(int y=1; y<4; y++) {
				score[x][4]+=score[x][y];
			}
		}
		
		//번호를 기준으러 오름차순 정렬
		
		for(int x=0; x<score.length; x++) {
			for(int y=x+1; y<score.length;y++) { //비교해야되기 때무네 1더함 
				if(score[x][0]>score[y][0]) { //번호를 기준으로 열을 정렬
					int temp = score[x][0]; //번호
						score[x][0] = score[y][0];
						score[y][0] = temp;
					temp = score[x][1]; //국어
						score[x][1] = score[y][1];
						score[y][1] = temp;
					temp = score[x][2]; //영어
						score[x][2] = score[y][2];
						score[y][2] = temp;
					temp = score[x][3]; //수학
						score[x][3] = score[y][3];
						score[y][3] = temp;
					temp = score[x][4]; //총점
						score[x][4] = score[y][4];
						score[y][4] = temp;
				}
			}
		}
		//출력 
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.println();

		}

	}

}
