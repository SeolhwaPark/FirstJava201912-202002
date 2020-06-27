/*자바의 정석 p.91 연산자
 * 
 * 보수연산자 : ~ (컴퓨터는 2의 보수)
 * 00000111 -> 11111010 +1 = 11111011(-5)
 * 보수연산자는 2의 보수를 쓰니까 앞에 마이너스 붙이고 +1해줌 = 5 -> -6
 * 
 * ! true -> not(거짓)
 * boolean sw = false -> !sw = true
 * int a = (int)3.14
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a = " + a++); // 6
		System.out.println("a = " + a--); // 5
		System.out.println("a = " + -a); // -5 
		System.out.println("a = " + ~a); // -6 
		System.out.println("a = " + (float)a); // 5.0 실수
		System.out.println("a = " + (a>3)); // true
		System.out.println("a = " + !(a>3)); // false
	}

}
