/*
 * 
 */
public class Exam_09 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		//입력
		int cnt = 0;
		for(int x =0; x<a.length; x++) {
			for(int y = x; y<a[0].length; y++) {
				cnt++;
				a[x][y]= cnt;
			}
		}
		
		//출력
		for(int x =0; x<a.length; x++) {
			for(int y =0; y<a[0].length; y++) {
				if(a[x][y]==0) {
					System.out.print("\t");
				}else {
					System.out.print(a[x][y]+"\t");
				}
				
			}
			System.out.println();
		}
	}
}
