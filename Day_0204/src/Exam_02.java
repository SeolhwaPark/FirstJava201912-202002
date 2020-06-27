import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Set인터페이스 :순서와 중복이 허용되지 않음.. 불가능
 * 구현한 클래스 HashSet를 사용해야함
 */
public class Exam_02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Tomcat");
		set.add("Java");
		set.add("C#");
		
		System.out.println(set);
		//꺼내오려면 변환작업이 필요함
		
		List list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Tomcat");
		list.add("Java");
		list.add("C#");
		System.out.println(list);
		
		Object obj = list.get(0);
		

	}
}
