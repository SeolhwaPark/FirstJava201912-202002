import java.util.Scanner;

/*
 * Ű����� �����ܾ �Է�
 * �������� �󵵼��� ���(��ҹ��� ���� ����)
 * 
 * �Է¿���
 * �ܾ� : Apple
 * �ܾ� : Seoul
 * . . . . 
 * 
 * �ܾ� : end (�Ǵ� END) --> ����
 * 
 * ��¿���
 * A B C D . . . Z �迭 26
 * 0 2 1 0 . . . 1
 *  
 */
class AlphaTest {
	int[] alpha = new int[26];

	public void alphaFre(String str) { // ���ĺ� �󵵼�
		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x); // 1���ھ� ������ ��ȯ�ؼ� �и�
			System.out.print((int) ch);// 1���ڸ� ������ ��ȯ
			alpha[ch - 65]++; // �󵵼� ���
		}
	}

	public void alphaPrint() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for (int x = 0; x < alpha.length; x++) {
			System.out.print(alpha[x] + " ");
		}
	}
}

public class Exam_01_1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		AlphaTest alpha = new AlphaTest();
		char[] alpha1 = new char[26];
		for (int x = 0; x < alpha1.length; x++) {
			alpha1[x] = (char) (x + 65);
		}

		while (true) {
			for (int x = 0; x < alpha1.length; x++) {
				System.out.print("�ܾ� :");
				String word = scn.next().toUpperCase();
				if (alpha1[x] != word.charAt(0)) {
					System.out.println("�����Դϴ�.");
					break;
				}

				else {
					if (word.equals("END"))
						break;

					alpha.alphaFre(word); // �ѱ�� ��
				}
			}
			break;

		}
		alpha.alphaPrint();
	}

}
