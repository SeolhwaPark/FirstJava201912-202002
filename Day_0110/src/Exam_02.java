/*
 * 1~10 합계 출력
 * 출력 : 1~10 =55
 * 
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		sum(); //실제 호출해서 출력할 부분
	}
	static void sum() {
		int sum = 0;
		for(int x= 1; x<=10; x++) {
			sum += x;
		}
		System.out.println("1~10 =" + sum);
	}
}
