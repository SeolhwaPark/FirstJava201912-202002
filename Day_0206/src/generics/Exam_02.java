package generics;

class Box{
	
	private Object obj;
	
	void set(Object o) {
		obj = o;
	}
	public Object get() {
		return obj;
	}
}

class Apple {
	
}

/*
 * ���׸�Ÿ���� Ŭ������ ���� �ÿ� ���׸�Ÿ���� ������ ���ΰ��� ���ؼ� �����
 */
public class Exam_02 {
	public static void main(String[] args) {
		Box box = new Box(); 
		box.set("ȫ�浿");
		
		String name = (String)box.get();
		box.set(new Apple()); //������Ʈ�� ���� ���� �� ����
		Apple ap = (Apple)box.get();//��������
		
		
	}

}
