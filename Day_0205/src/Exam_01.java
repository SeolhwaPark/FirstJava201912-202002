import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 아래와 같이 args사전(Map)에 이름과 나이가 저장되어있다.
 * 이름이 '키'이므로 같은 이름이 없다고 가정한다
 * 
 * ars['Alice'] = 23	ars['Paul'] = 25
 * ars['Peter'] = 19	ars['Karen'] = 40
 * ars['Andy'] = 25		ars['Cindy'] = 30
 * ars['David'] = 19	ars['Sally'] = 28
 * ars['Tom'] = 22		ars['Sue'] = 32
 * ars['Bob'] = 31		
 *
 *이를 사용해서 아래와 같은 실행결과를 내는 프로그램을 작성
 *Enter name : Peter
 *Peter is 19 years old
 *
 * 즉 키를 입력받아 키에 해당하는 나이를 찾아 출력하는 프로그램을 작성
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Alice", 23); map.put("Paul", 25);
		map.put("Peter", 19); map.put("Karen", 40);
		map.put("Andy", 25); map.put("Cindy", 30);
		map.put("David", 19); map.put("Sally", 28);
		map.put("Tom", 22); map.put("Sue", 32);
		map.put("Bob", 31);
		
		String a = sc.next();
		System.out.println("Enter name :" + a);
		System.out.println("Peter is " + map.get(a) + " years old");
	}
}
