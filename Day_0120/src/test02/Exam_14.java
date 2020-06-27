package test02;

interface Control {
	int MAX_VOLUMN = 10; // static final
	int MIN_VOLUME = 0;

	void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) { // �ݵ�� default//�⺻�޼ҵ� �������̵�
		// �������̽����� �⺻�޼ҵ带 ���� ���ϰ� ����޼ҵ� ,default�޼ҵ�,static�޼ҵ带 ����� �� ����
		if (mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}

	static void changeBattery() { //
		System.err.println("������ ��ü");
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

		System.out.println("���� Tv volume��" + this.volume + " �Դϴ�");
	}
}

public class Exam_14 {
	public static void main(String[] args) {

		Tv t = new Tv();
		t.turnOn();
		t.setVolume(5);

	}

}
