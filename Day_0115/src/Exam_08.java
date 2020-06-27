/*
 * 객체비교
 */

class DataA{
	static int id = 10; // 명시적인 초기화,객첼 생성하지 않아도 static클래스가 로딩된 순간 만들어져서 금방 호출가능
	int pw = 111; // 실행될 때 만들어짐
}
public class Exam_08 {
	public static void main(String[] args) {
		DataA a1 = new DataA(); //주소값이 다름
		a1.id = 333;
		DataA.id = 444;
		
		DataA a2 = new DataA();// 동일한 객체가 아님 
		
		System.out.println("a1 == a2 :" + (a1 == a2));
		
		
		
	}

}
