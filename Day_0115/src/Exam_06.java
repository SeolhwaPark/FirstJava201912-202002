/*메인클래스(실행클래스)
 * 
 * 자료저장구조
 */

public class Exam_06 {
	public static void main(String[] args) {
		//Hak h1 = new Hak(); //생성과 동시에 디폴트값으로 초기화
		//h1.bun = 3;
		Hak[] stu = new Hak[5]; //stu는 변수
		
		Hak h2 = new Hak(1,"홍길동", 90); //생성과 동시에 값 초기화
		
		stu[0] = h2; //
		
		h2 = new Hak(3,"dddd",77);
		
		stu[1] = h2;
		
		stu[2] = new Hak(2,"ABA",88);
		
		stu[3] = new Hak(5,"AEA",88);

		stu[4] = new Hak(7,"AGA",88);
		
		HakData data = new HakData(stu);
		
		data.print();
		
	}
}
