/*
 * 2차원 배열
 * 성적입력 평균 추가
 * 
 * 번호 국어 영어 수학 총점 평균 석차
 */

public class Exam_11 {
	public static void main(String[] args) {
		int score[][]= {{1,90,78,79,0,1},{5,95,80,70,0,1},
				{2,79,88,77,0,1},{4,75,88,77,0,1},{3,95,88,75,0,1}};
		//double avg[] = {} //평균은 실수
		double avg[] = new double[5];
		
		//입력
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0; x<score.length-2; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
		
		//총점계산
		for(int x=0; x<score.length; x++) {
			for(int y=1; y<4; y++) {
				score[x][4]+=score[x][y];
			}
			//평균계산
			avg[x] = (int)(score[x][4]/3.*10 +0.5)/10.; //소수이하 2자리까지 나옴
		}
		
		//석차계산
		for(int x=0; x<score.length;x++) {
			//int r=1; //석차
			for(int y=0; y<score.length;y++) {//자기 자신과 비교를 한 번함
				if(score[x][4]<score[y][4]){//총점을 기준으로 할 때
				score[x][5]++;//자기자신을 증가
					//	r++;
				}
			}
		}
		//sort 전 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.print(avg[x]);//평균출력
			System.out.println(score[x][score[x].length-1]);//석차출력
			System.out.println();
		}

		//번호를 기준으러 오름차순 정렬
		for(int x=0; x<score.length; x++) {
			for(int y=x+1; y<score.length;y++) { //비교해야되기 때무네 1더함 
				
				if(score[x][0]>score[y][0]) { //번호를 기준으로 열을 정렬
					for(int k =0; k<score[0].length; k++) {//k = 항목
						int temp = score[x][k]; //번호
						score[x][k] = score[y][k];
						score[y][k] = temp;
					}
					double imsi = avg[x];
					avg[x] = avg[y];
					avg[y] = imsi;
				}
			}
		}

		//Sort 후 출력 
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length-1; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.print(avg[x]);//평균출력
			System.out.println(score[x][score[x].length-1]);//석차출력
			System.out.println();
		}
	}
}
