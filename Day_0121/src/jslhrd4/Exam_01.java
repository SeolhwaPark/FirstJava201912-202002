package jslhrd4;

/*
 * 4대 중첩클래스
 * 
 * 1.중첩(내부)클래스 == inner 클래스 안에 클래스 .. 클래스를 관리하는 기능
 * 2.정적 중첩
 * 3.지역 중첩
 * 4.익명 중첩
 * 
 */

class Outer{
	private int x = 10;
	int y = 20;
	
	void disp() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}
	class Inner{ //
		int a = 100;
		
		void disp_in() {
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			System.out.println("a =" + a);
		}
	}
}

class AA{
	
}
public class Exam_01 {
	public static void main(String[] args) {
		//객체생성방법
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		Outer.Inner oi2 = new Outer().new Inner();
		ot.disp();
		oi.disp_in();
	}
}
