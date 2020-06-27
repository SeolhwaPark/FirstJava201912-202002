/*
 * 논리연산자
 *  순위 : 단항연산자 !(not), &&(and)양쪽이 참일 때만 참, ||(or)한쪽만 참이라도 참
 *  
 */
public class Exam_06 {
	public static void main(String[] args) {
		System.out.println("5>4&&7<8 =" + (5>4&&7<8));
		System.out.println("5>4&&7<8 =" + (4>4&&7<8));
		System.out.println("5>4="+(5>4));
		System.out.println("5>4="+!(5>4));
		boolean flag=false; // 논리형 참인가 거짓인가
		System.out.println("flag="+!flag);
		
		int a=100;
		System.out.println("a =" + a);
		//System.out.println("a =" + a);
		
		int sw=0;
		System.out.println("sw =" + !(sw==0));
	}

}
