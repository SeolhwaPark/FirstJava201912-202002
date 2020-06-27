package jslhrd4;
/*
 * ���� ��øŬ����
 * �ݵ�� static����� ����
 */

class Outer2{
	static int x = 100;
	static int y = 200;
	
	void disp() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}
	
	static class Inner2{ //���� ��ø
		int a = 100;
		static int b = 100; // ��ü�� �������� �ʾƵ� static����� ���� ����
		void disp_in() {
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			System.out.println("a =" + a);
		}
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Outer2  ot = new Outer2();
		Outer2.Inner2 oi = new Outer2.Inner2(); //���� ��ø ��ü���� ���
		oi.disp_in();
		System.out.println("x = " + Outer2.y);
		System.out.println("b = " + Outer2.Inner2.b);
	}

}
