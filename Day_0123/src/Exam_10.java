import java.io.BufferedReader;
import java.util.Scanner;

/*
 * 키보드로 게임 수 를 입력 받아서 출력
 * 게임수 : 5개
 * 1: 4 5 6 7 8 9 10 //소트해서 나옴
 * 2: 23 45 23 11 27 38//이것도
 * . . . . .
 * 5: 6개
 * 
 * 
 * 처리조건
 * 1게임당 가상으로 100겜 후 발생빈도가 높은 6개의 숫자를 추출해서 입력
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int game[][] = new int[5][6];
		System.out.print("입력하세요 :");
		int su = scn.nextInt();
		int cnt[] = new int[46];// 빈도수 배열
		
		for (int k = 0; k < su; k++) {
			for (int x = 0; x < game.length; x++) {
				game[k][x] = (int) (Math.random() * 45 + 1);
				// 중복쳍크
				for (int y = 0; y < x; y++) {
					if (game[0][x] == game[0][y]) {
						x--;
						break;
					}
				}
			}
		}
		for (int x = 0; x < game.length; x++) {
			System.out.print((x + 1) + " :");
			for (int y = 0; y < game.length; y++) {
				System.out.print(game[x][y] + "\t");
			}
			System.out.println();
		}
		// 빈도수
		// [1] 입력 : 범위 : 0부터 45까지의 값만 들어온다고 가정
		int mode = 0; // 최빈값이 담길 그릇
		int max = Integer.MIN_VALUE; // 최대값을 저장하기위한 변수 ; 초기값은 정수형의 최소값지정
		
		// [2] 처리
		for (int x = 0; x < cnt.length; x++) {
			game[su][x]++; //
		}
		
		for (int y = 0; y < game.length; y++) {
			if (max < game[y][mode]) {
				max = game[y][mode]; // MAX
				mode = y; // 최빈값 : MODE
			}
		}
		// [3] 출력
		System.out.println("최빈값 : " + mode + " , " + max);
	}
	
}
