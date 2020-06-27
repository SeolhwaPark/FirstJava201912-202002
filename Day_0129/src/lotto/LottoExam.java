package lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

/*
 * ��¿���
 * ���Ӽ� �Է�:2//�󸶵��� �Է°���..
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
 * ��÷��ȣ : 10,19,22,28,34,40 - ���ʽ� 7 <-�Է��ؾ���
 * 1 : 7,10,17,23,35,40 - ��
 * 2 :10,19,22,30,32,38 -5��
 */

public class LottoExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String[] win; // ��÷��ȣ �Է¹޴� ��Ʈ�� �迭
		
		while (true) { // ����Ƚ���� �Է¹޴� �ݺ���
			System.out.print("�����Է� :");
			String game = scn.nextLine(); // ���� Ƚ�� �Է� (String���� �޴� ������ ��ȿ�� �˻縦 �ϱ� ����. numCheck �޼ҵ�)
			if (numCheck(game)) { // �������� �Ǵ��ϴ� �޼ҵ� ���� �Ʒ��� �޼ҵ� ���� �س��� , ���ڰ��ƴ� ���ڿ��� ������ true�� if�� �����
				System.out.println("���ڸ� �Է����ּ���"); // ���ڰ� �ƴ� ���ڿ��� �������Ƿ� ���޼��� ���
				continue; // �ݺ����� ó������ ���ư�
			}
			cnt = Integer.parseInt(game); // game Ƚ���� ���ڿ��̹Ƿ� ���������� �ٲ㼭 cnt�� �־���
			break;
		}

		while (true) {
			System.out.print("��÷��ȣ �Է�:");
			win = scn.nextLine().split(","); // ��÷��ȣ�� ���ڿ��� �޾Ƽ�, split �޼ҵ带 �̿��Ͽ� ���� �迭�� �и�����
			if (lengthCheck(win)) // ���ڿ��迭�� ���̰� 7���� Ȯ���ϴ� �޼ҵ� �Ʒ��ʿ� �����س���
				continue; // ���ڿ��� ���̰� 7�� �ƴϸ� �ݺ��� ó������ ���ư��� ��÷��ȣ�� �ٽ� �Է¹���
			if (numArrayCheck(win)) // ������ ���ڿ��迭�� ���ڰ� 1~45������ �������� Ȯ���ϴ� �޼ҵ�
				continue; // 1~45�� ���ڰ� �ƴ϶�� ��÷��ȣ�� �ٽ� �Է¹���
			break; // ��÷��ȣ�� ����� �Էµ��� �� �ݺ����� ��������
		}
		gamesu(cnt, win); // �ϴܺ� gamesu �޼ҵ带 ȣ�� ���ڿ��迭��, cnt(���Ӽ�)�� �Ű������� �Ѱ���
	}

//-----------------------------------------------------------------------------
	static void gamesu(int cnt, String[] str) {
		Lotto lt[] = new Lotto[cnt]; // Lotto Ŭ�����迭 ���� cnt�� ���Ӽ���, Ŭ�����迭�� ���Ӽ���ŭ ��������.
		Random r = new Random(); // �ζǹ�ȣ�� �������� �����ϱ� ���� Random Ŭ������ ����
		for (int j = 0; j < cnt; j++) {
			int game[] = new int[6]; // ���ο� �迭�� ����
			for (int i = 0; i < game.length; i++) {
				game[i] = r.nextInt(45) + 1; // �迭�� �ζǹ�ȣ 6���� ���ʴ�� �Է��ϴ� for��
				for (int k = 0; k < i; k++) {
					if (game[i] == game[k]) { // �ζǹ�ȣ �ߺ� �˻� , �ߺ��� ��ȣ�� ���� �� ���Է¹���.
						i--;
						break;
					}
				}
			}
			Lotto l = new Lotto(game); // ���ο� �ζ�Ŭ������ ����
			lt[j] = l; // ���Ӱ� ������ �ζ� Ŭ������ lt[] Ŭ�����迭�� ���ʴ�� ��������
		}
		LottoData ld = new LottoData(lt, cnt, str); // LottoData Ŭ������ �ζ�Ŭ�����迭��, ���Ӽ� , ��÷��ȣ�� �Ѱ���
		ld.lottoPrint(); // �ζǵ����� Ŭ������ �ζ�����Ʈ �޼ҵ带 ȣ���Ͽ�, �ζǹ�ȣ �� ��÷���θ� �����
	}

	
	
	static boolean lengthCheck(String str[]) { // �ζ� ��÷��ȣ�� ������ 7�������� Ȯ���ϴ� �޼ҵ�, 7���� �´°�� false�� �����Ѵ�
		if (!(str.length == 7)) {
			System.out.println("��ȣ�� 7�� �Է����ּ���.");
			return true;
		} else
			return false;
	}

	
	
	static boolean numCheck(String a) { // ���ڿ��� ������ ���ڸ� ���Դ��� Ȯ���ϴ� �޼ҵ�, ���ڸ� ������ ��� false�� �����Ѵ�
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return true;
			}
		}
		return false;
	}

	
	
	static boolean numArrayCheck(String[] a) { // ���ڿ� �迭�� �Ű������� �޾� ���ڿ� �迭���� ���� ���ڸ� ����ִ��� Ȯ�� �� 1���� 45���������� Ȯ���ϴ� �޼ҵ�
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) { // ���ڸ� ����ִ��� Ȯ���ϴ� �޼ҵ�
				if (a[i].charAt(j) < '0' || a[i].charAt(j) > '9') {
					System.out.println("���ڸ� �Է����ּ���.");
					return true; // ���ڸ� ������� ������ true�� ����
				}
			}
			if (Integer.parseInt(a[i]) > 45 || Integer.parseInt(a[i]) < 1) { // ������ ������ 1~45������ Ȯ���ϴ� �޼ҵ�
				System.out.println("1~45�̳��� ������ �����մϴ�."); 
				return true; // 1~45�̿��� ������ ��� true�� ����
			}
		}
		return false; // 1~45�����̰�, ���ڸ� ����ִٸ� false�� ����
	}
}
