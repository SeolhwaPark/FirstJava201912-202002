package MAIN;

import java.util.Scanner;

import VIEW.ShopUI;


public class Shopping {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		ShopUI ui = new ShopUI();
		boolean flag = false;
		
		//���θ޴�	
		while (true) {
			System.out.println("���θ� ȸ�� ���� ���α׷�    ");
			System.out.println("[1] ȸ������ ���");
			System.out.println("[2] ȸ��������Ȳ ��ȸ");
			System.out.println("[3] ȸ������ ����");
			System.out.println("[4] ȸ������ ����");
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
				ui.Update(sc);
				break;
			}
			case 4: {
				ui.Delete(sc);
				break;
			}
			}
		}
	}
}