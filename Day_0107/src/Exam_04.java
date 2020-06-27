import java.util.Scanner;

/*
 * 키보드 입력(2~ 100)
 * 입력값이 -99이면 종료 
 * 입력자료 중 소수만 구하여 출력(최대 5개를 찾아내서 종료)
 * 입력 : 5
 * . . .
 * 입력 : -99
 * 소수 : x x x x x
 * 
 */

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sosu[] = new int [5];
		int cnt = 0; //소수를 샐 갯수
		int a = 0; //소수 입력받을 변수
		while(true) {
			System.out.print("입력하세요 : ");
			a = scn.nextInt();
			if(a == -99) break; //-99이면 끝
        for (int i = 2; i < 100; i++) // 나눠지는 수를 반복문으로 탐색 2부터99까지
        {
                if(a%i ==0) {   //나머지가 0이면 약수이므로 count를 1증가 시킨다.{
                	if(i==a) {
                		sosu[cnt]=a;
                    	
                		cnt++;
                	}
                }
        	}
        }
/*
		int prime[] = new int[5];
		int cnt = 0;
		while(ture){
			System.out.print("입력 : ");
			int a = scn.nextInt();
			if(a == -99 || cnt == 5){
				break; //-99입력이 들어오거나 혹은 count가 5개가 되면 종료
			}
			if(a>=2 && a<=100){ //2이상 100이하일 때
				for(int x=2; x<=a; x++){ //2이상이
					if(a%x == 0){ //소수 아닐 때
						if(a == x){ //소수일 때
							prime[cnt] = a; //입력받은 수가 소수이고 
							cnt++;//소수갯수가 증가
							break; //입력받은 갯수만큼 소수가 나오면 끝
						}
						break;
					}
				}
			}else {
				System.out.print("입력오류"); //2이하 100이상이면 오류
			}
		}
			System.out.print("소수 : ");
			for(int x=0; x<cnt; x++){ //소수의 갯수만큼 
				System.out.print("prime[x] + "\t"); // 띄어쓰면서 출력
 */
		
		
	}
}
