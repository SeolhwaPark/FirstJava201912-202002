import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
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
	}
}