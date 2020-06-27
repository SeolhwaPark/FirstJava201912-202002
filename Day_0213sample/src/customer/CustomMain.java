package customer;

import java.util.Scanner;

import customer.view.UI;

public class CustomMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UI ui = new UI();
		boolean flag =false;
		while(true) {
			System.out.println("====================================");
			System.out.println("=         ������ ���α׷�  Ver 1.0      =");
			System.out.println("====================================");
			System.out.println("        [1] �� ��ü ���");
			System.out.println("        [2] �ű� �� ���");
			System.out.println("        [3] �� �˻�");
			System.out.println("        [4] �� ���� ����");
			System.out.println("        [5] �� ���� ����");
			System.out.println("        [6] ���α׷� ����");
			System.out.println("-----------------------------------");
			System.out.println("�ش��׸��� �����ϼ��� ? _");
			System.out.println("====================================");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					ui.List();
					if(mainmenu()) flag = true;
					break;
				}
				case 2:{
					ui.NewCustom(sc);
					if(mainmenu()) flag = true;
					break;
					}
				case 3:{
					ui.SearchCustomer(sc);
					if(mainmenu()) flag = true;
					break;
					}
				
				case 4:{
					ui.UpdateCustomer(sc);
					if(mainmenu()) flag = true;
					break;
					}
				case 5:{
					ui.DeleteCustomer(sc);
					if(mainmenu()) flag = true;
					break;
					}
				case 6:{
					if(ui.exit(sc)) flag = true;
					break;
					}
			}
			if(flag) break;
		}
		System.out.println("���α׷� ����");
	}
	
	static boolean mainmenu() {
		System.out.print("���θ޴��� �̵��մϴ�(Enter) ?");
		sc.nextLine();
		String temp = sc.nextLine();
		if(temp.isEmpty()) return false;
		else return true;
	}
}
