package MAIN;

import java.util.Scanner;

import UI.JoinUI;

public class JoinMain {
	public static void main(String[] ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		JoinUI ui = new JoinUI();
		
		while (true) {
			System.out.println("[ 메인 ]");
			System.out.println("=== 회원관리 프로그램 Ver 1.03 ====");
			System.out.println("        [1] 회원 목록 보기");
			System.out.println("        [2] 회원 정보 등록");
			System.out.println("        [3] 로그인");
			System.out.println("        [4] 회원 정보 검색");
			System.out.println("        [5] 회원 정보 수정");
			System.out.println("        [6] 회원 정보 삭제");
			System.out.println("        [7] 프로그램 종료");
			System.out.print("[메뉴 선택 :");
			switch (sc.nextInt()) {
			case 1: {
				ui.select();
				break;
			}
			case 2: {
				ui.insert(sc);
				break;
			}
			case 3: {
				ui.login(sc);
				break;
			}
			case 4: {
				ui.search(sc);
				break;
			}
			case 5: {
				ui.update(sc);
				break;
			}
			case 6: {
				ui.delete(sc);
				break;
			}
			case 7: {
				ui.exit(sc);
				break;
			}
			}
		}
	}
}
