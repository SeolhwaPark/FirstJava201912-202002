/*
 * sort 
 * ���� : ū ���� ã�� , �ں��� ���ĵǼ� ���� �ٲ�
 
 */
public class Exam_06 {
	public static void main(String[] args) {
		int[] score = {50,70,60,90,80,77,45,78};
		System.out.print("Data : ");
		for(int x=0; x<score.length;x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		
		for(int x=0; x<score.length-1; x++) { //����
			for(int y=0; y<score.length-(x+1); y++) { //���ϸ鼭 ������ŭ �پ����
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
