package jslhrd4;
/*
 * 정적 중첩클래스
 * 반드시 static멤버만 포함
 */

class Outer2{
	static int x = 100;
	static int y = 200;
	
	void disp() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}
	
	static class Inner2{ //정적 중첩
		int a = 100;
		static int b = 100; // 객체를 생성하지 않아도 static멤버는 접근 가능
		void disp_in() {
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			System.out.println("a =" + a);
		}
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Outer2  ot = new Outer2();
		Outer2.Inner2 oi = new Outer2.Inner2(); //정적 중첩 객체생성 방법
		oi.disp_in();
		System.out.println("x = " + Outer2.y);
		System.out.println("b = " + Outer2.Inner2.b);
	}

}
