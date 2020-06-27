package renraku;

import java.util.Scanner;

public class Renraku {
	public static void main(String[] args) {
		// �Է�

		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String name; // �̸�
		String sex; // ����
		String bu; // �μ�
		String kuni; // ����

		System.out.println("************�Է�����************");
		System.out.println("����(4�ڸ�����),�ֹι�ȣ8�ڸ�(-������)");
		System.out.println("����(�ι�/�ڿ�),��ȭ��ȣ(+���� �ʼ�)");
		RenrakuData[] re = new RenrakuData[10];
		
		while (cnt < 10) {
			System.out.print("*�Է��ϼ� :");
			String input = scn.nextLine();// ���پ� �Է�
			if (input.equalsIgnoreCase("end"))
				break;// �ҹ��� �빮�� ��� ���� end�ޱ�
			String[] arr = input.split(",");// �Է¹��� �� ,�� ��� �迭�ǵ��

			// �̸� ���ڼ� üũ
			if (arr[0].length() > 4) {
				System.out.println("�̸��� 4�� ���ϰ� �ƴ�. �������!!!!!");
				continue;
			}

			// �ֹι�ȣ �ڸ��� üũ
			if (arr[1].length() != 8) {
				System.out.println("�ֹι�ȣ8�ڸ��� �ƴ�. �� �̵��� �������!!!!!");
				continue;
			}

			// �̸��� ���� �ȵ��ֳ� üũ�� ����
			try {
				int imsi = Integer.parseInt(arr[0]);
				System.out.println("�̸��� �̻���.�������!!!!!");
				continue;

			} catch (Exception e) {
				name = arr[0];
				System.out.println("ok��������^^");
			}

			// ����üũ
			if ('1' == arr[1].charAt(7))
				sex = "����";
			else if ('2' == arr[1].charAt(7))
				sex = "����";

			else {
				System.out.println("���� ������.�������!!!!!");
				continue;
			}

			// ������ ���� �μ�����
			if (arr[2].equals("�ι�"))
				bu = "�ѹ�";
			else if (arr[2].equals("�ڿ�"))
				bu = "�λ�";
			else {
				System.out.println("�׷� �μ�����.�������!!!!!");
				continue;
			}

			// �������� �����Ǻ�
			if ('2' == arr[3].charAt(2))
				kuni = "�ѱ���";
			else if ('1' == arr[3].charAt(2))
				kuni = "�Ϻ���";
			else {
				System.out.println("���� ������.�������!!!!!");
				continue;
			}

			re[cnt] = new RenrakuData(name, sex, bu, kuni);
			cnt++;
		}
		for (int x = 0; x < cnt; x++) {
			if (re[x].kuni.equals("�Ϻ���"))
				re[x].renrakuPrint();
		}
	}
}