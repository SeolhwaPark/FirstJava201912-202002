/*
 * 메소드(함수)의 정의 및 호출
 * 입력해서 계산해서 출력
 * 입력매소드,정렬메소드,출력메소드
 * 
 * 메소드정의 심부름꾼 역할
 * 
 * 접근제어자 :메소드를 쓸 수 있는 권한 = public모두다, private제한, 암것도 안쓰면 동일한 공간
 * 리턴타입 : 계산작업
 * 메소드명(매개변수): 출력(리턴)
 * 
 * 	public접근제어 ,static void 리턴타입없음, 
 * main은 메소드(String[]자료형문자열의 배열 args변수)

메소드 안에 또 하나의 메소드는 들어갈 수 없음
 * 
 */
public class Exam_01 {
// 리턴타입 x, 매개변수 x = 자유롭게 해라~ 그런 느낌
	static void printA() {
		System.out.println("Method test"); //2
	}
	public static void main(String[] args) {
		System.out.println("Method call test"); //1
		printA();
		System.out.println("Method call test End"); //3


	}

}
