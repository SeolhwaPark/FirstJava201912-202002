import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_03 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		System.out.println(set); //정수일때는 순서대로 출력가능하나 문자열은 안됨

		set.add(new Integer(1));
		set.add(new Integer(2));
		set.add(new Integer(3));
		set.add(new Integer(4));
		set.add(new Integer(5));
		set.add(new Integer(6));
		
//		System.out.println(set); //정수일때는 순서대로 출력가능하나 문자열은 안됨
		//반복자로 리턴을 받아 데이터 꺼내오기 Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {//존재한다면
			System.out.println(iter.next());
		}
	}
}
