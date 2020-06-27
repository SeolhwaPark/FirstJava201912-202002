/*
 * 1~ 45 로또 게임 만들기
 * 중복값 없이 
 * ex 43 12 23 3 5 7 
 */
public class Exam_07 {
	int number[] = new int[6];// 배열선언 로또방 만들기

	public Exam_07() {
		input(); // 로또번호생성 및 중복숫자제거
		sort(); // 오름차순 및 내림차순 정렬
		output(); // 로또번호출력
	}

	private void input() {
		for (int i = 0; i <= 5; i++) { // 로또번호생성
			number[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j <= i - 1; j++) { // 중복숫자제거
				if (number[i] == number[j]) {
					i--;
				}
			}
		}
	}

	private void sort() {
		int temp = 0;
		for (int i = 0; i <= 4; i++) {
			for (int j = i + 1; j <= 5; j++) {
				if (number[i] > number[j]) { // 오름차순 및 내림차순 선택
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}

	private void output() {
		for (int i = 0; i <= 5; i++) {
			System.out.print(number[i] + " "); /// 출력
		}
	}

	public static void main(String[] args) {
//new number();
	}
}
