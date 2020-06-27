/*
 * 삼항연산자의 기본 (또는 조건연산자라고 불리긔)
 * 자주 써먹음
 * 
 * 누적대입형 연산자. 연산순위는 가장 낮음
 * A += 2; (a=a+2) 
 * B -= 3; (b=b-3)
 * C *= 4; (c=c*4)
 */
public class Exam_04 {
	public static void main(String[] args) {
		//(조건식) ? 참 : 거짓 ;
		//int a = (10>5) ? 10: 5; // 참이면 10을 대입, 거짓이면 5를 대입
		//System.out.println("10>5 = " + a);
		//int a = 70 , b = 80;
		int a = 7 , b = 8;
		int max = (a>b) ? a : b ;
		int min = (a>b) ? b : a ;
		
		System.out.println("큰 값 : " + max);
		System.out.println("작은 값 : " + min);
	}

}
