package gakkou;

import java.util.Scanner;


public class GakuseiExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Gakusei[] gaku = new Gakusei[100];
		int cnt = 0;

		System.out.println("********************* 학생정보관리 ********************");
		System.out.println("필요정보 : 성명(3자리) 학과(경제 경영 영어) 학번6글자 (경제 kj 경영 ky 영어 eg)");
		System.out.println("주민번호(-를 포함한 8자리) 성적(국어점수 영어점수 수학점수)");

		String name = null; // 성명
		String gakka = null; // 학과
		String gakuban = null; // 학번
		String jumin = null; // 주민번호
		String danjo = null; // 성별
		int tosi = 0; // 나이
		int jum1 = 0; // 국어
		int jum2 = 0; // 영어
		int jum3 = 0; // 수학
		double ave = 0; //평균
		int rank = 0; // 석차

		// 입력, 오류검사
		while (cnt < 100) {
			System.out.print("입력하세욧 :");
			String data = scn.nextLine();
			if (data.equalsIgnoreCase("end"))
				break;
			String[] arr = data.split(" ");

			// 이름
			if (arr[0].length() > 3) {
				System.out.println("이름 3글자이상 오류");
				continue;
			}
			try {
				int rinji = Integer.parseInt(arr[0]);
				System.out.println("입력 오류");
				continue;
			} catch (Exception e) {
				name = arr[0];
			}

			// 학과
			if (arr[1].equals("경제") || arr[1].equals("경영") || arr[1].equals("영어"))
				gakka = arr[1];

			// 학번
			if (arr[2].length() != 6) {
				System.err.println("학번 6글자이상 오류");
				continue;
			}
			if (arr[2].equals("kj"))
				gakka = "경제";
			else if (arr[2].equals("ky"))
				gakka = "경영";
			else if (arr[2].equals("eg")) 
				gakka = "영어";
			else {
				System.out.println("학과명 오류");
				continue;
			}
			
			// 주민번호
			if (arr[3].length() != 8) {
				System.out.println("주민번호 오류. -도 입력하였는가");
				continue;
			}
			try {
				if ('1' == arr[3].charAt(7) || '3' == arr[3].charAt(7) || '5' == arr[3].charAt(7)
						|| '7' == arr[3].charAt(7))
					danjo = "남성";
				else if ('2' == arr[3].charAt(7) || '4' == arr[3].charAt(7) || '6' == arr[3].charAt(7)
						|| '8' == arr[3].charAt(7))
					danjo = "여성";
				else {
					System.out.println("성별 오륩니더");
					continue;
				}
			} catch (Exception e) {
				danjo = arr[3];
			}

			int hizuke = Integer.parseInt(arr[3].substring(0, 2)); // 생년
			if ('1' == arr[3].charAt(7) || '2' == arr[3].charAt(7) || '5' == arr[3].charAt(7)
					|| '6' == arr[3].charAt(7))
				tosi = 2020 - (1900 + hizuke) + 1; //
			else if ('3' == arr[3].charAt(7) || '4' == arr[3].charAt(7) || '7' == arr[3].charAt(7)
					|| '8' == arr[3].charAt(7))
				tosi = 2020 - (2000 + hizuke) + 1;
			else {
				System.out.println("주민번호 오륩니더");
				continue;
			}

			// 성적
			try {
				jum1 = Integer.parseInt(arr[4]);
				jum2 = Integer.parseInt(arr[5]);
				jum3 = Integer.parseInt(arr[6]);

			} catch (Exception e) {
				System.out.println("점수에 왠 문자임??");
				continue;
			}
			if (!(jum1 >= 0 && jum1 <= 100 && jum2>= 0 && jum2 <= 100
					&& jum3 >= 0 && jum3 <= 100)) {
				System.out.println("점수 오륩니더");
			continue;
			}
			System.out.println(danjo);
			gaku[cnt] = new Gakusei(name,gakka,gakuban,danjo,tosi,jum1,jum2,jum3,ave,rank);
			cnt++;
			System.out.println("저장완료OKKKKK");
		} // while...

		GakuseiData gak1 = new GakuseiData(gaku,cnt);
		gak1.seisekiPrint();

	}

}
