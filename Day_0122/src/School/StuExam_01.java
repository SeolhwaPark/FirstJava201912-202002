package School;

import java.util.Scanner;
//�Է��׸���� ī��Ʈ
public class StuExam_01 {
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
			cnt++;
		}
		System.out.println("�Է�����");
	}

}
