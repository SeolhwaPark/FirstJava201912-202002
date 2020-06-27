package MAIN;

import java.util.Scanner;

import VIEW.ShopUI;


public class Shopping {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		ShopUI ui = new ShopUI();
		boolean flag = false;
		
		//메인메뉴	
		while (true) {
			System.out.println("쇼핑몰 회원 관리 프로그램    ");
			System.out.println("[1] 회원정보 등록");
			System.out.println("[2] 회원정보현황 조회");
			System.out.println("[3] 회원정보 수정");
			System.out.println("[4] 회원정보 삭제");
			System.out.println("메뉴를 선택하세요(1 ~ 4) :");
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