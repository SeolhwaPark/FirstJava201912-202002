/*
 * sort 
 * ���� : ū ���� ã�� , �ں��� ���ĵǼ� ���� �ٲ�
 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[] bun = {5,3,1,4,2};
		int[] score = {50,70,60,90,80};
		// ���
		// 1 2 3 4 5
		// 60 80 70 90 50
		System.out.print("���� �� ��ȣ : "); // ��ȣ ����
		for (int x = 0; x < bun.length; x++) {
			System.out.print(bun[x] + "\t");
		}
		System.out.println();

		System.out.print("���� �� ���� : "); // ���� ����
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();

		for (int x = 0; x < bun.length - 1; x++) {// ����
			for (int y = x + 1; y < bun.length; y++) {// ���ؼ�
				if (bun[x] > bun[y]) { // �������������� ����
					int temp = bun[x]; // �־�� ��
					int tempp = score[x]; //
					
					bun[x] = bun[y];// �����ͱ�ȯ���
					bun[y] = temp;
					
					score[x] = score[y];
					score[y] = tempp;
				}
			}

		}
		System.out.print("��ȣ : "); // ��ȣ ����
		for (int x = 0; x < bun.length; x++) {
			System.out.print(bun[x] + "  ");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.print("����  : "); // ���� ����
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
	}
}