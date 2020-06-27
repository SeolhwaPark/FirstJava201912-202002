package mem;

import java.util.Scanner;


/*
* nextLine 공백이 있어도 엔터를 칠 때 까지..
* 
* 
* 입력
* 자료입력 : 홍길동, 900206-1, 010-2242-3810

*비고 1 spilt 2.substring
* Integer.parseInt 문자를 정수로
*
* 처리조건
* 입력은 1라인씩 입력
* 
* 성별체크
* 1900~1999 1남2여 2000~2099 3남4여
* 외국인 5,6 / 7,8

*/
public class MemberExam {
	public static void main(String[] args) {
		// 입력
		Member menbaa[] = new Member[10];
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		
		while(cnt<10) {
			System.out.print("자료입력" + (cnt+1) + " :");
			String[] s = scn.nextLine().split(","); //입력받을 걸 하나씩 배열로 만들깅
			if (s[0].equalsIgnoreCase("end"))break;		
			menbaa[cnt] = new Member(s[0],s[1],s[2]);
			cnt++;
		}
		MemberData data = new MemberData(menbaa,cnt);
		data.memPrint();
	}// 2

}// 1
