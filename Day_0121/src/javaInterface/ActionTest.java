package javaInterface;
/*
 * 클래스를 만들 때 인터페이스 불어들이면 오버라이드 나옴
 */
public class ActionTest implements Action1 {

	@Override
	public void work() {
		System.out.println("복사를 합니다.");//구현객체

	}

}
