import java.io.BufferedReader;
import java.util.Scanner;

/*
 * Ű����� ���� �� �� �Է� �޾Ƽ� ���
 * ���Ӽ� : 5��
 * 1: 4 5 6 7 8 9 10 //��Ʈ�ؼ� ����
 * 2: 23 45 23 11 27 38//�̰͵�
 * . . . . .
 * 5: 6��
 * 
 * 
 * ó������
 * 1���Ӵ� �������� 100�� �� �߻��󵵰� ���� 6���� ���ڸ� �����ؼ� �Է�
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int game[][] = new int[5][6];
		System.out.print("�Է��ϼ��� :");
		int su = scn.nextInt();
		int cnt[] = new int[46];// �󵵼� �迭
		
		for (int k = 0; k < su; k++) {
			for (int x = 0; x < game.length; x++) {
				game[k][x] = (int) (Math.random() * 45 + 1);
				// �ߺ��oũ
				for (int y = 0; y < x; y++) {
					if (game[0][x] == game[0][y]) {
						x--;
						break;
					}
				}
			}
		}
		for (int x = 0; x < game.length; x++) {
			System.out.print((x + 1) + " :");
			for (int y = 0; y < game.length; y++) {
				System.out.print(game[x][y] + "\t");
			}
			System.out.println();
		}
		// �󵵼�
		// [1] �Է� : ���� : 0���� 45������ ���� ���´ٰ� ����
		int mode = 0; // �ֺ��� ��� �׸�
		int max = Integer.MIN_VALUE; // �ִ밪�� �����ϱ����� ���� ; �ʱⰪ�� �������� �ּҰ�����
		
		// [2] ó��
		for (int x = 0; x < cnt.length; x++) {
			game[su][x]++; //
		}
		
		for (int y = 0; y < game.length; y++) {
			if (max < game[y][mode]) {
				max = game[y][mode]; // MAX
				mode = y; // �ֺ� : MODE
			}
		}
		// [3] ���
		System.out.println("�ֺ� : " + mode + " , " + max);
	}
	
}
