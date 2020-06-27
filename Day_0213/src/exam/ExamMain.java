package exam;
import java.util.Scanner;

import view.UI;
/*
 * dno 기본키
 */
public class ExamMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1:목록(List)");
			System.out.println("2:등록(Insert)");
			System.out.println("3:검색(Search)");
			System.out.println("4:수정(Update)");
			System.out.println("5:삭제(Delete)");
			System.out.println("6:종료(Exit)");
			System.out.print("메뉴선택:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//전체목록 화면 메소드 호출
				ui.deptView();
				break;
			case 2:
				//정보삽입
				ui.deptInsert(sc);
				break;
			case 3:
				//부서번호를 입력시 해당 부서정보만 검색
				ui.deptSearch(sc);
				break;
			case 4:
				//부서번호, 부서명, 지역명 수정
				ui.deptUpdate(sc);
				break;
			case 5:
				//부서번호를 이용한 삭제
				ui.deptDelete(sc);
				break;
			case 6:
				//끝내기
			
				break;
			}
			
			
		}
		
		
	}//main
	
	

}
