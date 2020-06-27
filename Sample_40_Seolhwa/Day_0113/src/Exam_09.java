import java.util.Scanner;

/*
 * 키보드로 사원번호, 이름 , 급여를 입력 (5명)
 * 입력 : 1101 홍길동 345678
 * 입력 : 1101 홍길둥 345678
 *  . . . . 
 * 입력 : -99
 * 
 * 출력
 * 사번 이름 급여 50,000 10,000 5,000.....1
 *  . . . . 
 *  1.필요항목 - 입력데이터출력
 */

class Sawon {
	int sabun;
	String name;
	int pay;
	int money[] = new int[10]; // 50000~1

	void count() {
		int temp = pay;
		int mon = 50000;
		boolean flag = true;
		
		for (int x = 0; x < money.length; x++) {
			money[x] = temp / mon;
			temp = temp % mon;
			if (flag) {
				mon /= 5;
				flag = false;
			} else {
				mon /= 2;
				flag = true;
			}
		}
	}
}
	public class Exam_09 {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			Sawon[] sa = new Sawon[5];
			Sawon s;
			for (int x = 0; x < sa.length; x++) {
				System.out.print("입력 :");
				s = new Sawon();
				s.sabun = scn.nextInt();
				s.name = scn.next();
				s.pay = scn.nextInt();
				s.count(); // 화폐매수
				sa[x] = s; // 1번지

			}
			System.out.println("사번\t이름\t급여\t50000\t10000\t5000\t1000\t500\t100\t50\t10\t5\t1");
			for (int x = 0; x < sa.length; x++) {
				System.out.print(sa[x].sabun + "\t");
				System.out.print(sa[x].name + "\t");
				System.out.print(sa[x].pay + "\t");

				for (int y = 0; y < sa[x].money.length; y++) {
					System.out.print(sa[x].money[y] + "\t");
				}
				System.out.println();
			}
	}

}