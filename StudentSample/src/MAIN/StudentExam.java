package MAIN;

import java.util.Scanner;

import VIEW.UI;

public class StudentExam {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		MainStudent main2 = new MainStudent();
		boolean flag = false;
		
		while (true) {
			System.out.println("[���θ޴�] �л����� ����");
			System.out.println("1.�л� ����");
			System.out.println("2.���� ����");
			System.out.println("3.���б� ����");
			System.out.println("4.���α׷� ����");
			System.out.print("��ȣ�Է�:");
			switch (sc.nextInt()) {
			case 1: {
				main2.main();
				break;
			}
			case 2: {
				main2.main();
				break;
			}
			case 3: {
				main2.main();
				break;
			}
			case 4: {
				main2.main();
				break;
			}

			}

		}

	}
	
	
}