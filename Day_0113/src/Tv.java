
public class Tv {
//속성
	String color; // 멤버변수 (인스턴스 변수)
	boolean power;
	int channel;
//기능
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
