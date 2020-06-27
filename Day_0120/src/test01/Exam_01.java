package test01;

/*객체지향은 실생활을 받영
 * 310p
 * 상속과 편법은 다름
 * 자바에서는 다중상속이 불가능
 * 
 * 클래스다이어그램
 * 
 * 클래스와 클래스의 사이 -> 상속받는다
 * 		+ public ->상속가능
 *		# protected ->상속가능
 *		defalt(접근제어가 없는 상태) ->상속가능
 *
 * 		- private -> 절대 상속안됨
 * 
 * 		<<>> 인터페이스와 클래스의 사이 -> 구현한다
 * 
 */

class AA {
	int a = 10, b = 20;
	private int c = 30;

	void print() {
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
	}
}

class BB extends AA { // 상속받는 법
	int d = 100;

	void test() {
		System.out.println("a =" + a + 100);
		System.out.println("b =" + b + 100);
		// System.out.println("c =" + c + 100);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.print();
		BB b1 = new BB();
		b1.print();
		b1.test();

	}

}
