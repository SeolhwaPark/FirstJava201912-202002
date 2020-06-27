package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 출력예시
 * 게임수 입력:2
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
 * 당첨번호 : 10,19,22,28,34,40 - 보너스 7
 * 1 : 7,10,17,23,35,40 - 꽝
 * 2 :10,19,22,30,32,38 -5등
 */
public class LottoData {
	Lotto[] lottoo;
	int cnt;
	int[] atari = new int[7];

	LottoData() {
	}

	// 로또 클래스배열과 게임수, 당첨번호를 입력받음
	LottoData(Lotto[] lottoo, int cnt, String str[]) {
		this.lottoo = lottoo; // 클래스배열
		this.cnt = cnt; // 게임수
		for (int i = 0; i < 7; i++) {
			// 당첨번호는 문자열배열이기 때문에 정수로 바꿔서 atari 배열에 입력해줌.
			atari[i] = Integer.parseInt(str[i]);
		}
	}

	void lottoPrint() {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					if (lottoo[i].game[j] == atari[k])
						lottoo[i].cnt++;
					// 당첨번호와 생성된 게임번호를 비교하여, 일치하는 값이 있다면 cnt를 1증가
				}
				if (lottoo[i].game[j] == atari[6])
					lottoo[i].bonus = true;
				// 당첨번호 마지막자리 숫자인 보너스번호와 일치하는 값이 있다면 로또클래스이 bonus 변수를 true로 바꿔줌.
			}
		}

		for (int i = 0; i < cnt; i++) {
			// lottoo 클래스 배열의 rank값에 따른 등수를, 각 클래스의 rank변수에 입력해주는 반복문.
			if (lottoo[i].cnt < 3)
				lottoo[i].rank = "꽝";
			
			else if (lottoo[i].cnt == 3)
				lottoo[i].rank = "5등";
			
			else if (lottoo[i].cnt == 4)
				lottoo[i].rank = "4등";
			
			else if (lottoo[i].cnt == 5 && lottoo[i].bonus)
				lottoo[i].rank = "2등";
			
			// 로또클래스의 cnt가 5이고, 보너스가 true일때 출력됨.
			else if (lottoo[i].cnt == 5)
				lottoo[i].rank = "3등";
			
			else if (lottoo[i].cnt == 6)
				lottoo[i].rank = "1등";
		}

		System.out.print("당첨번호 : ");
		// 당첨번호를 출력해주는 메소드 atari.length-1 인 이유는 6번째 배열까지가 당첨번호, 7번째는 보너스번호
		for (int i = 0; i < atari.length - 1; i++) {
			System.out.print(atari[i]);
			if (i < 6)
				System.out.print(", ");
		}
		System.out.println("ㅡ 보너스 " + atari[6]);
		// 당첨번호만 출력해줬기 때문에 보너스번호를 따로 출력
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(lottoo[i].game[j] + "\t");
			} // 게임 1회의 로또번호 6개를 출력
			System.out.println(" -- " + lottoo[i].rank); // 게임 1회의 당첨여부를 출력
		}

	}

}
