package lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

/*
 * 출력예시
 * 게임수 입력:2//얼마든지 입력가능..
 * 1 :23,10,17,35,40,7
 * 2 :10,19,30,32,38,22
 * 
 * 처리조건
 * 로또번호는 1~45숫자 중   임의 수 6개,숫자만 + 보너스 1개로 구성된다
 * ex) 38,27,10,4,40,17 -30
 * 
 * 사용자가 입력한 6개의 수치를 비교하여 당첨여부를 결정한다.
 * 1등 :보너스 번호를 제외한 6개 모두 맞추는 경우
 * 2등 :6개 중 5개를 맞추고 보너스번호와 일치한 수가 있을 경우
 * 3등 :보너스번호를 제외한 5개를 맞추는 경우
 * 4등 :보너스번호를 제외한 4개를 맞추는 경우
 * 5등 :보너스번호를 제외한 3개를 맞추는 경우
 * 
 * 게임결과
 * 당첨번호 : 10,19,22,28,34,40 - 보너스 7 <-입력해야함
 * 1 : 7,10,17,23,35,40 - 꽝
 * 2 :10,19,22,30,32,38 -5등
 */

public class LottoExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String[] win; // 당첨번호 입력받는 스트링 배열
		
		while (true) { // 게임횟수를 입력받는 반복문
			System.out.print("게임입력 :");
			String game = scn.nextLine(); // 게임 횟수 입력 (String으로 받는 이유는 유효성 검사를 하기 위함. numCheck 메소드)
			if (numCheck(game)) { // 숫자인지 판단하는 메소드 가장 아래에 메소드 생성 해놓음 , 숫자가아닌 문자열이 들어오면 true로 if문 실행됨
				System.out.println("숫자를 입력해주세요"); // 숫자가 아닌 문자열이 들어왔으므로 경고메세지 출력
				continue; // 반복문의 처음으로 돌아감
			}
			cnt = Integer.parseInt(game); // game 횟수는 문자열이므로 정수형으로 바꿔서 cnt에 넣어줌
			break;
		}

		while (true) {
			System.out.print("당첨번호 입력:");
			win = scn.nextLine().split(","); // 당첨번호를 문자열로 받아서, split 메소드를 이용하여 문자 배열로 분리해줌
			if (lengthCheck(win)) // 문자열배열의 길이가 7인지 확인하는 메소드 아래쪽에 생성해놓음
				continue; // 문자열의 길이가 7이 아니면 반복문 처음으로 돌아가서 당첨번호를 다시 입력받음
			if (numArrayCheck(win)) // 각각의 문자열배열의 숫자가 1~45사이의 숫자인지 확인하는 메소드
				continue; // 1~45의 숫자가 아니라면 당첨번호를 다시 입력받음
			break; // 당첨번호가 제대로 입력됐을 시 반복문을 빠져나옴
		}
		gamesu(cnt, win); // 하단부 gamesu 메소드를 호출 문자열배열과, cnt(게임수)를 매개변수로 넘겨줌
	}

//-----------------------------------------------------------------------------
	static void gamesu(int cnt, String[] str) {
		Lotto lt[] = new Lotto[cnt]; // Lotto 클래스배열 생성 cnt는 게임수로, 클래스배열을 게임수만큼 생성해줌.
		Random r = new Random(); // 로또번호를 랜덤으로 생성하기 위한 Random 클래스를 생성
		for (int j = 0; j < cnt; j++) {
			int game[] = new int[6]; // 새로운 배열을 생성
			for (int i = 0; i < game.length; i++) {
				game[i] = r.nextInt(45) + 1; // 배열에 로또번호 6개를 차례대로 입력하는 for문
				for (int k = 0; k < i; k++) {
					if (game[i] == game[k]) { // 로또번호 중복 검사 , 중복된 번호가 있을 시 재입력받음.
						i--;
						break;
					}
				}
			}
			Lotto l = new Lotto(game); // 새로운 로또클래스를 생성
			lt[j] = l; // 새롭게 생성한 로또 클래스를 lt[] 클래스배열에 차례대로 지정해줌
		}
		LottoData ld = new LottoData(lt, cnt, str); // LottoData 클래스에 로또클래스배열과, 게임수 , 당첨번호를 넘겨줌
		ld.lottoPrint(); // 로또데이터 클래스의 로또프린트 메소드를 호출하여, 로또번호 및 당첨여부를 출력함
	}

	
	
	static boolean lengthCheck(String str[]) { // 로또 당첨번호의 갯수가 7개인지를 확인하는 메소드, 7개가 맞는경우 false를 리턴한다
		if (!(str.length == 7)) {
			System.out.println("번호를 7개 입력해주세요.");
			return true;
		} else
			return false;
	}

	
	
	static boolean numCheck(String a) { // 문자열이 들어오면 숫자만 들어왔는지 확인하는 메소드, 숫자만 들어왔을 경우 false를 리턴한다
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return true;
			}
		}
		return false;
	}

	
	
	static boolean numArrayCheck(String[] a) { // 문자열 배열을 매개변수로 받아 문자열 배열안의 값이 숫자만 들어있는지 확인 후 1부터 45사이인지를 확인하는 메소드
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) { // 숫자만 들어있는지 확인하는 메소드
				if (a[i].charAt(j) < '0' || a[i].charAt(j) > '9') {
					System.out.println("숫자만 입력해주세요.");
					return true; // 숫자만 들어있지 않을시 true를 리턴
				}
			}
			if (Integer.parseInt(a[i]) > 45 || Integer.parseInt(a[i]) < 1) { // 숫자의 범위가 1~45인지를 확인하는 메소드
				System.out.println("1~45이내의 범위만 가능합니다."); 
				return true; // 1~45이외의 숫자일 경우 true를 리턴
			}
		}
		return false; // 1~45범위이고, 숫자만 들어있다면 false를 리턴
	}
}
