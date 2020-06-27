package customer;

import java.util.Scanner;
import customer.view.CustUI;
/*
������ ���α׷� Ver 1.0
[1] �� ��ü ���
[2] �ű� �� ���
[3] �� �˻�
[4] �� ���� ����
[5] �� ���� ����
[6] ���α׷� ����
*/

public class CustMain {
	public static void main(String[] args) {
		CustUI ui = new CustUI();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("======================================");
		System.out.println("=       ������ ���α׷� Ver 1.0         =");
		System.out.println("======================================");
		while (true) {
			System.out.println("[1] �� ��ü ���");
			System.out.println("[2] �ű� �� ���");
			System.out.println("[3] �� �˻�");
			System.out.println("[4] �� ���� ����");
			System.out.println("[5] �� ���� ����");
			System.out.println("[6] ���α׷� ����");
			System.out.println("--------------------------------------");
			System.out.println("�ش��׸��� �����ϼ���?_");
			System.out.println("======================================");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				// �� ��ü��� ȣ��
				ui.custList();
				if (mainMenu(sc))
					flag = true;
				break;
			case 2:
				// �ű� �� ���
				ui.custInsert(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 3:
				// �� �˻�
				ui.custSearch(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 4:
				// �� ���� ����
				ui.custUpdate(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 5:
				// �� ���� ����
				ui.custDelete(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 6:
				// ���α׷� ����
				if (ui.custExit(sc))
					flag = true;
				break;
			}
			if (flag)
				break;
		}

		System.out.println("���α׷� ����");
	}// main

	static boolean mainMenu(Scanner sc) {
		System.out.print("���θ޴��� �̵��մϴ�(Enter) ?");
		sc.nextLine();
		String temp = sc.nextLine();
		if (temp.isEmpty())
			return false;
		else
			return true;
	}
}
