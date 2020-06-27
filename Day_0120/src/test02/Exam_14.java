package test02;

interface Control {
	int MAX_VOLUMN = 10; // static final
	int MIN_VOLUME = 0;

	void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) { // 반드시 default//기본메소드 오버라이딩
		// 인터페이스에서 기본메소드를 받지 못하고 상수메소드 ,default메소드,static메소드를 사용할 수 있음
		if (mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}

	static void changeBattery() { //
		System.err.println("건전지 교체");
	}
}

class Tv implements Control {
	private int volume;

	void print() {
		System.out.println("Tv.volume =" + volume);
	}

	@Override
	public void turnOff() {
		System.out.println("Tv ON");
	}

	@Override
	public void turnOn() {
		System.out.println("Tv off");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Control.MAX_VOLUMN) {
			this.volume = Control.MAX_VOLUMN;

		} else if (volume < Control.MIN_VOLUME) {
			this.volume = Control.MIN_VOLUME;
		} else
			this.volume = volume;

		System.out.println("현재 Tv volume은" + this.volume + " 입니다");
	}
}

public class Exam_14 {
	public static void main(String[] args) {

		Tv t = new Tv();
		t.turnOn();
		t.setVolume(5);

	}

}
