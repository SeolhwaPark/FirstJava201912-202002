package jslhrd4;

/*
 * 익명중첩
 * - 기존 클래스의 특정 메소드를 오버라이딩하여 사용하는 방식
 * 인터페이스처럼 씀.
 */

class Inner4{
	void aaa() {
		System.out.println("aaaaaa");
	}
	void bbb() {
		System.out.println("bbbbbb");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Inner4 in4 = new Inner4();
		in4.aaa();
		in4.bbb();
		
		System.out.println("--------익명중첩-------");
		
		Inner4 in = new Inner4() {
			void aaa() { //오버라이딩
				System.out.println("DDDDDD");
			} //이 안에서 하나 이상의 새로운 메소드를 생산할 수 없음
		};  //익명중첩객체생성
		in.aaa();
		in.bbb();
	}

}
