package MAIN;

import java.util.Scanner;

import VIEW.UI;

public class MainStudent {
	public void main() throws Exception {
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		boolean flag = false;

		while (true) {
			System.out.println("[[1]�л� ����]");
			System.out.println("  1.�л����� �Է�");
			System.out.println("  3.�л����� ��ü��ȸ");
			System.out.println("  4.�л����� �˻�");
			System.out.println("  5.�л����� ����");
			System.out.println("  6.�л����� ����");
			System.out.println("  7.����ȭ��");
			System.out.print("��ȣ�Է�:");
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
				ui.exit();
				break;
			}
			
			}

		}
	}

}
