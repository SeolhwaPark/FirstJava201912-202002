import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * �Ʒ��� ���� args����(Map)�� �̸��� ���̰� ����Ǿ��ִ�.
 * �̸��� 'Ű'�̹Ƿ� ���� �̸��� ���ٰ� �����Ѵ�
 * 
 * ars['Alice'] = 23	ars['Paul'] = 25
 * ars['Peter'] = 19	ars['Karen'] = 40
 * ars['Andy'] = 25		ars['Cindy'] = 30
 * ars['David'] = 19	ars['Sally'] = 28
 * ars['Tom'] = 22		ars['Sue'] = 32
 * ars['Bob'] = 31		
 *
 *�̸� ����ؼ� �Ʒ��� ���� �������� ���� ���α׷��� �ۼ�
 *Enter name : Peter
 *Peter is 19 years old
 *
 * �� Ű�� �Է¹޾� Ű�� �ش��ϴ� ���̸� ã�� ����ϴ� ���α׷��� �ۼ�
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
