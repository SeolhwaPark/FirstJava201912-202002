package member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exam_06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("김자바");
		list.add("홍길동");
		list.add("Java");
		list.add("1234");
		list.add("Korea");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("===============");
		Collections.sort(list); //사용자정의클래스는 안됨. 기본자료형과 문자열만 소트가능
		for(String s : list) {
			System.out.println(s);
		}
	}

}
