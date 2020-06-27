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
		// ���Ӽ� �Է��ϸ� �ڵ����
		for (int x = 0; x < cnt; x++) {
			for (int y = 0; y < 6; y++) { // 6�ڸ��� ���Ӽ� �־ �ζǸ� ����
				for (int z = 0; z < 6; z++) {
					if (lotto[x].game[y] == atatta[z]) {
						lotto[x].cnt++;
					}
					// ��÷��ȣ�� ������ ���ӹ�ȣ�� ���Ͽ�, ��ġ�ϴ� ���� �ִٸ� cnt�� 1����
					if (lotto[x].game[y] == atatta[6]) {
						lotto[x].bonasu = true;

					}
				}
			}
		}
		// lottoo Ŭ���� �迭�� rank���� ���� �����, �� Ŭ������ rank������ �Է����ִ� �ݺ���.
		for (int x = 0; x < cnt; x++) {
			if (lotto[x].cnt < 3)
				lotto[x].rank = "��";
			else if (lotto[x].cnt == 3)
				lotto[x].rank = "*5��*";
			else if (lotto[x].cnt == 4)
				lotto[x].rank = "*4��*";
			else if (lotto[x].cnt == 5)
				lotto[x].rank = "*3��*";
			else if (lotto[x].cnt == 5 && lotto[x].bonasu)
				lotto[x].rank = "*2��*";
			else if (lotto[x].cnt == 6)
				lotto[x].rank = "*1��*";
		}
		System.out.println("��÷��ȣ :");
		for (int x = 0; x < atatta.length - 1; x++) {
			System.out.print(atatta[x]);
			if (x < 6)
				System.out.print(",");
		}
		System.out.println("- ���ʽ�" + atatta[6]);
		// ��÷��ȣ�� ���, �״� ���ʽ���ȣ ���
		for (int x = 0; x < cnt; x++) {
			for (int y = 0; y < 6; y++) {
				System.out.print(lotto[x].game[y] + "\t");
			}
			System.out.println("=" + lotto[x].rank);
		}
	}

}
