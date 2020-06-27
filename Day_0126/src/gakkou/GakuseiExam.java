package gakkou;

import java.util.Scanner;


public class GakuseiExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Gakusei[] gaku = new Gakusei[100];
		int cnt = 0;

		System.out.println("********************* �л��������� ********************");
		System.out.println("�ʿ����� : ����(3�ڸ�) �а�(���� �濵 ����) �й�6���� (���� kj �濵 ky ���� eg)");
		System.out.println("�ֹι�ȣ(-�� ������ 8�ڸ�) ����(�������� �������� ��������)");

		String name = null; // ����
		String gakka = null; // �а�
		String gakuban = null; // �й�
		String jumin = null; // �ֹι�ȣ
		String danjo = null; // ����
		int tosi = 0; // ����
		int jum1 = 0; // ����
		int jum2 = 0; // ����
		int jum3 = 0; // ����
		double ave = 0; //���
		int rank = 0; // ����

		// �Է�, �����˻�
		while (cnt < 100) {
			System.out.print("�Է��ϼ��� :");
			String data = scn.nextLine();
			if (data.equalsIgnoreCase("end"))
				break;
			String[] arr = data.split(" ");

			// �̸�
			if (arr[0].length() > 3) {
				System.out.println("�̸� 3�����̻� ����");
				continue;
			}
			try {
				int rinji = Integer.parseInt(arr[0]);
				System.out.println("�Է� ����");
				continue;
			} catch (Exception e) {
				name = arr[0];
			}

			// �а�
			if (arr[1].equals("����") || arr[1].equals("�濵") || arr[1].equals("����"))
				gakka = arr[1];

			// �й�
			if (arr[2].length() != 6) {
				System.err.println("�й� 6�����̻� ����");
				continue;
			}
			if (arr[2].equals("kj"))
				gakka = "����";
			else if (arr[2].equals("ky"))
				gakka = "�濵";
			else if (arr[2].equals("eg")) 
				gakka = "����";
			else {
				System.out.println("�а��� ����");
				continue;
			}
			
			// �ֹι�ȣ
			if (arr[3].length() != 8) {
				System.out.println("�ֹι�ȣ ����. -�� �Է��Ͽ��°�");
				continue;
			}
			try {
				if ('1' == arr[3].charAt(7) || '3' == arr[3].charAt(7) || '5' == arr[3].charAt(7)
						|| '7' == arr[3].charAt(7))
					danjo = "����";
				else if ('2' == arr[3].charAt(7) || '4' == arr[3].charAt(7) || '6' == arr[3].charAt(7)
						|| '8' == arr[3].charAt(7))
					danjo = "����";
				else {
					System.out.println("���� �����ϴ�");
					continue;
				}
			} catch (Exception e) {
				danjo = arr[3];
			}

			int hizuke = Integer.parseInt(arr[3].substring(0, 2)); // ����
			if ('1' == arr[3].charAt(7) || '2' == arr[3].charAt(7) || '5' == arr[3].charAt(7)
					|| '6' == arr[3].charAt(7))
				tosi = 2020 - (1900 + hizuke) + 1; //
			else if ('3' == arr[3].charAt(7) || '4' == arr[3].charAt(7) || '7' == arr[3].charAt(7)
					|| '8' == arr[3].charAt(7))
				tosi = 2020 - (2000 + hizuke) + 1;
			else {
				System.out.println("�ֹι�ȣ �����ϴ�");
				continue;
			}

			// ����
			try {
				jum1 = Integer.parseInt(arr[4]);
				jum2 = Integer.parseInt(arr[5]);
				jum3 = Integer.parseInt(arr[6]);

			} catch (Exception e) {
				System.out.println("������ �� ������??");
				continue;
			}
			if (!(jum1 >= 0 && jum1 <= 100 && jum2>= 0 && jum2 <= 100
					&& jum3 >= 0 && jum3 <= 100)) {
				System.out.println("���� �����ϴ�");
			continue;
			}
			System.out.println(danjo);
			gaku[cnt] = new Gakusei(name,gakka,gakuban,danjo,tosi,jum1,jum2,jum3,ave,rank);
			cnt++;
			System.out.println("����Ϸ�OKKKKK");
		} // while...

		GakuseiData gak1 = new GakuseiData(gaku,cnt);
		gak1.seisekiPrint();

	}

}
