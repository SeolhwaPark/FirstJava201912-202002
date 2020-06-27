

public class Exam_02 {
	public static void main(String[] args) {
		Tv tv = new Tv();//인스턴스객체 생성
		String str; // 오버라이딩 기능이 이
		str = new String("AAA");
		System.out.println("str :" + str);
		System.out.println("tv :" + tv);

		System.out.println("전원 상태 :" + tv.power);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("채널 :" + tv.channel);
		
		
	}
}
