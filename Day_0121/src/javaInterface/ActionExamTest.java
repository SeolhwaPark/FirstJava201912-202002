package javaInterface;

public class ActionExamTest {

	public static void main(String[] args) {
		Action1 act = new Action1() {
			public void work() { //익명개체 생성
				System.out.println("복사를 실행합니다!!!");
			}
			
		};
		act.work();
	}

}
