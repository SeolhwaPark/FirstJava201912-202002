/*
 * 연산자
 *  산술연산자 -> 관계연산자 -> 상등연산자 -> 
 *  논리연산자 -> 조건연산자 -> 대입연산자(=)
 *  
 *  1) 산술연산자(()->단항연산자(양수+,음수-,증가++,감소--,도트연산.)
 *      ->연산순위: 곱하기*,나눗셈의 몫/,나눗셈의 나머지%
 *        (정수와 정수의 연산은 정수,실수와 의 연산은 실수) -> +,-)
 *  
 */
public class Exam_01 {
	public static void main(String[] ar) {
		int a=7;
		int b=5;
		int c= a/b;
		int d= a%b;
		System.out.println("C="+c);
		System.out.println("d="+d);
	}

}
