import java.util.Scanner;

/*
 * 2차원 배열
 * 성적입력작업
 * 
 * 번호 국어 영어 수학
 */

public class Exam_03 {
	public static void main(String[] args) {
		int score[][]= new int[5][4];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		for(int x=0; x<score.length; x++) {
			System.out.print((x+1) + "번 입력 : ");
			score[x][0] = scn.nextInt();
			score[x][1] = scn.nextInt();
			score[x][2] = scn.nextInt();
			score[x][3] = scn.nextInt();

			//int b1 = scn.nextInt();
			//공백을 이용해서 복수입력가능
			//int b2 = scn.nextInt(); 
			//int b3 = scn.nextInt(); 
			//int b4 = scn.nextInt(); 			
		}
		// nextInt 버퍼라는 임시기억장소에서 데이터를 꺼내오기 위해 필요함
		//버퍼는 입출력을 빠르게 할 임시기억장소
		//scn.NextLine();
		// 엔터키를 만나는 부분 까지 읽음.새로운 버퍼에 저장
		//출력
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
		}
			System.out.println();

/*		for(int x=0; x<score.length; x++) {
			System.out.print(score[x][0]+"\t");
			System.out.print(score[x][1]+"\t");
			System.out.print(score[x][2]+"\t");
			System.out.print(score[x][3]+"\n");
*/
		}

	}

}
