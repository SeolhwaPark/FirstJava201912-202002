package School;

import java.util.Scanner;

//�Է��׸�� ����, ��ȣ üũ
public class StuExam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("�Է� :"); // 1,aaa,55,66,77
			// �⺻�׸� 5���� ���°��� �˻�
			String[] str = scn.nextLine().split(",");
			if (str.length != 5) {
				System.out.println("�Է¿���");
				continue; // ������ �ȳ������� while���ǽ����� �ٽ� ��
			}
			// ��ȣ ����üũ str[0]
			String bun = "";
			for (int x = 0; x < str[0].length(); x++) {
				char ch = str[0].trim().charAt(x);// ������ �����ϰ� �ѱ��ڸ� ����
				if (ch >= '0' && ch <= '9') { // 0�� 9���̿� �����Ѵٸ�
					bun += ch; // 0�� ""== �������� ó��
				} else {
					bun = "";
					break; // �ѱ��ڶ� Ʋ���� ��������
				}
			}
			if (bun.equals("")) { // ��ȣ�� �߸������� ��
				System.out.println("�Է¿���");
				continue; // ��
			}
			int b = Integer.parseInt(bun); // ���ڸ� ���ڷ� �ٲ���
			if (b > 10) { // 1~10�������� �ƴ���
				System.out.println("�Է¿���");
				continue; // ��
			}
			System.out.println("bun =" + bun);
			cnt++;
		}
		System.out.println("�Է�����");
	}

}
