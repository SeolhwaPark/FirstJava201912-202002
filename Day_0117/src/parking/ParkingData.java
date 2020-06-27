package parking;

/*출력
 * 자동차번호 주차시간 주차요금
 *	1234 	25 		500 
 */
public class ParkingData {
	Parking[] park;
	int arr[] = new int[100];
	int cnt;

	ParkingData() {
	}

	ParkingData(Parking[] p, int cnt) {
		park = p;
		this.cnt = cnt;
	}

	void dataPrint(Parking[] park, int cnt) {
		System.out.println("자동차번호\t주차시간\t주차요금");

		for (int x = 0; x < cnt; x++) {
			int parkTime = park[x].parkTime;
			if (parkTime < 10) { // 10분 미만일 때
				park[x].money = 0;
			} else if (parkTime >= 10 && parkTime < 30) { // 10분 이상 30분 미만이면
				park[x].money = 500;
			}
			if (parkTime >= 30) { // 30분 이상 주차시 10분 단위로 500원씩 추가
				park[x].money = ((parkTime - 30) / 10) * 500 + 500;
				if ((parkTime - 30) % 10 > 0)
					park[x].money = park[x].money + 500;
				// 주차시간 - 30분마다(30분 이하는 무료) 500원 추가
			}
			if (park[x].money >= 30000)
				park[x].money = 30000;// 30000원 이상이라도 30000원 냄
			if (parkTime >= 1440)
				park[x].money = 30000;// 하루 24시간 주차해도 최대 30,000원
		}

		for (int x = 0; x < cnt; x++) {
			System.out.print("");
			System.out.print("차량번호 : " + park[x].carNo+ "\t");
			System.out.print("주차시간 : " + park[x].parkTime + "\t");
			System.out.print("주차요금 : " + park[x].money + "\n");
		}
	}
	
	void data() {
		System.out.println("-----------정산----------");

		int sum = 0;
		for(int x=0; x<cnt; x++) {
			park[x].money+=cnt;
			cnt++;
			sum = park[x].money;
		}
		System.out.println("금일 총 주차대수 :" + cnt);
		System.out.println("총 주차요금 :" + sum);
	}
}
