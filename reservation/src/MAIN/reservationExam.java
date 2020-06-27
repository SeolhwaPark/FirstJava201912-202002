package MAIN;

import java.util.Scanner;

import VIEW.UI;

public class reservationExam {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		boolean flag = false;
		
		//메인메뉴	
		while (true) {
			System.out.println("  도서대출 관리 프로그램    ");
			System.out.println("[1] 도서 대출 예약 등록");
			System.out.println("[2] 도서 대출 현황 조회");
			System.out.println("[3] 도서 대출 예약 수정");
			System.out.println("[4] 도서 대출 반납 등록");
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
				ui.update(sc);
				break;
			}
			case 4: {
				ui.Return(sc);
				break;
			}
			}
		}
	}
}