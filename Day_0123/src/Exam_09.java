import java.util.Scanner;

/*
 * 키보드로 게임 수 를 입력 받아서 출력
 * 게임수 : 5개
 * 1: 4 5 6 7 8 9 10 //소트해서 나옴
 * 2: 23 45 23 11 27 38//이것도
 * . . . . .
 * 5: 6개
 * 
 */
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] lotto = new int[100][6];
		System.out.print("입력하세요 :");
		int game = scn.nextInt();
		int a[] = { 1, 5, 4, 3, 2, 87, 8, 5, 4 };

		for (int k = 0; k < game; k++) {
			int[][] bindo = new int[45][2];

			for (int x = 0; x < bindo.length; x++) {
				bindo[x][0] = x + 1;
			}
			for (int r = 0; r < 100; r++) {//100번 돌리기
				for (int y = 0; y < lotto[k].length; y++) {
					lotto[k][y] = (int) (Math.random() * 45 + 1);
					bindo[lotto[k][y] - 1][1]++;

// 중복체크

					for (int j = 0; j < y; j++) {
						if (lotto[k][y] == lotto[k][j]) {
							bindo[lotto[k][y] - 1][1]--;
							y--;
							break;
						}
					}
				}
			}
//소트
			sort2(bindo);
			for (int x = 0; x < lotto[k].length; x++) {
				lotto[k][x] = bindo[x][0];
			}
			sort(lotto[k]);
		}
//출력
		for (int k = 0; k < game; k++) {
			System.out.print((k + 1) + ":");
			for (int i = 0; i < lotto[k].length; i++) {
				System.out.print(lotto[k][i] + "\t");
			}
			System.out.println();
		}
	}

	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	static void sort2(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][1] < a[j][1]) {
					int temp = a[i][0];
					int temp1 = a[i][1];
					a[i][0] = a[j][0];
					a[i][1] = a[j][1];
					a[j][0] = temp;
					a[j][1] = temp1;

				}
			}
		}
	}
}
