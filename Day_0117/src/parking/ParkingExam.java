package parking;

import java.util.Scanner;

/*입력
 *주차정보 : 1234 25
 *추차정보 : 0000 -> 입력종료
 *
 */
public class ParkingExam {
	public static void main(String[] args) {
		//입력
		Scanner scn = new Scanner(System.in);
		System.out.println("차량번호 및 주차시간(분단위)을 입력하세요 ");
		Parking park[] = new Parking[100];
		Parking p = new Parking();
		int cnt = 0;
		
		while(cnt<100) {
			System.out.print("주차정보 : ");
			String carNo = scn.next();
			if(carNo.equals("0000"))break;
			int parkTime = scn.nextInt();
			park[cnt] = p;
			park[cnt] = new Parking(carNo, parkTime);
			cnt++;
			}
		
		ParkingData data = new ParkingData(park, cnt);
		data.dataPrint(park, cnt);
	
	}
}