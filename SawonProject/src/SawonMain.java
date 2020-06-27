import java.util.Scanner;
import java.util.regex.Pattern;

import VIEW.UI;

public class SawonMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		boolean flag = false;

		while (true) {
			System.out.println("====================================");
			System.out.println("=      ���&�μ����� ���α׷� Ver 1.0    =");
			System.out.println("====================================");
			System.out.println("        [1] ��� ��ü ���");
			System.out.println("        [2] �ű� ��� ���");
			System.out.println("        [3] ��� �˻�");
			System.out.println("        [4] ��� ���� ����");
			System.out.println("        [5] ��� ���� ����");
			System.out.println("        [6] ���α׷� ����");
			System.out.println("-----------------------------------");
			System.out.println("�ش��׸��� �����ϼ��� ? _");
			System.out.println("====================================");
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