package MAIN;

import java.util.Scanner;

import UI.JoinUI;

public class JoinMain {
	public static void main(String[] ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		JoinUI ui = new JoinUI();
		
		while (true) {
			System.out.println("[ ���� ]");
			System.out.println("=== ȸ������ ���α׷� Ver 1.03 ====");
			System.out.println("        [1] ȸ�� ��� ����");
			System.out.println("        [2] ȸ�� ���� ���");
			System.out.println("        [3] �α���");
			System.out.println("        [4] ȸ�� ���� �˻�");
			System.out.println("        [5] ȸ�� ���� ����");
			System.out.println("        [6] ȸ�� ���� ����");
			System.out.println("        [7] ���α׷� ����");
			System.out.print("[�޴� ���� :");
			switch (sc.nextInt()) {
			case 1: {
				ui.select();
				break;
			}
			case 2: {
				ui.insert(sc);
				break;
			}
			case 3: {
				ui.login(sc);
				break;
			}
			case 4: {
				ui.search(sc);
				break;
			}
			case 5: {
				ui.update(sc);
				break;
			}
			case 6: {
				ui.delete(sc);
				break;
			}
			case 7: {
				ui.exit(sc);
				break;
			}
			}
		}
	}
}
