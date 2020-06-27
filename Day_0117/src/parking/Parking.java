package parking;
/*
 * 주차장에 주차된 차량들에 대한 주차요금을 계산
 * 
 * 주차장에 주차된 차량들의 관리항목
 * 자동차번호 주차시간 (분단위) 주차요금
 * 
 * 처리조건
 * 주차가능시간은 최대하루 24시간으로 한다
 * 주차요금은 10분미만을 무료, 30분까지 500
 * 30분 이후부터는 10분당 500씩 추가
 * 하루주차요금은 최대 30000
 * 30000초과해도 30000만 징수
 * 
 * 주차가능차량은 100대 미만
 */
public class Parking {
	String carNo;
	int parkTime;
	int money;
	
	Parking(){}
	
	Parking(String carNo, int parkTime){
		this.carNo = carNo;
		this.parkTime = parkTime;
	}
	
	void parkingPrint() {
		System.out.print(carNo + "\t" + parkTime + "\t" + money + "\n");
	}
	
}
