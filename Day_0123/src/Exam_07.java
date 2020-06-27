/*
 * 1~ 45 �ζ� ���� �����
 * �ߺ��� ���� 
 * ex 43 12 23 3 5 7 
 */
public class Exam_07 {
	int number[] = new int[6];// �迭���� �ζǹ� �����

	public Exam_07() {
		input(); // �ζǹ�ȣ���� �� �ߺ���������
		sort(); // �������� �� �������� ����
		output(); // �ζǹ�ȣ���
	}

	private void input() {
		for (int i = 0; i <= 5; i++) { // �ζǹ�ȣ����
			number[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j <= i - 1; j++) { // �ߺ���������
				if (number[i] == number[j]) {
					i--;
				}
			}
		}
	}

	private void sort() {
		int temp = 0;
		for (int i = 0; i <= 4; i++) {
			for (int j = i + 1; j <= 5; j++) {
				if (number[i] > number[j]) { // �������� �� �������� ����
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}

	private void output() {
		for (int i = 0; i <= 5; i++) {
			System.out.print(number[i] + " "); /// ���
		}
	}

	public static void main(String[] args) {
//new number();
	}
}
