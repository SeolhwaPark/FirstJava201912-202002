/*
 * 2차원 배열
 * 
 * score[0] 0번째 요소
 * score[0][0] 0번째 요소의 0번째 값
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		int [][] score = new int[5][4];//[줄row][칸colum]
		//score[0][0] = 10;
		System.out.println("row : " + score.length);
		System.out.println("col : " + score[0].length);
		System.out.println("value : " + score[0][0]);
		
		int[] s = {1,2,3,4,5};
		int[][] ss = {{1,2,3},{1,2},{1,2,3,4,5,6}};
		for(int x=0; x<s.length; x++) {
			System.out.print(s[x]+"\t");
		}
		System.out.println();
		for(int x=0; x<ss.length; x++) { //row 층
			for(int y=0; y<ss[x].length; y++) { //colum 층당 칸수
				System.out.print(ss[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
