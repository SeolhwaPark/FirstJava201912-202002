/*
 * 2���� �迭
 * 
 * score[0] 0��° ���
 * score[0][0] 0��° ����� 0��° ��
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		int [][] score = new int[5][4];//[��row][ĭcolum]
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
		for(int x=0; x<ss.length; x++) { //row ��
			for(int y=0; y<ss[x].length; y++) { //colum ���� ĭ��
				System.out.print(ss[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
