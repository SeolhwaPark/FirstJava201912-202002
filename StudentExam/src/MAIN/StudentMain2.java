package MAIN;

import java.util.Scanner;

import UI.StudentUI;

public class StudentMain2 {
	public void main2() throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentUI ui = new StudentUI();
		boolean flag = false;

		while (true) {
			System.out.println("[1.�л����� ����]");
			System.out.println("< �л����� ���� >");
			System.out.println("1.�л����� �Է�");
			System.out.println("2.�л����� ��ȸ(��ü)");
			System.out.println("3.�л����� �˻�");
			System.out.println("4.�л����� ����");
			System.out.println("5.�л����� ����");
			System.out.println("6.ù ȭ������");
			System.out.print("����:");
			switch (sc.nextInt()) {
				case 1: {
					ui.insert(sc);
					break;
				}
				case 2: {
					ui.select();
					break;
				}
				case 3: {
					ui.search(sc);
					break;
				}
				case 4: {
					ui.update(sc);
					break;
				}
				case 5: {
					ui.delete(sc);
					break;
				}
				case 6: {
					ui.exit(sc);
					break;
				}
			}
		}
	}

}



