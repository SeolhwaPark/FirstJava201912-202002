package rensyuu;

class Hak {
	int bun;
	String name;
	int[] score;

	Hak() {
	}

	Hak(int b, String n, int[] s) {
		bun = b;
		name = n;
		score = s;
	}

}

class HakData {
	Hak[] hak;

	HakData(Hak[] hak) {
		this.hak = hak;
		hakPrint();
	}

	void hakPrint() {
		System.out.println("번호\t이름\t점수");
		for (int x = 0; x < hak.length; x++) {
			System.out.print(hak[x].bun + "\t");
			System.out.print(hak[x].name + "\t");
			for (int y = 0; y < hak[x].score.length; y++) {
				System.out.print(hak[x].score[y] + "\t");
			}
			System.out.println();
		}
	}


}

/*
 * 출력 번호 이름 점수 1 AAA 77 80 87 90 85
 */
public class rensyuu_08 {
	public static void main(String[] args) {
		Hak[] hak = new Hak[5];
		hak[0] = new Hak(1, "AAA", new int[] { 90, 87, 95, 80, 77 });
		hak[1] = new Hak(5, "BBB", new int[] { 12, 26, 94, 56, 60 });
		hak[2] = new Hak(3, "WWW", new int[] { 50, 69, 48, 30, 99 });
		hak[3] = new Hak(4, "CCC", new int[] { 96, 78, 65, 48, 83 });
		hak[4] = new Hak(2, "GGG", new int[] { 20, 35, 16, 50, 72 });

		HakData data = new HakData(hak);
	}

}
