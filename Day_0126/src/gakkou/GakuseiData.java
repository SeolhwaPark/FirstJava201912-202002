package gakkou;

public class GakuseiData {
	Gakusei[] gaku;
	int cnt;
	int[] sum = new int[10];
	double[] ave = new double[10];

	GakuseiData() {
	}

	GakuseiData(Gakusei[] gak, int cnt) {
		gaku = gak;
		this.cnt = cnt;
		rankPrint();
		sortPrint();
	}

	void seisekiPrint() {
		for (int x = 0; x < cnt; x++) {
			sum[x] = gaku[x].jum3 + gaku[x].jum1 + gaku[x].jum2; // 합계
			ave[x] = ((int) (sum[x] / 3. * 100)) / 100.; // 평균
			gaku[x].sum = sum[x];
			gaku[x].ave= ave[x];
			gaku[x].gakuseiPrint();
		}
	}

	// 소속된 과별로 석차 출력
	void rankPrint() {
		for (int x = 0; x < cnt-1; x++) {
			gaku[x].rank = 1;
			for (int y = x+1; y < cnt; y++) {
				if (gaku[x].sum < gaku[y].sum)
					gaku[x].rank= gaku[x].rank+1;
			}
		}
	}
	//합계로 정렬
	void sortPrint() {
		for (int x = 0; x < cnt - 1; x++) {
			for (int y = x + 1; y < cnt; y++) {
				if (gaku[x].sum > gaku[y].sum) {
					int temp = gaku[x].sum;
					gaku[x].sum = gaku[y].sum;
					gaku[y].sum = temp;
				}
			}
		}
	}

	
}
