package jslhrd3;

public class HakData extends Hak implements Account {

	int score[];
	int sum;
	double ave;

	HakData() {
	}

	HakData(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		super.score = score;
		total(score);
	}

	HakData(int bun, String name, int score[]) {
		this.bun = bun;
		this.name = name;
		this.score = score;
		total(score);
	}

	@Override
	public void total(int[] score) {
		for (int x = 0; x < score.length; x++) {
			sum += score[x];
		}
		ave = sum / (double) score.length;
	}

	@Override
	public void total(int score) {
		sum = score;
		ave = (double) score;
	}

	void print() {
		System.out.print("번호\t이름\t점수");
		if (score == null) {
			System.out.print("\n");
			super.print();
		} else {
			for (int x = 0; x < score.length; x++) {
				System.out.print("\t");
			}
			System.out.print("합계\t평균\n");
			System.out.print(bun + "\t" + name + "\t");
			for (int x = 0; x < score.length; x++) {
				System.out.print(score[x] + "\t");
			}
			System.out.print(sum + "\t" + ave);
		}
	}
}
