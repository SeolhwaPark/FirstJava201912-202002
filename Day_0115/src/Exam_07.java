import java.util.Scanner;
// 급여를 오름차순으로 출력

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sa[] = new Sawon[10]; //객체10명분의 배열
		int cnt = 0;
		
		while (cnt<10) {
			System.out.print("입력하세요 :");
			int s = scn.nextInt();
			if(s == -99)break;
		
		String n = scn.next();
		int p = scn.nextInt();
		sa[cnt] = new Sawon(s,n,p);
		cnt++;
		}
		
		SawonData saD = new SawonData();
		saD.sourceDataPrint(sa,cnt); //sa 참조에 의한 호출
		
		System.out.print("정렬기준 급여(1/2) :");
		int n = scn.nextInt();
	
		saD.sortDataPrint(sa,cnt,n); // n=1 오름, n=2 내림
		saD.sourceDataPrint(sa,cnt);
	
	}

}
