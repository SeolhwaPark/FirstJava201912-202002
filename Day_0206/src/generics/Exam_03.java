package generics;
/*
 * ���׸�Ÿ���� Ŭ������ ���� �ÿ� ���׸�Ÿ���� ������ ���ΰ��� ���ؼ� �����
 */

class Box2<T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Box2<String> box = new Box2<String>();
		box.set("ȫ�浿");
		
		String name = box.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(100);
		int a = box2.get();
	}

}
