/*
 * 정수 1개 입력
 * 'A' ~ 'F' 판단하기
 * 
 * 처리시간 빠르게하는 방법
 */
public class Exam_07 {
	public static void main(String[] args) {
		int a = 75;
		
		if(a >= 90 && a <= 100) 
			System.out.println("A");
		else if (a >= 80)
			System.out.println("B");
		else if (a >= 70)
			System.out.println("C");
		else if (a >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
