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
 * 지네릭타입은 클래스를 설계 시에 지네릭타입을 지원할 것인가를 정해서 써야함
 */
public class Exam_02 {
	public static void main(String[] args) {
		Box box = new Box(); 
		box.set("홍길동");
		
		String name = (String)box.get();
		box.set(new Apple()); //오브젝트라 뭐든 담을 수 있음
		Apple ap = (Apple)box.get();//꺼내오기
		
		
	}

}
