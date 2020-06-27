/*
 *메소드 호출 방식 
 *1. 값에 의한 호출
 *2. 참조에 의한 호출 
 * 
 * 
 */
public class Exam_06 {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("-------------------------");
		//a,b교환
		
		swap(a,b);
		
/*		int c = a;
		a=b;
		b=c;
*/
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
	//교환 메소드
	static void swap(int a, int b) { //값에 의한 호출 ,이 안에서만 바뀜
		int c = a;
		a = b;
		b = c;
	}
}
