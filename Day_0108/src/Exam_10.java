/* (1)
 * 1  6  11  16  21
 * 2  7  12  17  22
 * 3  8  13  18  23
 * 4  9  14  19  24
 * 5  10 15  20  25
 * 
 * (2)
 * 1
 * 2  3
 * 4  5  6
 * 7  8  9  10
 * 11 12 13 14 15
 * 
 * (3)
 *              1
 *           2  3
 *        4  5  6
 *    7  8  9  10
 * 11 12 13 14 15
 * 
 * (4)
 * 1
 * 3  2
 * 6  5  4
 * 10 9  8  7
 * 15 14 13 12 11
 */

public class Exam_10 {
	public static void main(String[] args) {

		// (1)

		int a[][] = new int[5][5];
		// 입력
		int cnt = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				cnt++;
				a[y][x] = cnt;
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
		System.out.println("-----------------------------------------");

		// (2)

		int b[][] = new int[5][5];
		// 입력
		int cn = 0;
		for (int x = 0; x < b.length; x++) {
			for (int y = 0; y <= x; y++) {
				cn++;
				b[x][y] = cn;
			}
		}

		// 출력
		for (int x = 0; x < b.length; x++) {
			for (int y = 0; y < b[0].length; y++) {
				if (b[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(b[x][y] + "\t");
				}

			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		// (3)

		int c[][] = new int[5][5];
		// 입력
		int cnttt = 0;
		for (int x = 0; x < c.length; x++) {
			for (int y = 4-x; y < c.length; y++) {
			//for(int y=c.length-x; y<c[0].length; y++)
				cnttt++;
				c[x][y] = cnttt;
			}
		}

		// 출력
		for (int x = 0; x < c.length; x++) {
			for (int y = 0; y < c[0].length; y++) {
				if (c[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(c[x][y] + "\t");
				}

			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");

		// (4)

		int e[][] = new int[5][5];
		// 입력
		int cnttttt = 0;
		for (int x = 0; x < e.length; x++) {
			for (int y = x; y >= 0; y--) {
				//int y=e.length; y>=0,j--
				cnttttt++;
				e[x][y] = cnttttt;
			}
		}

		// 출력
		for (int x = 0; x < e.length; x++) {
			for (int y = 0; y < e[0].length; y++) {
				if (e[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(e[x][y] + "\t");
				}
			}
			System.out.println();
		}

	}
}