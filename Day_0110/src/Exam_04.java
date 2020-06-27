/*
 * 1~10 합계 출력
 * 출력 : 1~10 =55
 * 
 * 리턴타입이 없고 매개변수가 있는 경우
 */
public class Exam_04 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50}; 
		aPrint(a); //배열의 주소가 넘어감
		int b = 100;
		bPrint(b);
	}
	static void bPrint(int b) { //작업이 끝나면 데이터가 사라짐
		System.out.println(b);

	}
	static void aPrint(int[] dd) { //주소를 받으면 
		for(int x= 0; x<dd.length; x++) {
		System.out.println(dd[x]);

		}
	
	}
}
