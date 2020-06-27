package student;

/*
 * ��¿���
 * 
 * ������ ä�� ���ǥ
 * 
 * ��ȣ	 �̸� 	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ����
 * 1  	ȫ�⵿	o x o x. . . .
 * 
 * ������� 70%
 */
public class StudentData {
	Student[] jj;
	// ����
	int kotae[] = new int[20];
	int jung[] = new int[20];
	int cnt;

	StudentData() {
	}

	StudentData(Student[] jj, String[] kotae, int cnt) {
		this.jj = jj;
		this.cnt = cnt;

		for (int x = 0; x < kotae.length; x++) {
			this.kotae[x] = Integer.parseInt(kotae[x]);
		}

		cal();
	}

	void cal() { // ����� ��
		for (int x = 0; x < cnt; x++) {
			for (int y = 0; y < jj[x].dap.length; y++) {
				if (jj[x].dap[y] == kotae[y]) {
					jj[x].ox[y] = "o";
					jj[x].score += 5;
				} else {
					jj[x].ox[y] = "x";
				}
			}
		}

		for (int x = 0; x < kotae.length; x++) {
			for (int y = 0; y < cnt; y++) {
				if (jj[y].ox[x].equals("o")) {
					jung[x]++;
				}
			}
		}
		for (int x = 0; x < kotae.length; x++) {
			jung[x] = (int) (((double) jung[x] / cnt) * 100);
		}
		for (int x = 0; x < cnt; x++) {
			System.out.print(jj[x].bun + "\t" + jj[x].name + "\t");
			for (int y = 0; y < jj[x].ox.length; y++) {
				System.out.print(jj[x].ox[y] + "\t");
			}

			System.out.println(jj[x].score);
		}
		System.out.print("�����\t\t");
		for (int i = 0; i < kotae.length; i++) {
			System.out.print(jung[i] + "\t");
		}

	}
}
