package School;

import java.util.Scanner;

//입력항목수 정상, 번호 체크
public class StuExam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("입력 :"); // 1,aaa,55,66,77
			// 기본항목 5개가 들어온건지 검사
			String[] str = scn.nextLine().split(",");
			if (str.length != 5) {
				System.out.println("입력오류");
				continue; // 밑으로 안내려가고 while조건식으로 다시 들어감
			}
			// 번호 오류체크 str[0]
			String bun = "";
			for (int x = 0; x < str[0].length(); x++) {
				char ch = str[0].trim().charAt(x);// 공백을 제거하고 한글자를 추출
				if (ch >= '0' && ch <= '9') { // 0과 9사이에 존재한다면
					bun += ch; // 0을 ""== 공백으로 처리
				} else {
					bun = "";
					break; // 한글자라도 틀리면 빠져나감
				}
			}
			if (bun.equals("")) { // 번호가 잘못들어왓을 때
				System.out.println("입력오류");
				continue; // 끝
			}
			int b = Integer.parseInt(bun); // 문자를 숫자로 바꿔줌
			if (b > 10) { // 1~10사이인지 아닌지
				System.out.println("입력오류");
				continue; // 끝
			}
			System.out.println("bun =" + bun);
			cnt++;
		}
		System.out.println("입력종료");
	}

}
