
class Mouse2 { // 생성자가 없으면 디폴트생성자가 와야함

	int btnNo; // = 2 ;//버튼
	boolean cable; // = true; //선의 유false 무true
	String color; // = "검정"; //색상

	Mouse2() {
	}

	Mouse2(int btnNo, boolean cable, String color) {
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
	}

	void mousePrint() {
		System.out.print("버튼수 :" + btnNo + "\t");
		System.out.print("선의 유무 :" + cable + "\t");
		System.out.print("색상 :" + color + "\n");

	}

	// 만약에 버튼을 클릭했을 때의 메소드를 구현
	// 버튼 2개일 때 (1 - 왼쪽, 2 - 오른쪽)
	// 버튼 3개일 경우 (1 - 왼쪽, 2 - 오른쪽,3 - 휠)
	void buttonClick(int btn) {
		if (btnNo == 2) {// 버튼이 2개일 때
			if (btn == 1) {
				System.out.println("왼쪽이 클릭되었습니다.");// 1은 왼쪽
			} else if (btn == 2) {
				System.out.println("오른쪽이 클릭되었습니다.");// 2는 오른쪽
			} else {
				System.out.println("오류입니다.");
			}
		}
		if (btnNo == 3) {
			if (btn == 1) {
				System.out.println("왼쪽이 클릭되었습니다.");// 1은 왼쪽

			} else if (btn == 2) {
				System.out.println("오른쪽이 클릭되었습니다.");// 2는 오른쪽

			} else if (btn == 3) {
				System.out.println("휠이 사용되었습니다..");

			} else {
				System.out.println("오류입니다.");

			}
		}else {
			System.out.println("멍텅구리마우스입니다.");

		}	
	
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Mouse2 m1 = new Mouse2(1, true, "검정");
		m1.mousePrint();

		m1.buttonClick(5);

		
		
		
	}

}