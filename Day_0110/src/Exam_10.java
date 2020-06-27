/*
 * 2차원 배열에 Data가 입력되어 있는 경우
 * 1 : 번호  xx xx xx xx xx
 * 2 :
 * .....
 * 5 : 
 * 
 * 1.입력 자료 출력 메소드 구현(dataPrint)
 *   번호 점수 1 점수2 점수3 점수 4 점수5
 *   . . . . . 
 * 2.총점 구하는 메소드 구현(dataTot)
 * 3.총점을 기준으로 내림차순 정렬 메소드 구현(totSort)
 * 4.전체 출력 메소드 구현(dataPrint2)
 *  번호 점수 1 점수2 점수3 점수 4 점수5 총점
 *   . . . . . 
 */
public class Exam_10 {

	public static void main(String[] args) {
		//배열선언 및 데이터 초기화
		int score[][] = {{1,11,22,33,44,55,0},{2,12,23,45,56,78,0},
			{3,99,88,77,66,55,0},{4,98,87,76,65,54,0},{5,14,25,36,47,58,0}};
		
		
		//dataPrint 호출
		dataPrint1(score);
		
		//dataTot 호출
		dataTot(score);
		
		//totSort 호출
		totSort(score);
		
		dataPrint2(score);
	}
	
	//입력자료를 출력 메소드
	static void dataPrint1(int[][] score) {
		System.out.println("입력자료출력-----------------------------------");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
				}
		System.out.println();
		}
	}

	//총점을 구하는 메소드
	static void dataTot(int[][] score) {
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score.length; y++) {
				score[x][6]+=score[x][y];
			}
		}
	}

	//총점으로 내림차순
	static void totSort(int[][] score) {
	for(int x=0; x<score.length; x++) {
		for(int y=x+1; y<score.length-1;y++) { //비교해야되기 때무네 1더함 
			if(score[y][6]>score[x][6]) { //총점울 기준으로 열을 정렬
				for(int k =0; k<score[0].length; k++) {//k = 항목
				int temp = score[x][k]; //번호
					score[x][k] = score[y][k];
					score[y][k] = temp;
				}
			}
		}
	}
}

	//전체출력메소드
	static void dataPrint2(int[][] score) {
		System.out.println("출력-----------------------------------");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t합계");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
			}
				System.out.println();
			}
	
		}
	
}
	
	

