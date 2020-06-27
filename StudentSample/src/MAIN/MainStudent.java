package MAIN;

import java.util.Scanner;

import VIEW.UI;

public class MainStudent {
	public void main() throws Exception {
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		boolean flag = false;

		while (true) {
			System.out.println("[[1]학생 관리]");
			System.out.println("  1.학생정보 입력");
			System.out.println("  3.학생정보 전체조회");
			System.out.println("  4.학생정보 검색");
			System.out.println("  5.학생정보 수정");
			System.out.println("  6.학생정보 삭제");
			System.out.println("  7.메인화면");
			System.out.print("번호입력:");
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
				ui.exit();
				break;
			}
			
			}

		}
	}

}
