package Syain;

import java.util.Scanner;

public class SyainmeiboData {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Syainmeibo[] meibo = new Syainmeibo[50];
		int cnt = 0;

		String name = null; // namae
		String number = null; // juuminbangou
		String seibetu = null;
		int nenrei = 0;
		String juusyo = null; // kyojuuti
		String syozoku = null; // busyo
		String cell = null; // renrakusaki
		String erro = " Error : ";

		System.out.println("*****��������� �Է��ϼ���*****");
		System.out.println("�ʿ�����: ���� �ֹε�Ϲ�ȣ 8��°�ڸ�����(-����)");
		System.out.println("������(����,����,�뱸,�λ�) �Ҽ�(����,����) �޴�����ȣ ");

		while (cnt < 50) {
			System.out.print("�Է��ϼ��� :");
			String data = scn.nextLine();

			if (data.equalsIgnoreCase("end"))
				break;
			String[] arr = data.split(" ");

			if (arr[0].length() > 4) {
				System.out.println("4���̳��� �Է��Ͻÿ�.");
				erro = erro + " 4���ڿ���";

			}
			try {
				int rinjii = Integer.parseInt(arr[0]);
				System.out.println("�����Դϴ�.");
				erro = erro + " ���� ����������";
			} catch (Exception e) {
				name = arr[0];
			}

			if (arr[1].length() != 8) {
				erro = erro + " �ֹε�� 8���� �Է¾ȵ�";
			}

			if (arr[4].length() != 13) {
				erro = erro + " �ڵ��� 12���ڿ���";
			}

			try {
				int rinji = Integer.parseInt(arr[0]);
				erro = erro + " 2222���ڿ���";

			} catch (Exception e) {
				name = arr[0];
				System.out.println("����Ǿ����ϴ�.");
			}
			try {
				if ('1' == arr[1].charAt(7) || '3' == arr[1].charAt(7))
					seibetu = "����";
				else if ('2' == arr[1].charAt(7) || '4' == arr[1].charAt(7))
					seibetu = "����";
			} catch (Exception e) {
				erro = erro + " ������ ����";

			}
			try {
				System.out.println(arr[1]);
				int date = Integer.parseInt(arr[1].substring(0, 2)); // ����
				if ('1' == arr[1].charAt(7) || '2' == arr[1].charAt(7))
					nenrei = 2020 - (1900 + date) + 1; // ���̰��
				else if ('3' == arr[1].charAt(7) || '4' == arr[1].charAt(7))
					nenrei = 2020 - (2000 + date) + 1; // ���̰��
			} catch (Exception e) {
				erro = erro + " ���̰���� ����";
				System.out.println(e);
			}

			if (arr[2].equals("����") || arr[2].equals("����") || arr[2].equals("�λ�") || arr[2].equals("�뱸"))
				juusyo = arr[2];
			else {
				erro = erro + " ���ÿ���";
			}

			if (arr[3].equals("����"))
				syozoku = "����";
			else if (arr[3].equals("����"))
				syozoku = "����";
			if (erro.equals(" Error : "))
				System.out.println("���� ���� ����");
			else {
				System.out.println(erro);
				continue;
			}

			meibo[cnt] = new Syainmeibo(name, number, seibetu, nenrei, juusyo, syozoku, cell);
			cnt++;

		} // while

		for (int x = 0; x < cnt; x++) {
			meibo[x].syainPrint();
		}
	}

}
