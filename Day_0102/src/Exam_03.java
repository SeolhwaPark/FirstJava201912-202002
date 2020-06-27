import java.util.Scanner;

/*주차요금 계산 프로그램 작성 (if문 사용)
 *  키보드로 차량번호, 주차시간(분)을 입력
 *  예) 차량번호 : 1234
 * 		주차시간 : 42 분
 * 
 * 		주차요금 계산       ((((72분이면 3,000원
 * 		차량번호 요금
 * 		1234	1,500원
 * 
 *  - 주차 가능시간은 최대 하루 (24)
 *  
 * 	- 주차요금은 10분미만시 무료, 30분까지 500원,
 * 		30분 이후 부터 10분당 500원 계산
 * 
 * 	- 하루 주차요금은 최대 30,000원으로 계산하며
 * 		30,000원 초과요금은 징수하지 않음
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("차량번호 : ");
		int number = scn.nextInt();
		System.out.print("주차시간(분) : ");
		int minu = scn.nextInt();
		int pay = 0; //지불할 요금
		
		if(minu < 10) { //10분 미만일 때
			pay = 0;
		}else if(minu >= 10 && minu < 30){ //10분 이상 30분 미만이면
			pay = 500;
		}
			if(minu < 30) { //30분 이상 주차시 10분 단위로 500원씩 추가
				pay = ((minu-30)/10)*500 + 500; 
				//주차시간 - 30분(30분 이하는 무료) 10씩을 나누고 500원을 곱하고 더함
				if((minu-30)%10>0) pay = pay + 500;
				//주차시간 - 30분(30분 이하는 무료) 500원 추가
			}
			if(pay >= 30000) pay = 30000;//30000원 이상이라도 30000원 냄
			if(minu >= 1440)pay += 30000 * minu;//하루 24시간 주차해도 최대 30,000원

		System.out.print("");
		System.out.println("차량번호 : "+ number);
		System.out.println("주차요금 : "+ pay + "원");
	}

}