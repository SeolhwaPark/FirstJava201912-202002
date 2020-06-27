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
			System.out.println("[메인]");
			System.out.println("< 학생정보관리 프로그램 >");
			System.out.println("1.학생정보 관리");
			System.out.println("2.성적정보 관리");
			System.out.println("3.장학금 관리");
			System.out.println("4.프로그램 종료");
			System.out.print("선택:");
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
