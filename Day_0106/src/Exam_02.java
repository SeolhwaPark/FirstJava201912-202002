import java.util.Scanner;

/*
 * 키보드로 정수 (2 ~ 1000) 입력
 * 1) 2~입력값 까지의 소수만을 출력
 * 2) 한 줄에는 5개씩 출력
 * 3) 마지막에 소수의 개수 출력
 * 4) 예시
 *  입력 : 50
 *  
 *  2 3 5 7 11 
 * 13 .......
 * 
 * 소수 개수 :xx
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		
		int cnt = 0; //갯수
		int num; //입력값
		
		while(true) { //동안에 계속 반복 
			System.out.print("2~1000 사이의 정수 1개 입력 하세요(0을 입력 하면 종료) >> ");
			num = sc.nextInt();
			
			if(num == 0) break;// 입력이 0과 같을 때 종료
			
			if(num>=2 && num<=1000) { // 만약 2이상 1000이하면
				for(int j = 2; j <= num; j++) {//키보드입력 받은 걸 받은 만큼 앞에 있는 소수를 찾기 위해 만듬 //정해진 횟수를 반복
					for(int i = 2; i <= j; i++) { //
						if(j%i==0) {
							if(j==i) {//소수
								System.out.print(j+"\t"); //소수 2 3 4
								cnt++; //갯수증가
								if(cnt % 5==0) { //갯수 5개가 되면
									System.out.println(); // 줄바꿈
								}
								break; // for문 탈출
							}
							else break; // for문 탈출
							
						}
					}
					
				}
				System.out.println(num+"의 소수 갯수 : "+cnt);
			}else System.out.println("입력 오류!");
		}
		
*/		
		int pcnt = 0; //소수 갯수 카운트
		int num;
		while(true) {
			System.out.print("2 ~ 1000 소수만 입력하세요 : ");
			num = scn.nextInt();
			if(num >=2 && num <=1000) {
				break;
			}else {
				System.out.println("error 입력범위가 아닙니다");
			}
		}
			for(int i=2; i<=num; i++) {
				for(int x=2; x<=num; x++) {
					if(i%x == 0) {
						if(i == x) {
							System.out.print(i + "\t");
							pcnt++;
							if(pcnt%5 ==0) {
								System.out.println();
						}
							break;
					}
					else break;
					}	
				}
			}
			System.out.println("소수 갯수 : "+pcnt);
		
	}
}
