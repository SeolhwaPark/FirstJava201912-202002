import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 아래와 같이 args 사전(Map)에 이름과 나이가 저장되어 잇다.
 * (이름이 '키' 이므로 같은 이름이 없다고 가정한다)
 * 
 */

public class Exam_02_Map_ContainsKey {
	public static void main(String[] ar) {
		Map args = new HashMap();
		Scanner sc = new Scanner(System.in);
		args.put("Alice", 23);args.put("Paul", 25);args.put("Peter", 19);
		args.put("Karen", 40);args.put("Andy", 25);args.put("Cindy", 30);
		args.put("David", 19);args.put("Sally", 28);args.put("Tom", 22);
		args.put("Sue", 32);args.put("Bob", 31);
		
		while(true) {
		System.out.print("Enter name :");
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("end")) break;
		if(args.containsKey(str)) {
			System.out.println(str+" is "+args.get(str)+" years old");
		}
		else System.out.println("해당 이름은 존재하지 않습니다.");
		}
		System.out.println("프로그램종료");
	}
}
