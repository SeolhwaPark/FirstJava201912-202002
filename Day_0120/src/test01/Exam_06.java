package test01;

/*
 * 
 */
class Super{
	int x = 100;
	
	void aa() {
		System.out.println("x =" + x);
	}
}

class Child extends Super{
	int y = 200;
	void aa() {
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}	
	void bb() {
		System.out.println("x =" + x);
	}
}

class ChildA extends Super{
	int y = 200;

}

public class Exam_06 {
	public static void main(String[] args) {
		Super s = new Super();
		s.aa();
		System.out.println("x =" + s.x);
		Child c = new Child();
		c.aa();
		c.bb();
		
//		System.out.println("x =" + c.x);
//		System.out.println("y =" + c.y);
		System.out.println("----------------------");

		Super ss = new Child(); // ���������� Child�� ����Ŵ. ������ �Ϳ� ���� ���ٱ��Ѹ� ����
		System.out.println("x =" + ss.x);
//		System.out.println("y =" + ss.y);
		ss = new ChildA();
//		child CC = new Super(); // �ڽ��� ������ ��ü�� ����ų ���� ����
		
	}

}
