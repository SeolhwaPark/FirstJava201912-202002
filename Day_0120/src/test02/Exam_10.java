package test02;
/*
 * 추상클래스 - 미완성된 설계도(실체가 존재하지 않음) -> 객체를 생성할 수 없다
 * 
 * abstract 키워드 사용
 */

abstract class AA { //추상클래스

	int x = 100;

	void test() {
		System.out.println("x =" + x);
	}

	abstract int sum(int x, int y);// 몸통없는 추상메소드.. 주로 공통된 기능.강제 상속됨
	// 쓰려면 무조건 오버라이딩을 해야 객체생성이 가능함. 하나의 추상메소드가 존재하면 그 클래스는 추상메소드가 됨

}

class BB extends AA { // 오버라이딩.
	int sum(int x, int y) {
		return 0;
	}

}

public class Exam_10 {
	public static void main(String[] args) {
		//AA a = new AA();
		AA  a = new BB();
		a.sum(1, 500);
		
		
	}

}
