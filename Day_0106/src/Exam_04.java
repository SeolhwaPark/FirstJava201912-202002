import java.util.Scanner;

/*
 * 키보드로 급여를 입력(1 ~ 500000) 
 * 입력자료가 -999 이면 종료 또는 인원수는 최대 10명
 * 
 * 50000 : xx 
 * 10000 : xx 
 * 5000 : xx 
 * 1000 : xx 
 * . . . . .
 * 1 : xx 
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		int t5 = 0;
		int t6 = 0;
		int t7 = 0;
		int t8 = 0;
		int t9 = 0;
		int t10 = 0;
		
		while(true) {
			System.out.print("급여를 입력하세요 : ");
			int money = scn.nextInt();
			cnt++;
			if(money == -999) break;
			int m = 50000; //화폐단위
			boolean sw = true; 
			
			for (int x=1; x<=10; x++) {
				int s = money/m;
				if(x==1) t1+=s;
				if(x==2) t2+=s;
				if(x==3) t3+=s;
				if(x==4) t4+=s;
				if(x==5) t5+=s;
				if(x==6) t6+=s;
				if(x==7) t7+=s;
				if(x==8) t8+=s;
				if(x==9) t9+=s;
				if(x==10) t10+=s;
			
				if(sw) { 
					money = money - (s*m); 
					m = m/5;
					sw = false;
				}else {
					money = money - (s*m);
					m = m/2;
					sw = true;
				}
			}
			if(cnt == 10) break;
		}
		System.out.println("5만원 : " + t1);
		System.out.println("만원 : " + t2);
		System.out.println("5천원 : " + t3);
		System.out.println("천원 : " + t4);
		System.out.println("5백원 : " + t5);
		System.out.println("백원 : " + t6);
		System.out.println("50원 : " + t7);
		System.out.println("10원 : " + t8);
		System.out.println("5원 : " + t9);
		System.out.println("1원 : " + t10);

/*
		int sum[] = new int[10]; 
		int total[] = new int[10];
		int inwon = 0;//배열이름 선언 10명분의 급여들어감
			
		while(true) {
			int kyuryo;
			int m = 50000; //지폐단위
			boolean sw = true;
			System.out.print("급여를 입력 하세요(1 ~ 500,000) >> ");
			kyuryo = sc.nextInt();
			
			if(kyuryo == -999) break; //입력자료가 -999 이면 종료
			if(inwon == -999) break; //입력자료가 -999 이면 종료
				
				for(int x = 0; x <= 9; x++) {
					
					int mok = kyuryo / m ; //지폐세기
					sum[x] = mok;
					
					if(sw) {
						kyuryo = kyuryo%m; //지폐세기
						m = m/5;
						sw = false;
					}else {
						kyuryo = kyuryo%m;//지폐세기
						m = m/2;
						sw = true;
					}
					total[x]= total[x]+sum[x];//지폐 총 수
				}
				inwon++;//10명에서 끝남
		}
	
		int m = 50000;
		boolean sw = true;
		
		for(int x = 0; x <= 9; x++) {
			System.out.println(m+" : "+total[x]);
			if(sw) {
				m = m/5;
				sw = false;
			}else {
				m = m/2;
				sw = true;
			}
			
		}
		System.out.println("인원 : "+inwon);
		
*/
		
	}
}
