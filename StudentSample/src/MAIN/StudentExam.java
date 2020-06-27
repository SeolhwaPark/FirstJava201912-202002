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
			System.out.println("[메인메뉴] 학생정보 관리");
			System.out.println("1.학생 관리");
			System.out.println("2.성적 관리");
			System.out.println("3.장학금 관리");
			System.out.println("4.프로그램 종료");
			System.out.print("번호입력:");
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