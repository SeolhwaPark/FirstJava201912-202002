/*
 * 수학 함수
 * Math 클래스 - 모든 메소드 static 메소드
 */
public class Exam_05 {
	public static void main(String[] args) {
		double b = 3.14567;
		/*
		 *3
		 *315
		 *3.15
		 *1.4142135623730951
		 *8.0
		 */
		System.out.println(Math.round(b));
		System.out.println(Math.round(b*100));
		System.out.println(Math.round(b*100)/100.);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(2,3));
		
	}

}
