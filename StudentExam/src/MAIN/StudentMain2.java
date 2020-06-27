package MAIN;

import java.util.Scanner;

import UI.StudentUI;

public class StudentMain2 {
	public void main2() throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentUI ui = new StudentUI();
		boolean flag = false;

		while (true) {
			System.out.println("[1.학생정보 관리]");
			System.out.println("< 학생정보 관리 >");
			System.out.println("1.학생정보 입력");
			System.out.println("2.학생정보 조회(전체)");
			System.out.println("3.학생정보 검색");
			System.out.println("4.학생정보 수정");
			System.out.println("5.학생정보 삭제");
			System.out.println("6.첫 화면으로");
			System.out.print("선택:");
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
					ui.exit(sc);
					break;
				}
			}
		}
	}

}



