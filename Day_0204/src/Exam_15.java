import java.util.*;

/*
 * 사용자정의클래스
 */
class Student {
	int sno;
	String name;

	Student() {

	}

	Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 키가 사용자정의이면 중복이 허용되기 때문에, 오버라이딩해야함
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return sno == s.sno && name.equals(s.name);
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}

public class Exam_15 {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("A", new Student(1, "AAAA"));
		map.put("B", new Student(2, "BBBB"));
		map.put("A", new Student(3, "CCCC")); // 키가 중복된 상태

		System.out.println("map size:" + map.size());

		Map<Student, Integer> map2 = new HashMap<Student, Integer>();
		// 키가 사용자정의이면 중복이 허용되기 때문에, 오버라이딩해야함
		map2.put(new Student(1, "AAAA"), new Integer(100));
		map2.put(new Student(2, "BBBB"), new Integer(88));
		map2.put(new Student(3, "CCCC"), new Integer(90));
		map2.put(new Student(1, "AAAA"), new Integer(77));

		System.out.println("map2 size:" + map.size());
	}

}
