import java.util.Scanner;

/*
 * 키보드로 영문단어를 입력
 * 영문자의 빈도수를 출력(대소문자 구분 없음)
 * 
 * 입력예시
 * 단어 : Apple
 * 단어 : Seoul
 * . . . . 
 * 
 * 단어 : end (또는 END) --> 종료
 * 
 * 출력예씨
 * A B C D . . . Z 배열 26
 * 0 2 1 0 . . . 1
 *  
 */
class AlphaTest {
	int[] alpha = new int[26];

	public void alphaFre(String str) { // 알파벳 빈도수
		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x); // 1문자씩 정수로 변환해서 분리
			System.out.print((int) ch);// 1문자를 정수로 변환
			alpha[ch - 65]++; // 빈도수 계산
		}
	}

	public void alphaPrint() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for (int x = 0; x < alpha.length; x++) {
			System.out.print(alpha[x] + " ");
		}
	}
}

public class Exam_01_1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		AlphaTest alpha = new AlphaTest();
		char[] alpha1 = new char[26];
		for (int x = 0; x < alpha1.length; x++) {
			alpha1[x] = (char) (x + 65);
		}

		while (true) {
			for (int x = 0; x < alpha1.length; x++) {
				System.out.print("단어 :");
				String word = scn.next().toUpperCase();
				if (alpha1[x] != word.charAt(0)) {
					System.out.println("오류입니다.");
					break;
				}

				else {
					if (word.equals("END"))
						break;

					alpha.alphaFre(word); // 넘기는 애
				}
			}
			break;

		}
		alpha.alphaPrint();
	}

}
