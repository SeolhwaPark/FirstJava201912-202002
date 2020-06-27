class AA{
	int a;
	int b;
}
public class Exam_05 {
	public static void main(String[] args) {
		AA a = new AA(); //생성자
		int[] b = new int[5];
		b[0] = 10;
		b[1] = 10;
		
		AA[] s = new AA[5]; //s라는 배열을 가진 클래스배열,AA만 저장가능
		s[0] = new AA();
		s[0].a = 100;
		s[1] = new AA();//같은 객체지만 다른 주소가 들어 있음
		s[1].a = 200;
		s[1] = s[0];
		System.out.println("s[0]=" + s[0]);
		System.out.println("s[1]=" + s[1]);
		System.out.println("s[0].a=" + s[0].a);
		System.out.println("s[1].a=" + s[1].a);
		
		
	}

}
