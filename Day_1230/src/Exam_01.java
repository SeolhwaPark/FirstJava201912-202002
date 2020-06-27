/* 프로그램의 흐름을 바꿀 때 쓰는 문장
 * (비교)조건문( if()둘 중 하나 선택, 
 * switch() ~ case 여러개 중 하나를 선택할 떼)
 * 프로그램은 언제나 위에서 아래로 흐름
 * 조건문의 결과는 언제나 참 아님 거짓
 * 
 * 조건 연산자 () ? : 
 * 
 * if(관계 상등 논리이 오는 식) { 
 * 		실행하고 싶은 문장이 두개 이상이면 반드시 대괄호{}넣어야함 ;
 *  }
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		if(c>80) {
			System.out.println("c = " + c);
		}
	}

}
