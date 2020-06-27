import java.util.Scanner;

/*
 * 키보드 입력 (100,000~ 1,000,000)
 * 입력자료가 -99 가 나오면 종료
 * 입력 : 234567
 * 입력 : 345434
 * . . . 
 * 입력 : -99
 * 총 급여 : xxxxxxx
 * 	50000	 10000	 5000	 1000	 500	 100	 50	 10	 5	 1
 *  필요장수
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		int money[] = new int[10];
		int total = 0;
		
		while(true) {
			System.out.print("입력 : ");
			int m = scn.nextInt();
			if(m==-99) {
				break;
			}
			total += m; //총급여
			boolean flag = true;
			int mon=50000;
			for(int x=0; x<10; x++) {
				money[x] += m/mon;
				m = m%mon;
				if(flag) {
					mon/=5;
					flag = false;
				}else {
					mon /=2;
					flag = true;
				}
			}
		}
		
		//출력
		System.out.println(money.length + "\t");
		System.out.println(total + "\t");

	}
}
