package MAIN;

import java.util.Scanner;

import VIEW.UI;

public class reservationExam {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		boolean flag = false;
		
		//���θ޴�	
		while (true) {
			System.out.println("  �������� ���� ���α׷�    ");
			System.out.println("[1] ���� ���� ���� ���");
			System.out.println("[2] ���� ���� ��Ȳ ��ȸ");
			System.out.println("[3] ���� ���� ���� ����");
			System.out.println("[4] ���� ���� �ݳ� ���");
			System.out.println("�޴��� �����ϼ���(1 ~ 4) :");
			switch (sc.nextInt()) {
			case 1: {
				ui.Insert(sc);
				break;
			}
			case 2: {
				ui.Select();
				break;
			}
			case 3: {
				ui.update(sc);
				break;
			}
			case 4: {
				ui.Return(sc);
				break;
			}
			}
		}
	}
}