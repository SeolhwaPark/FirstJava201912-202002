import java.util.Scanner;

/*
 * 키보드로 (번호 이름 국어 영어 수학 전산)
 * 입력 : 1　헝길동 77 88 99 80
 * . . .
 * 입력 : -99 입력종료 최대 10명
 * 
 *  출력 
 *  번호 이름 국어 영어 수학 전산 총점 평균(정수)
 *  . . . . 
 *  합계		 XX   XX   XX   XX    XX
 *  평균(실수) xx.x xx.x xx.x xx.x [xx.x]
 
 *  전체평균 이상인 학생 출력
 *  번호 이름 평균
 *  . . . . 
 *  
 *  처리조건
 *  
 *  과목 평균은 정수만, 소수이하 버리셈
 *  전체 평균은 소수이하 둘째자리에서 반올림
 */
public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[][] = new int[11][7]; // 배열선언 .. 10명분과 합계의 배열에 7항목이 있음
		int cnt = 0; // 실제 입력할 인원 수
		String name[] = new String[10]; // 이름배열 (단독) 선언

		// 입력***********************************************************************************
		for (cnt = 0; cnt < 10; cnt++) { // 입력한 사람수가 증가할 때
			System.out.print((cnt + 1) + "번째 입력 : "); // 우선 0번째에 입력
			score[cnt][0] = scn.nextInt(); // 배열에 들어가게 버퍼에 저장

			if (score[cnt][0] == -99)
				break; // -99를 입력하면 종료
			name[cnt] = scn.next(); // 이름은 입력한 사람수 만큼 있음

			for (int x = 1; x < 5; x++) { // 과목수가 5개이하일 때
				score[cnt][x] = scn.nextInt(); // 각 과목의 점수를 입력받고
				score[cnt][5] += score[cnt][x]; // 각 배열의 5번째칸에 사람당 총점이 들어감
				score[10][x] += score[cnt][x]; // 각 과목의 점수의 총합이 들어감
			}
			score[cnt][6] = score[cnt][5] / 4; // 각 배열의 6번째 칸에 평균이 나옴
			score[10][5] += score[cnt][5]; // 총점의 합
		}

		// 테스트출력
		// ******************************************************************************
		System.out.println("번호\t이름\t국어\t영어\t수학\t전산\t총점\t평균");
		for (int x = 0; x < cnt; x++) {
			System.out.print(score[x][0] + "\t");// 번호 배열의 첫번째(0번째)부터 출력
			System.out.print(name[x] + "\t");// 이름만 들어가 있음

			for (int y = 1; y < 7; y++) { // 과목을 넣을 항목수만들기
				System.out.print(score[x][y] + "\t"); // 국 영 수 전 총 평(배열의 각 항목당 입력되있는 점수를 출력)
			}
			System.out.println();
		}

		// 합계와 평균출력
		// ******************************************************************************
		System.out.print("합계\t\t");
		for (int x = 1; x <= 5; x++) { // 항목***********
			System.out.print(score[10][x] + "\t");// 과목별 합계출력 //10번째(11.0)배열의 각 항목에 해당하는 값을 하나씩 꺼내옴
		}
		System.out.println();
		System.out.print("평균\t\t");

		for (int x = 1; x <= 5; x++) { // 항목***********
			System.out.print((int) (score[10][x] / (double) cnt * 100 + 0.5) / 100. + "\t");// 과목별 평균출력
			// 정수로 변환된 10번째(11.0)배열에 있는 합계값과 실수로 변환 시킨 입력시킨 인원수를 나눔
			// 나눈 값을 100으로 곲하고 0.5을 더한 값을 100.로 나눠 2자릿수에서 반올림 된 값이 출력되게 함
		}

		System.out.println();
		System.out.println("전체평균 이상 학생");
		System.out.println("번호\t이름\t평균");

		for (int x = 0; x < cnt; x++) { // 사람수만큼 반복**********
			if (score[x][5] >= score[10][5] / cnt) // 각 입력된 사람수 만큼 각 총점이 총점의 평균값보다 클 때
				System.out.println(score[x][0] + "\t" + name[x] + "\t" + score[x][6]);// 배열에 있는 번호 이름 평균을 출력

		}
	}
}