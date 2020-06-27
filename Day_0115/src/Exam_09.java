/*
 * 싱글톤(singleton)
 * 
 * 하나의 객체를 공유할 때 필요함
 * //데이터베이스에서 자주 사용함
 * 
 */

class DataB{
	private static DataB data = new DataB(); 
	// 정적클래스는 딱 한번만 생성, 자기 지역안에서만 사용, 외부에서 못쓰게 함
	private DataB() {}
	static DataB getInstance() { 
		//객체 호출// static이 붙은 클래스,메소드나 변수를 직접 호출..!!
		
		return data;
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		DataB d1 = DataB.getInstance();
		DataB d2 = DataB.getInstance();
		
		System.out.println("d1 == d2 :" + (d1 == d2));
		
		
		
	}

}
