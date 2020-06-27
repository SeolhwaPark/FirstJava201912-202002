import java.util.Scanner;
import java.util.regex.Pattern;

import VIEW.UI;

public class SawonMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		boolean flag = false;

		while (true) {
			System.out.println("====================================");
			System.out.println("=      사원&부서관리 프로그램 Ver 1.0    =");
			System.out.println("====================================");
			System.out.println("        [1] 사원 전체 목록");
			System.out.println("        [2] 신규 사원 등록");
			System.out.println("        [3] 사원 검색");
			System.out.println("        [4] 사원 정보 수정");
			System.out.println("        [5] 사원 정보 삭제");
			System.out.println("        [6] 프로그램 종료");
			System.out.println("-----------------------------------");
			System.out.println("해당항목을 선택하세요 ? _");
			System.out.println("====================================");
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