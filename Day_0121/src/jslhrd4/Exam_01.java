package jslhrd4;

/*
 * 4�� ��øŬ����
 * 
 * 1.��ø(����)Ŭ���� == inner Ŭ���� �ȿ� Ŭ���� .. Ŭ������ �����ϴ� ���
 * 2.���� ��ø
 * 3.���� ��ø
 * 4.�͸� ��ø
 * 
 */

class Outer{
	private int x = 10;
	int y = 20;
	
	void disp() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}
	class Inner{ //
		int a = 100;
		
		void disp_in() {
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			System.out.println("a =" + a);
		}
	}
}

class AA{
	
}
public class Exam_01 {
	public static void main(String[] args) {
		//��ü�������
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		Outer.Inner oi2 = new Outer().new Inner();
		ot.disp();
		oi.disp_in();
	}
}
