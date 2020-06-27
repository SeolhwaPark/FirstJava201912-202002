package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 키보드 입력 
 *	아이디 이름 나이입력 Member객체를 생성
 *
 *조건
 *- 입력시 아이디가 end 이면 전체출력 후 종료
 *- ArrayList이용 
 *- 아이디가 같은 경우 오류.. 중복된 아이디입니다
 *	문장 출력후 재입력
 *
 * 다음과 같이 출력
 * 아이디     이름     나이
 * user01 홍길돝  29
 */
public class MemberExam {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		Scanner scn = new Scanner(System.in);
		Member m = null;

		while (true) {
			System.out.print("입력하세요:");
			String[] arr = scn.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("end"))
				break;
			m = new Member(arr[0], arr[1], Integer.parseInt(arr[2]));

			// if(list.contains(m))
			boolean bool = list.contains(m); // 사용자정의자료를 쓰려면 오버라이딩
			if (bool) {
				System.out.println("중복임돠");
			} else {
				list.add(m);
			}
		}

		System.out.println("아이디\t이름\t나이");
		// System.out.println(list);

//		for (Member mem : list) {
			// System.out.print(mem.userid + "\t");
			// System.out.print(mem.name + "\t");
			// System.out.print(mem.nai + "\n");
//			System.out.println(mem); // 쓰려면 오버//라이딩
//		}
		 new MemberData(list);
	}

}
