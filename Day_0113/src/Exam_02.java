

public class Exam_02 {
	public static void main(String[] args) {
		Tv tv = new Tv();//�ν��Ͻ���ü ����
		String str; // �������̵� ����� ��
		str = new String("AAA");
		System.out.println("str :" + str);
		System.out.println("tv :" + tv);

		System.out.println("���� ���� :" + tv.power);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("ä�� :" + tv.channel);
		
		
	}
}
