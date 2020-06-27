package customer;

import java.util.Scanner;
import customer.view.CustUI;
/*
고객관리 프로그램 Ver 1.0
[1] 고객 전체 목록
[2] 신규 고객 등록
[3] 고객 검색
[4] 고객 정보 수정
[5] 고객 정보 삭제
[6] 프로그램 종료
*/

public class CustMain {
	public static void main(String[] args) {
		CustUI ui = new CustUI();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("======================================");
		System.out.println("=       고객관리 프로그램 Ver 1.0         =");
		System.out.println("======================================");
		while (true) {
			System.out.println("[1] 고객 전체 목록");
			System.out.println("[2] 신규 고객 등록");
			System.out.println("[3] 고객 검색");
			System.out.println("[4] 고객 정보 수정");
			System.out.println("[5] 고객 정보 삭제");
			System.out.println("[6] 프로그램 종료");
			System.out.println("--------------------------------------");
			System.out.println("해당항목을 선택하세요?_");
			System.out.println("======================================");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				// 고객 전체목록 호출
				ui.custList();
				if (mainMenu(sc))
					flag = true;
				break;
			case 2:
				// 신규 고객 등록
				ui.custInsert(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 3:
				// 고객 검색
				ui.custSearch(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 4:
				// 고객 정보 수정
				ui.custUpdate(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 5:
				// 고객 정보 삭제
				ui.custDelete(sc);
				if (mainMenu(sc))
					flag = true;

				break;
			case 6:
				// 프로그램 종료
				if (ui.custExit(sc))
					flag = true;
				break;
			}
			if (flag)
				break;
		}

		System.out.println("프로그램 종료");
	}// main

	static boolean mainMenu(Scanner sc) {
		System.out.print("메인메뉴로 이동합니다(Enter) ?");
		sc.nextLine();
		String temp = sc.nextLine();
		if (temp.isEmpty())
			return false;
		else
			return true;
	}
}
