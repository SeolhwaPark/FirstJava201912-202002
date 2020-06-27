import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * key return type = set
 */
public class Exam_14 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 100); // 오토박싱.. 자동으로 객체변환 시킴
		// map.put("김자바", new Integer(100)); //오토박싱
		map.put("김자바", new Integer(100));
		map.put("홍길동", new Integer(95));
		map.put("김자반", new Integer(88));
		map.put("홍자반", new Integer(78));
		map.put("김길동", new Integer(90));

		// 학생명단 출력
		Set set = map.keySet();
		System.out.println("학생 :" + set);

		// 값만(점수) 추출
		Collection value = map.values();
		System.out.println("학생 :" + value);

		// 점수 합계
		Iterator iter = value.iterator();
		int tot = 0;
		while (iter.hasNext()) {
			Integer a = (Integer) iter.next();
			tot += a.intValue();
		}
		System.out.println("sum =" + tot);

	}

}
