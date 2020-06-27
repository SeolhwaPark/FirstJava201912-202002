package test01;

/*
 * 
 */
class Super{
	int x = 100;
	
	void aa() {
		System.out.println("x =" + x);
	}
}

class Child extends Super{
	int y = 200;
	void aa() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}	
	void bb() {
		System.out.println("x =" + x);
	}
}

class ChildA extends Super{
	int y = 200;

}

public class Exam_06 {
	public static void main(String[] args) {
		Super s = new Super();
		s.aa();
		System.out.println("x =" + s.x);
		Child c = new Child();
		c.aa();
		c.bb();
		
//		System.out.println("x =" + c.x);
//		System.out.println("y =" + c.y);
		System.out.println("----------------------");

		Super ss = new Child(); // 참조변수로 Child를 가르킴. 물려준 것에 대한 접근권한만 있음
		System.out.println("x =" + ss.x);
//		System.out.println("y =" + ss.y);
		ss = new ChildA();
//		child CC = new Super(); // 자식이 조상의 객체를 가르킬 수는 없음
		
	}

}
