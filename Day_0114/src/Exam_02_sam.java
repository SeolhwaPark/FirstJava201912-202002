
class Mouse3 { // 생성자가 없으면 디폴트생성자가 와야함

	int btnNo; // = 2 ;//버튼
	boolean cable; // = true; //선의 유false 무true
	String color; // = "검정"; //색상

	Mouse3() {
	}

	Mouse3(int btnNo, boolean cable, String color) {
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
	void buttonClick(int btnNo) {
		if(this.btnNo < 1) {
			System.out.println("오류");
			return;
		}
		
		if(btnNo == 1) {
			System.out.println("왼쪽버튼");
			return;
		}
		if(this.btnNo < 2 && btnNo == 2) {
			System.out.println("오른쪽버튼 오류");
			return;
		}
		if(this.btnNo > 1 && btnNo == 3) {
			System.out.println("오른쪽버튼");
			return;
		}
		if(this.btnNo <3  && btnNo == 3) {
			System.out.println("휠");
			return;
		}
		if(this.btnNo >2  && btnNo == 3) {
			System.out.println("휠");
			return;
		}
		if(this.btnNo >3) {
			System.out.println("오류");
			return;
		
		}	
	}
}

public class Exam_02_sam {
	public static void main(String[] args) {
		Mouse3 m1 = new Mouse3(1, true, "검정");
		m1.mousePrint();

		m1.buttonClick(5);

		
		
		
	}

}