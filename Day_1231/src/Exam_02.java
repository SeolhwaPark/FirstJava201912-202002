/*
 * 제어문
 * switch ~ case 버전
 * 90이상 , 80이상 , 70이상 , 60이상 , 60미만
 * = 100~90, 89~80, 79~70, 69~60, 59~0
 * switch (key) {
		case value:
			
			break;

		default:
			break;
		}
 */

public class Exam_02 {
	public static void main(String[] args) {
		int var = 30;
		String str = ""; // String str = null ; 0의 값을 준거(암것두없음)
		switch (var/10) { // 90이상 100이하 
		//switch (수식(결과가 정수가 나올수 있는 식)
		//또는 변수(정수int,문자char,문자열string)만 들어옴,딴건 절대 안대
		case 10:	//value: ==값(정수,문자,문자열) case 오로지 같을 때!!
		case 9:
			//str = "A";
			System.out.println("A");
			break; //더이상 작업이 필요없다는 의미
		case 8: //여러개 쓸 수 있음
			//str = "B";
			System.out.println("B");
			break;
		case 7:
			//str = "C";
			System.out.println("C");
			break;
		case 6:
			//str = "D";
			System.out.println("D");
			break;
		//case 60:
			//str = "E";
			//System.out.println("E");
			//break;
		default: // Else와 같은 존재임
			//str = "F";
			System.out.println("F");
			break;
			
		}
		System.out.print(str);
		
	}

}
