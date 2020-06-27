/*
 * 1~10 합계 출력
 * 출력 : 1~10 =55
 * 
 * 리턴타입이 없고 매개변수가 있는 경우
 */
public class Exam_03 {

	public static void main(String[] args) {
		sum(1000); //매개변수가 있는 경우. 매개변수는 모든 자료형을 넣을 수 있음
		//복수의 자료형, 배열들을 넣을 수 있음
	}
	static void sum(int a) {
		int sum = 0;
		for(int x= 1; x<=a; x++) {
			sum += x;
		}
		System.out.println("1~" + a + "=" + sum);
	}
}
