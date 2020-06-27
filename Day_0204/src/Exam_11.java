

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

/* 키보드 입력(아이디,이름,나이)
 * - 이름이 'end' 이면 종료
 * - 동일한 아이디인 경우 '아이디 중복' 출력 후 재입력
 * 출력 결과
 * 아이디 이름 나이
 */
class Member {
	String id, name;
	int age;

	Member() {
	}

	Member(String s[]) {
		id = s[0];
		name = s[1];
		age = Integer.parseInt(s[2]);
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			if (id.equals(m.id)) {
				System.out.println("아이디 중복");
				return true;
			} else
				return false;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member> set = new HashSet<Member>();
		while (true) {
			System.out.print("아이디,이름,나이 입력:");
			String str[] = sc.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end"))
				break;
			if (!(str.length == 3)) {
				System.out.println("아이디,이름,나이 형식에 맞게 입력해주세요");
				continue;
			}
			if (check(str)) {
				System.out.println("입력값 확인");
				continue;
			}
			set.add(new Member(str));
		}

		System.out.println("아이디\t이름\t나이");
		for (Member m : set) {
			System.out.println(m);
		}
	}

	static boolean check(String[] str) {
		boolean bool;
		for (int i = 0; i < str.length; i++) {
			if (i < 2) {
				bool = Pattern.matches("\\w*", str[i]);
// boolean 타입의 bool 변수 선언 후, Pattern 정규표현식 사용 ( \\d 숫자만 , 검사할 문자열 )
				if (!(bool))
					return true;
			} else
				bool = Pattern.matches("\\d*", str[i]);
			if (!(bool))
				return true;
		}
		return false;

	}
}
