package user;

import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 클래스배열을 이욯한 검색기능 구현
 * 
 
 회원정보입력
 회원이름
 회원 id
 이메일
 
 회원 전체정보출력
 고유번호 이름 id 이메일
 
 처리조건
 회원정보는 10명이며 입력값이 null이거나 "end"이면 입력된 회원정보를 모두 출력 oo
 회원정보 입력시 아이디 중복은 불가 아이디 중복시 경고하고 다시입력  -> ?oo
 고유번호는 입력순에 맞게 자동으로 등록되도록 한다  -> ? oo
 회원정보출력시 객체이름으로 출력되도록 한다 메소드호출 불가   ->? oo
 
 조회
 검색종료는 end 대소문자구분 없음 oo
 검색 : ID 입력후 엔터 oo
 존재하면 정보출력하고 없으면 해당정보없음 출력 oo
 *
 */
public class UserExam {
	public static void main(String[] args) {
		User[] use = new User[2];
		Scanner scn = new Scanner(System.in);
		String name = null;
		String userId = null;
		String email = null;
		int cnt = 0;
		String[] id = new String[10]; // 주소가 안변함
		String patt = "\\w+@\\w+.\\w+(\\.\\w+)?";
		System.out.println("**회원정보**");
		
		// 입력
		while (cnt < 10) {
			System.out.print("이름입력 :");
			name = scn.next();
			if (name == null || name.equalsIgnoreCase("end"))
				break;
			System.out.print("ID입력 :");
			userId = scn.next();
			boolean sw = true;
			for (int x = cnt; x < cnt + 1; x++) {
				id[x] = userId;
			}
			for (int x = 0; x < cnt; x++) {
				if (id[x].equals(userId)) {
					System.out.println("중복입력입니다. 다시 입력하세요");
					sw = false;
					break;
				}
			}
			if (sw) {
				System.out.print("E-Mail입력 :");
				email = scn.next();
				User uu = new User(name, userId, email);
				use[cnt] = uu;// 입력한거저장
				use[cnt].goyu = cnt + 1;
				cnt++;
			} else {
				continue;
			} 
			
			boolean bool = Pattern.matches(patt, email);
			if (bool) {
				System.out.println(email + "정상임돠");
			} else {
				System.out.println(email + "정상이 아님돠");
				continue;
			}
		}

		// 회원 전체정보출력
		System.out.println("*전체 회원정보*");
		for (int x = 0; x < cnt; x++) {
			System.out.println(use[x]);
		}

		System.out.println("----------------------");
		System.out.print("검색ID:");
		String search = scn.next();
		Arrays.parallelSort(use);

		try {
			int no = Arrays.binarySearch(use, new User(search));
			System.out.println(use[no]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당정보없음");
		}
	}
}