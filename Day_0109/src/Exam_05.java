import java.util.Scanner;

/*
 * 2차원 배열
 * 성적입력작업
 * 
 * 입력 
 * 번호 국어 영어 수학
 * 
 * 출력
 * 번호 국어 영어 수학 총점 평균
 */

public class Exam_05 {
	public static void main(String[] args) {
		int score[][]= new int[5][6];//출력되야할 항목이 6
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		for(int x=0; x<score.length; x++) {
			System.out.print((x+1) + "번 입력 : ");
			score[x][0] = scn.nextInt();
			score[x][1] = scn.nextInt();
			score[x][2] = scn.nextInt();
			score[x][3] = scn.nextInt();
			score[x][4] = score[x][1]+score[x][2]+score[x][3];
			score[x][5] = score[x][4]/3;
			}
			
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0; x<score.length; x++) { //입력자료가 4개
			for(int y=0; y<score[x].length-2; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
			//총점평균
					
		//for(int x=0; x<score.length; x++) { //입력자료가 4개
		//	score[x][4] = score[x][1]+score[x][2]+score[x][3];
		//	score[x][5] = score[x][4]/3;
		for(int x=0; x<score.length; x++) { //입력자료가 4개
			for(int y=1; y<=3; y++) {
				score[x][4] += score[x][y];
			}
			score[x][5] = score[x][4]/3;
		}
			
			//int b1 = scn.nextInt();
			//공백을 이용해서 복수입력가능
			//int b2 = scn.nextInt(); 
			//int b3 = scn.nextInt(); 
			//int b4 = scn.nextInt(); 			
		
		
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int x = 0; x<score.length; x++) { //입력자료가 4개
			for(int y = 0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.println();
		}

	}

}
