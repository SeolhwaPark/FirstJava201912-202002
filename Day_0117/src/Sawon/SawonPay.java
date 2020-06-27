package Sawon;
/*
 * 각 사원의 아이디 등급 근무시간을 입력받아 사원들에 대한 주간 급여를 계산하는 프로그램을 완성
 * 
 * 사원관리항목
 * 아이디 등급 시급 근무시간 주간급여
 * 
 * 처리조건
 * 사원의 주간급여는 근무시간과 시급을 곲한 값으로 한다
 * 시급은 사원의 등급이 1등급인 경우 10000원 2등급인 경우 5000원 3등급인 경우 2000원
 * 근무시간이 36시간을 초과한 경우 초과근무시간의 1.5배를 지급하며 근무시간은 최대 50시간까지만 인정된다
 * 사원의 아이디가 "end"가 입력되면 자료출력 마지막에 급여총합과 평균을 출력한다.
 * 
 * 출력
 * 
 * 아이디		 등급		 시급 		근무시간 		주간급여
 * user01	 1		10000		25			
 * 합계            		 ...      	...   		 ....
 * 주간급여를 가장 많디 받는 사원
 * 아이디 		주간급여
 */

import parking.Parking;

public class SawonPay {
	// 기능

	Sawon[] sawo;
	int arr[] = new int[100];
	int cnt = 0;

	SawonPay() {
	}

	SawonPay(Sawon[] s, int cnt) {
		sawo = s;
		this.cnt = cnt;
	}

	void pay(Sawon[] sawo, int cnt) {
		for (int x = 0; x < cnt; x++) {
			if (sawo[x].level == 1) {// 시급 사원의 등급이 1등급인 경우 10000원 2등급인 경우 5000원 3등급인 경우 2000원
				sawo[x].pay = 10000;

			} else if (sawo[x].level == 2) {
				sawo[x].pay = 5000;

			} else {
				sawo[x].pay = 2000;
			}
			if (sawo[x].time > 50)
				sawo[x].time = 50;
			if (sawo[x].time > 36) {// 근무시간 36시간을 초과한 경우 초과근무시간의 1.5배를 지급하며 근무시간은 최대 50시간까지만 인정된다
				sawo[x].weekPay = sawo[x].pay * 36 + (int) ((sawo[x].time - 36) * 1.5 * sawo[cnt].pay);
			} else {
				sawo[x].weekPay = sawo[x].pay * sawo[x].time;
			}
		}
	}

	void print() {
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for (int i = 0; i < cnt; i++) {
			System.out.print(sawo[i].id + "\t" + sawo[i].level + "\t" + sawo[i].pay + "\t");
			System.out.print(sawo[i].time + "\t" + sawo[i].weekPay + "\n");
		}
		int su = 0;
		int sum = 0;
		for (int x = 0; x < cnt; x++) {
			su += sawo[x].time;
			sum += sawo[x].weekPay;
		}
		System.out.println("*합계 :\t\t\t" + su + "\t" + sum);

		System.out.println("*주간급여를 가장 많이 받는 사원");
		int max = 0;
		int a = 0;
		for (int j = 0; j < cnt; j++) {
			if (sawo[j].weekPay > max) {
				max = sawo[j].weekPay;
				a = j;
			}
		}
		System.out.println("아이디 :" + sawo[a].id + "\t주간급여 :" + sawo[a].weekPay);
	}
}
