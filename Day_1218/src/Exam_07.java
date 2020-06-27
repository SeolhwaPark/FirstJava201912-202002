/*
 * 비트연산자는 2진수연산방식을 쓰긔
 * 이동연산자<<,>> ,&(and), |(or), ^(xor), ~(보수,not의 단항연산자)
 * 암호화할 때 잘 씀(보안업체가튼 사람들,해커들) 
 * 
 * 1 True 0 False
 */
public class Exam_07 {
	public static void main(String[] args) {
		// 2진수연산방식 10<<2, 10>>2, 10&4, 10|5, 10^5, ~10
		// byte1 ,char2 ,int4 -> 1byte=8bit (2진수=bit : 1,0)
		System.out.println("1<<1 =" +(1<<1)); //2*1
		System.out.println("1<<2 =" +(1<<2)); //2*2
		System.out.println("1<<3 =" +(1<<3)); //2*3
		System.out.println("1<<4 =" +(1<<4)); //2*4
		System.out.println("1<<5 =" +(1<<5)); //2*5
		
		System.out.println("10<<2 =" +(10<<2));
		System.out.println("10>>2 =" +(10>>2));

	}

}
