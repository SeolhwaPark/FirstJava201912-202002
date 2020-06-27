import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam_05 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("JSP");
		set.add("Servlet");
		set.add("Container");
		set.add("Content");
		
		System.out.println("1:" + set);
		
		//순서적 출력을 위한 변환		
		List list = new ArrayList(set);
		System.out.println("2:" + list);
		System.out.println("3:" + list.get(2));
		Collections.sort(list); //기본자료형과 문자열만 소트가능
		System.out.println("4:" + list);
		
	}
}
