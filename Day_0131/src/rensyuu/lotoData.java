package rensyuu;

public class lotoData {
	Loto[] lotto;
	int cnt;
	int[] atatta = new int[7];

	lotoData() {
	}

	lotoData(Loto[] lotto, int cnt, String[] str) {
		this.lotto = lotto;
		this.cnt = cnt;
		for (int x = 0; x < atatta.length; x++) {
			atatta[x] = Integer.parseInt(str[x]);
		}
	}

	void dataPrint() {
		// 게임수 입력하면 자동출력
		for (int x = 0; x < cnt; x++) {
			for (int y = 0; y < 6; y++) { // 6자리에 게임수 넣어서 로또를 돌림
				for (int z = 0; z < 6; z++) {
					if (lotto[x].game[y] == atatta[z]) {
						lotto[x].cnt++;
					}
					// 당첨번호와 생성된 게임번호를 비교하여, 일치하는 값이 있다면 cnt를 1증가
					if (lotto[x].game[y] == atatta[6]) {
						lotto[x].bonasu = true;

					}
				}
			}
		}
		// lottoo 클래스 배열의 rank값에 따른 등수를, 각 클래스의 rank변수에 입력해주는 반복문.
		for (int x = 0; x < cnt; x++) {
			if (lotto[x].cnt < 3)
				lotto[x].rank = "꽝";
			else if (lotto[x].cnt == 3)
				lotto[x].rank = "*5등*";
			else if (lotto[x].cnt == 4)
				lotto[x].rank = "*4등*";
			else if (lotto[x].cnt == 5)
				lotto[x].rank = "*3등*";
			else if (lotto[x].cnt == 5 && lotto[x].bonasu)
				lotto[x].rank = "*2등*";
			else if (lotto[x].cnt == 6)
				lotto[x].rank = "*1등*";
		}
		System.out.println("당첨번호 :");
		for (int x = 0; x < atatta.length - 1; x++) {
			System.out.print(atatta[x]);
			if (x < 6)
				System.out.print(",");
		}
		System.out.println("- 보너스" + atatta[6]);
		// 당첨번호만 출력, 그담 보너스번호 출력
		for (int x = 0; x < cnt; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.print(lotto[x].game[y] + "\t");
			}
			System.out.println("=" + lotto[x].rank);
		}
	}

}
