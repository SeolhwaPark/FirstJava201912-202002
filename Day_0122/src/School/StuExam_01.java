package School;

import java.util.Scanner;
//입력항목수만 카운트
public class StuExam_01 {
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
			cnt++;
		}
		System.out.println("입력종료");
	}

}
