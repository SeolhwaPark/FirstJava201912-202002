/*
 * 변수의 종류
 * 1.정적 변수(static) - 클래스변수
 * 2.멤버 (인스턴스)
 * 3.지역변수(매개변수)
 * 
 * JVM 가상머신
 * 메소드영역(BB), 힙영역(BB ), 스택영역(B)
메소드에는 메인,클래스, 힙은 객체를 저장,변수는 스택에 저장해서 메소드에 저장된걸 공유함
 */

class BB{
	int a = 10; //인스턴스변수
	static int b = 20; // 클래스변수
	
}
public class Exam_04 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		b1.b = 100;
		System.out.println("b1.a =" + b1.a);
		System.out.println("b1.b =" + b1.b);
		System.out.println("b2.a =" + b2.a);
		System.out.println("b2.b =" + b2.b);
		b1.a++;
	}
}
