package Syain;

import java.util.Scanner;

public class SyainmeiboData {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Syainmeibo[] meibo = new Syainmeibo[50];
		int cnt = 0;

		String name = null; // namae
		String number = null; // juuminbangou
		String seibetu = null;
		int nenrei = 0;
		String juusyo = null; // kyojuuti
		String syozoku = null; // busyo
		String cell = null; // renrakusaki
		String erro = " Error : ";

		System.out.println("*****사원정보를 입력하세요*****");
		System.out.println("필요정보: 성명 주민등록번호 8번째자리까지(-포함)");
		System.out.println("거주지(서울,대전,대구,부산) 소속(영업,개발) 휴대폰번호 ");

		while (cnt < 50) {
			System.out.print("입력하세요 :");
			String data = scn.nextLine();

			if (data.equalsIgnoreCase("end"))
				break;
			String[] arr = data.split(" ");

			if (arr[0].length() > 4) {
				System.out.println("4자이내로 입력하시오.");
				erro = erro + " 4글자에러";

			}
			try {
				int rinjii = Integer.parseInt(arr[0]);
				System.out.println("오류입니다.");
				erro = erro + " 오류 무슨오류모름";
			} catch (Exception e) {
				name = arr[0];
			}

			if (arr[1].length() != 8) {
				erro = erro + " 주민등록 8글자 입력안됨";
			}

			if (arr[4].length() != 13) {
				erro = erro + " 핸드폰 12글자에러";
			}

			try {
				int rinji = Integer.parseInt(arr[0]);
				erro = erro + " 2222글자에러";

			} catch (Exception e) {
				name = arr[0];
				System.out.println("저장되었습니다.");
			}
			try {
				if ('1' == arr[1].charAt(7) || '3' == arr[1].charAt(7))
					seibetu = "남성";
				else if ('2' == arr[1].charAt(7) || '4' == arr[1].charAt(7))
					seibetu = "여성";
			} catch (Exception e) {
				erro = erro + " 성별쪽 에러";

			}
			try {
				System.out.println(arr[1]);
				int date = Integer.parseInt(arr[1].substring(0, 2)); // 생년
				if ('1' == arr[1].charAt(7) || '2' == arr[1].charAt(7))
					nenrei = 2020 - (1900 + date) + 1; // 나이계산
				else if ('3' == arr[1].charAt(7) || '4' == arr[1].charAt(7))
					nenrei = 2020 - (2000 + date) + 1; // 나이계산
			} catch (Exception e) {
				erro = erro + " 나이계산쪽 에러";
				System.out.println(e);
			}

			if (arr[2].equals("서울") || arr[2].equals("대전") || arr[2].equals("부산") || arr[2].equals("대구"))
				juusyo = arr[2];
			else {
				erro = erro + " 도시에러";
			}

			if (arr[3].equals("영업"))
				syozoku = "영업";
			else if (arr[3].equals("개발"))
				syozoku = "개발";
			if (erro.equals(" Error : "))
				System.out.println("에러 없이 수행");
			else {
				System.out.println(erro);
				continue;
			}

			meibo[cnt] = new Syainmeibo(name, number, seibetu, nenrei, juusyo, syozoku, cell);
			cnt++;

		} // while

		for (int x = 0; x < cnt; x++) {
			meibo[x].syainPrint();
		}
	}

}
