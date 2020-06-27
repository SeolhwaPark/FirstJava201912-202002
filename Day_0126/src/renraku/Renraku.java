package renraku;

import java.util.Scanner;

public class Renraku {
	public static void main(String[] args) {
		// 입력

		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		String name; // 이름
		String sex; // 성별
		String bu; // 부서
		String kuni; // 국적

		System.out.println("************입력조건************");
		System.out.println("성명(4자리이하),주민번호8자리(-넣으셍)");
		System.out.println("전공(인문/자연),전화번호(+국번 필수)");
		RenrakuData[] re = new RenrakuData[10];
		
		while (cnt < 10) {
			System.out.print("*입력하셈 :");
			String input = scn.nextLine();// 한줄씩 입력
			if (input.equalsIgnoreCase("end"))
				break;// 소문자 대문자 상관 없이 end받기
			String[] arr = input.split(",");// 입력받은 걸 ,로 끊어서 배열맨들기

			// 이름 글자수 체크
			if (arr[0].length() > 4) {
				System.out.println("이름이 4자 이하가 아님. 오류라능!!!!!");
				continue;
			}

			// 주민번호 자리수 체크
			if (arr[1].length() != 8) {
				System.out.println("주민번호8자리가 아님. 좀 이따가 오류라능!!!!!");
				continue;
			}

			// 이름에 숫자 안들어가있나 체크후 저장
			try {
				int imsi = Integer.parseInt(arr[0]);
				System.out.println("이름이 이상함.오류라능!!!!!");
				continue;

			} catch (Exception e) {
				name = arr[0];
				System.out.println("ok저장했음^^");
			}

			// 성별체크
			if ('1' == arr[1].charAt(7))
				sex = "남자";
			else if ('2' == arr[1].charAt(7))
				sex = "여자";

			else {
				System.out.println("없는 성별임.오류라능!!!!!");
				continue;
			}

			// 전공에 따른 부서배정
			if (arr[2].equals("인문"))
				bu = "총무";
			else if (arr[2].equals("자연"))
				bu = "인사";
			else {
				System.out.println("그런 부서없음.오류라능!!!!!");
				continue;
			}

			// 국번으로 국적판별
			if ('2' == arr[3].charAt(2))
				kuni = "한국인";
			else if ('1' == arr[3].charAt(2))
				kuni = "일본인";
			else {
				System.out.println("없는 국번임.오류라능!!!!!");
				continue;
			}

			re[cnt] = new RenrakuData(name, sex, bu, kuni);
			cnt++;
		}
		for (int x = 0; x < cnt; x++) {
			if (re[x].kuni.equals("일본인"))
				re[x].renrakuPrint();
		}
	}
}