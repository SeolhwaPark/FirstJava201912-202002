package rensyuu;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/*
 * 전화번호를 입력
 * 010-1234-1234
 * end (대소문자 관계없이) 종료 
 * 
 * 검색했을 때  1자리 이상 입력시 그 관련번호가 출력되야 한다
 * 몇자리를 입력해도 출력되야 함.
 * 
 * 010- / 
 * 국번,핸드폰
 * 
 * 010- 
 * 똑가트면 비교
 * 
 * 뒤엣 번호
 */

public class DenwaExam {
	public static void main(String[] args) {
		Denwa[] den = new Denwa[10];
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		boolean check = false;
		String pat = "\\d+-\\d+-\\d+"; //전화번호 형식
		String patt = "(01\\d?)-\\d{1,4}-\\d{4}";  //전화번호 검사
		System.out.println("***전화번호 검색***\n한자리 이상의 전화번호를 입력하세요.");

		while (true) {
			System.out.print("입력:");
			String bangou = scn.nextLine();
			if (bangou.equalsIgnoreCase("end"))
				break;
			if (ketaCheck(bangou)) {
				continue;
			}
			if(patCheck(pat,bangou)) {
				continue;
			}
			
			String[] num = bangou.split("-",2);	
			for(int x=0; x<2; x++) {
				
			}
			den[cnt] = new Denwa(bangou);
			cnt++;
		}
	}

	static boolean ketaCheck(String bangou) {
		if (bangou.length() < 1) {
			System.out.println("번호를 한글자이상 입력하이소");
			return true;
		} else
			return false;
	}

	static boolean patCheck(String a,String u) {
		boolean bool = Pattern.matches(a, u);
		if(bool) {
			System.out.println( "정상임돠");
			return true;
		}else {
			System.out.println( "정상이 아님돠");
			return false;
		}	
	}
	
	static boolean pattCheck(String a,String u) {
		boolean bool = Pattern.matches(a, u);
		if(bool) {
			System.out.println("okkkkay");
			return true;
		}else {
			System.out.println("no");
			return false;
		}
	}
}
