package MAIN;

import java.util.Scanner;

import UI.StudentUI;


public class StudentMAIN {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentUI ui = new StudentUI();
		StudentMain2 main= new StudentMain2();
		boolean flag = false;

		while (true) {
			System.out.println("[����]");
			System.out.println("< �л��������� ���α׷� >");
			System.out.println("1.�л����� ����");
			System.out.println("2.�������� ����");
			System.out.println("3.���б� ����");
			System.out.println("4.���α׷� ����");
			System.out.print("����:");
			switch (sc.nextInt()) {
				case 1: {
					main.main2();
					break;
				}
				case 2: {
					main.main2();					
					break;
				}
				case 3: {
					main.main2();										
					break;
				}
				case 4: {
					main.main2();															
					break;
				}
			
			}
		}
	}

}
