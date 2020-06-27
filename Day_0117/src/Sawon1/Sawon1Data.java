package Sawon1;

import Sawon.Sawon;

/*
 *  * 급여관리프로그램
 * 부서명  사번    이름    급여
 * 인사 	1101 AAAA 358000
 * 	  	1101 AAAA 358000
 * 합계			  358000
 * 총무 	1101 AAAA 358000
 *    	1101 AAAA 358000
 *    	1101 AAAA 358000
 * 합계 			  358000
 * 자재	1101 AAAA 358000
 * 합계			  358000 
 * 총합계			  358000
 */
public class Sawon1Data {
	// 기능
	Sawon1[] saw;
	int arr[] = new int[100];
	int cnt = 0;
	int bun;
	String name;

	Sawon1Data() {
	}

	Sawon1Data(Sawon1[] sa, int cnt) {
		saw = sa;
		this.cnt = cnt;
		
	}

	void dataPrint() {
		// 합계
		// 부서명별로 출력
		System.out.println("부서명\t사번\t이름\t급여\t5만원\t만원\t5천원\t천원\t5백원\t백원\t5십원\t십원\t5원\t1원");
		int sum = saw[0].getPay(); // 총합계변수
		int bu = saw[0].getPay(); // 부서합계
		int syou;
		int amari;
		int sihei = 50000;
		int kane = saw[0].getPay();
		boolean sw = true;
		
		System.out.print(saw[0].getBusyo() + "\t" + saw[0].getSabun());
		System.out.print("\t" + saw[0].getName() + "\t" + saw[0].getPay());
		saw[0].print();
		
		for (int i = 1; i < cnt; i++) {
			if (saw[i].getBusyo().equals(saw[i - 1].getBusyo())) {
				System.out.print("\t" + saw[i].getSabun());
				System.out.print("\t" + saw[i].getName() + "\t" + saw[i].getPay()+"\t");
				saw[i].print();
				bu += saw[i].getPay();
				
			} else {
				System.out.println("합계\t\t\t" + bu);
				bu = saw[i].getPay();
				System.out.print(saw[i].getBusyo() + "\t" + saw[i].getSabun());
				System.out.print("\t" + saw[i].getName() + "\t" + saw[i].getPay() + "\t");
				saw[i].print();
			}
			sum += saw[i].getPay();
		}
		
		System.out.println("합계\t\t\t" + bu);
		System.out.println("총 합계 :\t\t\t" + sum );
	}

}
