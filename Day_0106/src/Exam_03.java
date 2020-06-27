import java.util.Scanner;

/*
 * 월급 지폐나누기(?) 계산
 * M = 327658
 * s= m/50000
 * M=M-(s*50000)
 * 
 * s=m/10000
 * M=M-(s*5\10000)
 * 
 * s=m/5000
 * M=M-(s*5000)
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*
	System.out.print("월급 입력 >> ");
		int money = sc.nextInt();
		int m = 50000; // 화폐단위
		boolean sw = true; //논리 
		
		for(int x = 1; x <= 10; x++) {
			int s = money / m ;
			System.out.println(m+" : "+s);
			if(sw) {
				money = money-(s*m); // money = money % m; (나머지 연산자가 없을때)
				m = m/5;
				sw = false;
			}else {
				money = money-(s*m);
				m = m/2;
				sw = true;
			}
		}
*/
		System.out.print("월급 입력 : ");
		int money = scn.nextInt(); //받을 사람
		int m = 50000; //화폐단위
		boolean sw = true; //switch처럼 논리적임 2가지 패턴만 있음
		
		for (int x=1; x<=10; x++) { //지폐종류는 10개니까
			int s = money/m;//지폐몇장인지 출력하려면 돈과 화폐단위를 나눔
			System.out.println(m + ":" + s);
			
			if(sw) { 
				money = money - (s*m); //나머지 money = money%m;
				m = m/5; //화폐단위를 5로 나누어 떨어지면 50000~5단위의 애들
				sw = false;
			}else {
				money = money - (s*m);//나머지
				m = m/2; //2로 나눌 수 있으면 10000~1단위의 애들
				sw = true;
			}
		}
	}
}
