package rensyuu;

import java.util.Random;
import java.util.Scanner;

/*
 * 출력예시
 * 게임수 입력:2
 * 1 :23,10,17,35,40,7 랜덤
 * 2 :10,19,30,32,38,22
 * 
 * 사용자가 입력한 6개의 수치를 비교하여 당첨여부를 결정한다.
 * 1등 :보너스 번호를 제외한 6개 모두 맞추는 경우
 * 2등 :6개 중 5개를 맞추고 보너스번호와 일치한 수가 있을 경우
 * 3등 :보너스번호를 제외한 5개를 맞추는 경우
 * 4등 :보너스번호를 제외한 4개를 맞추는 경우
 * 5등 :보너스번호를 제외한 3개를 맞추는 경우
 * 
 * 게임결과
 * 
 * 당첨번호 입력 : 10,19,22,28,34,40 - 보너스 7
 * 1 : 7,10,17,23,35,40 - 꽝
 * 2 :10,19,22,30,32,38 -5등
 * 
 *	처리조건
 * 로또번호는 1~45숫자 중   임의 수 6개,숫자만 + 보너스 1개로 구성된다
 * ex) 38,27,10,4,40,17 -30
 */
public class LotoExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String[] winwin; // 당첨받은거 넣는 배열
		// 게임수입력
		while (true) {
			System.out.print("게임횟수 입력:");
			String gamesu = scn.nextLine();// 유효성검사를 위해 스트링
			// 유효성검사메소드
			if (numCheck(gamesu)) {
				continue;
			}
			cnt = Integer.parseInt(gamesu);
			break;
		}
		// 당첨번호 입력
		while (true) {
			System.out.print("당첨번호 입력:");
			winwin = scn.nextLine().split(",");
			// 7자리확인메소드
			if (lengthCheck(winwin))
				continue;
			if (numArrayCheck(winwin))
				continue;
			break;
		}
		// 데이터불러오기
		gamesu(cnt, winwin);

	}

	// ----처리에 필요한 메소드----
	// 게임수 만큼 자동 입력...
	static void gamesu(int cnt, String[] str) {
		Loto[] l = new Loto[cnt];
		Random ran = new Random();
		for (int x = 0; x < cnt; x++) {
			int[] game = new int[6]; // 6개
			for (int y = 0; y < game.length; y++) {
				game[y] = ran.nextInt(45) + 1;
				for (int z = 0; z < y; z++) {
					if (game[y] == game[z]) {
						y--;
						break;
					}
				}
			}
			Loto ll = new Loto(game);
			l[x] = ll;
		}
		lotoData ld = new lotoData(l, cnt, str);
		ld.dataPrint();
	}

	// 문자열 자릿수 7개인지 아닌지
	static boolean lengthCheck(String[] str) {
		if (!(str.length == 7)) {
			System.out.println("오류! 번호를 7개 입력하시오");
			return true;
		} else return false;// 참
	}

	// 문자열의 숫자 유효성검사
	static boolean numCheck(String a) {
		for (int x = 0; x < a.length(); x++) {
			if (a.charAt(x) < '0' || a.charAt(x) > '9') {
				System.out.println("오류! 숫자를 입력하시오");
				return true;
			}
		}
		return false; // 참
	}

	// 문자열의 배열안에 숫자가 있는지,그 숫자가 1~45의 숫자인지 검사
	static boolean numArrayCheck(String[] a) {
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length(); y++) {
				if (a[x].charAt(y) > '0' || a[x].charAt(y) < '9') {
					System.out.println("오류! 숫자를 입력하시오");
					return true;
				}
			}
			if (Integer.parseInt(a[x]) > 45 || Integer.parseInt(a[x]) < 1) {
				System.out.println("오류! 1부터 45 사이의 숫자를 입력하시오");
				return true;
			}
		}
		return false;// 참
	}

}