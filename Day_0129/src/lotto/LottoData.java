package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * ��¿���
 * ���Ӽ� �Է�:2
 * 1 :23,10,17,35,40,7
 * 2 :10,19,30,32,38,22
 * 
 * ó������
 * �ζǹ�ȣ�� 1~45���� ��   ���� �� 6��,���ڸ� + ���ʽ� 1���� �����ȴ�
 * ex) 38,27,10,4,40,17 -30
 * 
 * ����ڰ� �Է��� 6���� ��ġ�� ���Ͽ� ��÷���θ� �����Ѵ�.
 * 1�� :���ʽ� ��ȣ�� ������ 6�� ��� ���ߴ� ���
 * 2�� :6�� �� 5���� ���߰� ���ʽ���ȣ�� ��ġ�� ���� ���� ���
 * 3�� :���ʽ���ȣ�� ������ 5���� ���ߴ� ���
 * 4�� :���ʽ���ȣ�� ������ 4���� ���ߴ� ���
 * 5�� :���ʽ���ȣ�� ������ 3���� ���ߴ� ���
 * 
 * ���Ӱ��
 * ��÷��ȣ : 10,19,22,28,34,40 - ���ʽ� 7
 * 1 : 7,10,17,23,35,40 - ��
 * 2 :10,19,22,30,32,38 -5��
 */
public class LottoData {
	Lotto[] lottoo;
	int cnt;
	int[] atari = new int[7];

	LottoData() {
	}

	// �ζ� Ŭ�����迭�� ���Ӽ�, ��÷��ȣ�� �Է¹���
	LottoData(Lotto[] lottoo, int cnt, String str[]) {
		this.lottoo = lottoo; // Ŭ�����迭
		this.cnt = cnt; // ���Ӽ�
		for (int i = 0; i < 7; i++) {
			// ��÷��ȣ�� ���ڿ��迭�̱� ������ ������ �ٲ㼭 atari �迭�� �Է�����.
			atari[i] = Integer.parseInt(str[i]);
		}
	}

	void lottoPrint() {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					if (lottoo[i].game[j] == atari[k])
						lottoo[i].cnt++;
					// ��÷��ȣ�� ������ ���ӹ�ȣ�� ���Ͽ�, ��ġ�ϴ� ���� �ִٸ� cnt�� 1����
				}
				if (lottoo[i].game[j] == atari[6])
					lottoo[i].bonus = true;
				// ��÷��ȣ �������ڸ� ������ ���ʽ���ȣ�� ��ġ�ϴ� ���� �ִٸ� �ζ�Ŭ������ bonus ������ true�� �ٲ���.
			}
		}

		for (int i = 0; i < cnt; i++) {
			// lottoo Ŭ���� �迭�� rank���� ���� �����, �� Ŭ������ rank������ �Է����ִ� �ݺ���.
			if (lottoo[i].cnt < 3)
				lottoo[i].rank = "��";
			
			else if (lottoo[i].cnt == 3)
				lottoo[i].rank = "5��";
			
			else if (lottoo[i].cnt == 4)
				lottoo[i].rank = "4��";
			
			else if (lottoo[i].cnt == 5 && lottoo[i].bonus)
				lottoo[i].rank = "2��";
			
			// �ζ�Ŭ������ cnt�� 5�̰�, ���ʽ��� true�϶� ��µ�.
			else if (lottoo[i].cnt == 5)
				lottoo[i].rank = "3��";
			
			else if (lottoo[i].cnt == 6)
				lottoo[i].rank = "1��";
		}

		System.out.print("��÷��ȣ : ");
		// ��÷��ȣ�� ������ִ� �޼ҵ� atari.length-1 �� ������ 6��° �迭������ ��÷��ȣ, 7��°�� ���ʽ���ȣ
		for (int i = 0; i < atari.length - 1; i++) {
			System.out.print(atari[i]);
			if (i < 6)
				System.out.print(", ");
		}
		System.out.println("�� ���ʽ� " + atari[6]);
		// ��÷��ȣ�� �������� ������ ���ʽ���ȣ�� ���� ���
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(lottoo[i].game[j] + "\t");
			} // ���� 1ȸ�� �ζǹ�ȣ 6���� ���
			System.out.println(" -- " + lottoo[i].rank); // ���� 1ȸ�� ��÷���θ� ���
		}

	}

}
