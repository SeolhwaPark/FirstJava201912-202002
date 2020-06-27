import java.util.Scanner;

/*
 * 키보드로 사원번호, 이름, 급여 입력 최대 10
 * 사원번호 -99 종료
 * 
 * 입력 
 * 사번 이름 급여
 * 
 * 출력
 * 사번 이름 급여 50,000 10,000 . . . .1
 * 합계
 * 
 * 사원 Sawon, 사원처리 SawonData
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		Sawon1 sawon[] = new Sawon1[10];
		while(cnt < 10) {
			System.out.print("입력 :");
			int number = scn.nextInt();
			if(number == -99) break;
			String name = scn.next();
			int money = scn.nextInt();
		
		sawon[cnt] = new Sawon1(number,name,money);
		cnt++;
		}
		
		SawonData1 saD1 = new SawonData1();
		saD1.payPrint(sawon, cnt);
		saD1.DataPrint(sawon, cnt);
		//SawonData1 saD2 = new SawonData1();
		//saD2.payPrint(sawon, cnt);
	}
}
