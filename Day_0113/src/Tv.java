
public class Tv {
//�Ӽ�
	String color; // ������� (�ν��Ͻ� ����)
	boolean power;
	int channel;
//���
	void power() {
		power =! power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
}
