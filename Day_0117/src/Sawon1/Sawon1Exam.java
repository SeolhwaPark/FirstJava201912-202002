package Sawon1;

import java.util.Scanner;

import Sawon.Sawon;
import Sawon.SawonPay;
/*
 * 키보드로 사원정보를 입력받아서 부서별 급여합계를 출력
 * 
 * 사원정보 : 부서명 사원번호 사원이름 급여
 * 입력자료 예시 입력은 부서순으로 입력
 * 사원정보 : 인사 1101 AAAA 358000
 * 
 * 부서명이 "end" 또는 "END"이면 전체자료 출력 후 종료
 * 부서가 동일한 경우 첫번째 사원만 부서명을 출력
 * 부서가 바뀌면서 부서별 급여 합계 출력
 * 마지막에는 전체 급여합계를 출력한다
 */
public class Sawon1Exam {
	public static void main(String[] args) {
		//입력
		Scanner scn = new Scanner(System.in);
		
		System.out.println("  **급여관리프로그램**");
		System.out.println("부서별로 부서명,사원번호,사원이름,급여를 입력하세요 ");
		
		Sawon1 sawon[] = new Sawon1[100];
		int cnt = 0;

		while(cnt<100) {
			
			System.out.print("사원정보 :");
			String busyo = scn.next();
			if(busyo.equals("end")||busyo.equals("END"))break;
			String sabun = scn.next();
			String name = scn.next();
			int pay = scn.nextInt();
			sawon[cnt] = new Sawon1(busyo,sabun,name,pay);
			cnt++;
		}
		
		Sawon1Data saw = new Sawon1Data(sawon,cnt);
		saw.dataPrint();
		
	//	saw.payPrint();
	}
}
