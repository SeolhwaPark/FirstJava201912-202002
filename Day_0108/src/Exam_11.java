/*
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25	

int a[][] = new int[5][5];
		// 입력
		int cnt = 0;
		int b = 0;
		
		for (int x = 0; x < a.length; x++) {
			for (int y =0; y < a.length; y++) {
				cnt++;
				a[x][y] = cnt;
			}
		}
 */



/*ㄹ자(기본적인 반배정할 때 자주 씀)
 * 
 * 1  6  11  16  21
 * 2  7  12  17  22
 * 3  8  13  18  23
 * 4  9  14  19  24
 * 5  10 15  20  25
 */
public class Exam_11{
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		// 입력
		int cnt = 0;
		int b = 0;//
		
		for (int x = 0; x < a.length; x++) {
			if(x%2==0) {
				for (int y =0; y < a[0].length; y++) {
					b++;
					a[x][y] = b;
				}
			}else {
				for(int y=a.length-1;y>=0;y--) {
					b++;
					a[x][y]=b;
				}
			}
		}

		// 출력
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				if (a[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[x][y] + "\t");
				}

			}
			System.out.println();
		}
		
		
		

	}

}
