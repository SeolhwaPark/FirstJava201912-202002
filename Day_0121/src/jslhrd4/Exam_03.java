package jslhrd4;
/*
 * 지역 중첩
 * 메소드 안에서만 정의된 클래스
 */

class Outer3 {
	int x = 10;
	int y = 20;

	void disp() {
		class Inner3 {
			int a = 100;
			int b = 200;

			void disp_in() {
				System.out.println("x =" + x);
				System.out.println("y =" + y);
				System.out.println("a =" + a);
				System.out.println("b =" + b);
			}
		}

		Inner3 in3 = new Inner3();
		in3.disp_in(); // 지역중첩
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		ot.disp();
	}
}
