package test01;
/******************************************************************
 * 조상
 * super
 * super() 조상클래스의 생성자 호출
 * 
 * 
 * 자기자신
 * this.
 * this() 내 클래스의 생성자 호출
 * 
 ******************************************************************
 */

class CC {
	int x = 10;

	void test() { // 조상 super
		System.out.println("x =" + x);
	}
}

class DD extends CC {
	int y = 100;

	void test() { // 오버라이딩 == 메소드를 다시 정의하는 것.
		// 상속관계에서 조상클래스와 메소드가 무조건 같아야함
		super.test();
		//System.out.print("x =" + x); // 단 조상과 내용물만 틀림
		System.out.print("y =" + y);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		CC c1 = new CC();
		c1.test();
		System.out.println("------------------");
		DD d1 = new DD();
		d1.test(); // 조상클래스가 숨어버림

	}

}
