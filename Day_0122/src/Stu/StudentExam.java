package Stu;
/*
 * 입력예시
 * 입력 : 5,홍길동,90,90,80
 * 
 *  * 처리조건
 * 학생인원은 최대 10명
 * 입력자료는 번호가 무작위로 입력됨
 * 입력 항목 유효성 검사를 수행한다
 *  번호는 1~10 입력오류처리는 번호 오류입니다. 다시 입력받아야함
 *  이름은 1~10자이내
 *  각 점수는 0~100사이의 정수 이어야 한다.
 *  출력시 번호를 기준으로 오름차순출력 
 *  
 *  
 */

import java.util.Scanner;


public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student st[] = new Student[10];
		int cnt = 0;
		while (cnt < 10) { //최대 10명
			System.out.print("입력 :"); //무작위로 입력
			String[] s = scn.nextLine().split(","); //입력받을 걸 하나씩 배열로 만들깅
			if (s[0].equalsIgnoreCase("end"))break;		
			st[cnt] = new Student(s[0],s[1],s[2],s[3],s[4]);
			cnt++;
		}	
		/*
			for (int x = 0; x < cnt; x++) {
				if (st[x].bun == cnt) {
					//번호
				} else {
					System.out.println("오류입니다! 다시 입력하세요.");
				}else if(){
				
				}
		
			}
		}
		*/

		School data = new School(st, cnt);
		data.testPrint();
		data.SchoolPrint();
		data.cal();
	}

}