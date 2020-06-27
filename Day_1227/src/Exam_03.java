/* 연산순서
 * 단항 > 산술 > 관계,비교 > 상등> 논리
 * 
 * == : 동일한 값일 때
 * instanceof : 동일한 객체일 때
 * 
 * bit단위 논리연산자 &,^(xor 배타적인 or, or의 결과와는 반대임),| ->잘 안씀
 * 논리연산자 &&(and), ||(or) -> 연산속도가 빠르기 때문에 잘 씀
 * 
 * Shift연산자
 * << (왼쪽) 곱하기 = A*2의 n승  (2진수로 바꾼다음에 계산해야햄)
 * >> (오른쪽) 나누기 = A/2의 n승
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		int a = 7, b = 5, c;
		
		c = a/b; // 변수에는 .을 사용할 수 없음
		//정수값을 실수로 만들려면 타입연산자가 필요
		// c = (int)(a/(double)b);
		// 변수의 타입은 바꿀 수 없지만 상수는 타입을 바꿀 수 있음
		System.out.println("c = " + c);
		System.out.println("9/5 = " + 9/5.);
		
		c = a%b;
		System.out.println("c = " + c);
		
		System.out.println("5<<2 = " + (5<<2)); //2진수로 20이 나옴
		System.out.println("10>>2 = " + (10>>2));
		
	}

}
