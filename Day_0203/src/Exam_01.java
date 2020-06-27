import java.util.ArrayList;

/*
 * Collection Framework
 * 자바의 자료구조
 * Collection 인터페이스를 상속받은 인터페이스는 List, set, Map(k와 v가 반드시 따라오는 Map인터페이스)
 * List는 순서가 있고 중복이 허용됨.. 똑같은게 1번째에 들어갈 수 있음.. (Arraylist,Vector, LinkedList)
 * Set은 순서가 없고 중복이 불가함 .. 절대 같은게 순서대로 들어가지 않음.. ()
 * Map은 키(고유번호같은거)와 값이 쌍으로 저장됨.. 순서가 있지만 키의 중복은 불가
 * 
 * 순서적 =선형적
 * 
 * 비순서적 =비선형적
 */
public class Exam_01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		
		System.out.println("list Empty :" +list.isEmpty());
		System.out.println("list size :" +list.size());
		
		list.add("123"); // 뭐든 저장가능.
		list.add(123);
		list.add(3.14);
		list.add('A');
		
		System.out.println("list Empty :" +list.isEmpty());
		System.out.println("list size :" +list.size());
		String s= (String)list.get(0); //변환해서 꺼내와야해서 불편함
		int a = (int)list.get(1);
		System.out.println("list size :" +list.get(0));
		System.out.println("list size :" +list.get(1));
		
	}

}
