package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * 지네릭 : 다양한 타입의 객체를 다루는 메소드나 클래스를 만들때 사용하며,
 * 컴파일시의 타입을 체크해주는 기능. 형변환이 불필요.
 */
public class Exam_01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		String name = (String)list.get(0);
		int score = (int)list.get(1);
		
		//비교
		
		List<String> list2 = new ArrayList<String>();
		list2.add("홍길동");
		//list2.add(100);
		name = list2.get(0);
		//int score = (int)list.get(1);
	}

}
