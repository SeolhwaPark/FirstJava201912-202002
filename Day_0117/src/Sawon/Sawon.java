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
 */
public class Sawon {
	//속성
	String id;
	int level;
	int pay;
	int time;
	int weekPay;
	
	Sawon(){
	}
	
	Sawon(String id, int level, int time){
		this.id = id;
		this.level = level;
		this.time = time;
	}
	
	void print() {
		System.out.print(id + "\t" + level + "\t" + pay + "\t" );
		System.out.print(time + "\t"+ weekPay + "\n");
	}
	
}
