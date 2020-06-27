package rensyuu;

import java.util.Random;
import java.util.Scanner;

/*
 * ��¿���
 * ���Ӽ� �Է�:2
 * 1 :23,10,17,35,40,7 ����
 * 2 :10,19,30,32,38,22
 * 
 * ����ڰ� �Է��� 6���� ��ġ�� ���Ͽ� ��÷���θ� �����Ѵ�.
 * 1�� :���ʽ� ��ȣ�� ������ 6�� ��� ���ߴ� ���
 * 2�� :6�� �� 5���� ���߰� ���ʽ���ȣ�� ��ġ�� ���� ���� ���
 * 3�� :���ʽ���ȣ�� ������ 5���� ���ߴ� ���
 * 4�� :���ʽ���ȣ�� ������ 4���� ���ߴ� ���
 * 5�� :���ʽ���ȣ�� ������ 3���� ���ߴ� ���
 * 
 * ���Ӱ��
 * 
 * ��÷��ȣ �Է� : 10,19,22,28,34,40 - ���ʽ� 7
 * 1 : 7,10,17,23,35,40 - ��
 * 2 :10,19,22,30,32,38 -5��
 * 
 *	ó������
 * �ζǹ�ȣ�� 1~45���� ��   ���� �� 6��,���ڸ� + ���ʽ� 1���� �����ȴ�
 * ex) 38,27,10,4,40,17 -30
 */
public class LotoExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String[] winwin; // ��÷������ �ִ� �迭
		// ���Ӽ��Է�
		while (true) {
			System.out.print("����Ƚ�� �Է�:");
			String gamesu = scn.nextLine();// ��ȿ���˻縦 ���� ��Ʈ��
			// ��ȿ���˻�޼ҵ�
			if (numCheck(gamesu)) {
				continue;
			}
			cnt = Integer.parseInt(gamesu);
			break;
		}
		// ��÷��ȣ �Է�
		while (true) {
			System.out.print("��÷��ȣ �Է�:");
			winwin = scn.nextLine().split(",");
			// 7�ڸ�Ȯ�θ޼ҵ�
			if (lengthCheck(winwin))
				continue;
			if (numArrayCheck(winwin))
				continue;
			break;
		}
		// �����ͺҷ�����
		gamesu(cnt, winwin);

	}

	// ----ó���� �ʿ��� �޼ҵ�----
	// ���Ӽ� ��ŭ �ڵ� �Է�...
	static void gamesu(int cnt, String[] str) {
		Loto[] l = new Loto[cnt];
		Random ran = new Random();
		for (int x = 0; x < cnt; x++) {
			int[] game = new int[6]; // 6��
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

	// ���ڿ� �ڸ��� 7������ �ƴ���
	static boolean lengthCheck(String[] str) {
		if (!(str.length == 7)) {
			System.out.println("����! ��ȣ�� 7�� �Է��Ͻÿ�");
			return true;
		} else return false;// ��
	}

	// ���ڿ��� ���� ��ȿ���˻�
	static boolean numCheck(String a) {
		for (int x = 0; x < a.length(); x++) {
			if (a.charAt(x) < '0' || a.charAt(x) > '9') {
				System.out.println("����! ���ڸ� �Է��Ͻÿ�");
				return true;
			}
		}
		return false; // ��
	}

	// ���ڿ��� �迭�ȿ� ���ڰ� �ִ���,�� ���ڰ� 1~45�� �������� �˻�
	static boolean numArrayCheck(String[] a) {
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length(); y++) {
				if (a[x].charAt(y) > '0' || a[x].charAt(y) < '9') {
					System.out.println("����! ���ڸ� �Է��Ͻÿ�");
					return true;
				}
			}
			if (Integer.parseInt(a[x]) > 45 || Integer.parseInt(a[x]) < 1) {
				System.out.println("����! 1���� 45 ������ ���ڸ� �Է��Ͻÿ�");
				return true;
			}
		}
		return false;// ��
	}

}