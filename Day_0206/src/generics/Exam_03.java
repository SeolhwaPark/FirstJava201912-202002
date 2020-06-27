package generics;
/*
 * 지네릭타입은 클래스를 설계 시에 지네릭타입을 지원할 것인가를 정해서 써야함
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
		box.set("홍길동");
		
		String name = box.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(100);
		int a = box2.get();
	}

}
