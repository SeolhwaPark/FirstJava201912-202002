/*
 * arraycopy
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[][] var = {{1,2,3},{4,5,6}};//두줄에 세칸
		int[][] str = new int[3][10];//배열을 복사넣을 곳을 크게 만들어놈
		
		System.arraycopy(var, 0, str, 0, var.length);
		for(int x=0; x<str.length; x++) {
			for(int y=0; y<str[x].length;y++) {
				System.out.print(str[x][y] + "\t");
			}
			System.out.println();
		}
		
	}

}
