/*
 * arraycopy
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[][] var = {{1,2,3},{4,5,6}};//���ٿ� ��ĭ
		int[][] str = new int[3][10];//�迭�� ������� ���� ũ�� ������
		
		System.arraycopy(var, 0, str, 0, var.length);
		for(int x=0; x<str.length; x++) {
			for(int y=0; y<str[x].length;y++) {
				System.out.print(str[x][y] + "\t");
			}
			System.out.println();
		}
		
	}

}
