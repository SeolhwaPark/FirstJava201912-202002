package test02;

/* 인터페이스(interface) 명세서 , 다중상속의 개념...인터페이스안에 있는 모든 메소드가 100%의 추상화
 * 상수, 추상메소드만 있음. 기능만 들어있는 개념
 * 	개발코드  인터페이스  객체
 * 
 */
interface Car{ // 인터페이스 안에 있으면 자동적으로 추상화됨
	static final int MAX = 100;
	void test(); // 추상메소드
	int sum(int x, int b);
	//void aa() { 이렇게 정의할 수 없음
		
	//}
}

//interface Truck extends Car{ // 인터페이스는 클래스를 만들 수 업슴
//	void aa(); // 추상메소드


//인터페이스의 구현
class Truck implements Car{
	@Override
	public int sum(int x, int b) {
		return 0;
	}
	@Override
	public void test() {
		
	}
}

public class Exam_12 {
	public static void main(String[] args) {
		
		
		
		
	}

}
