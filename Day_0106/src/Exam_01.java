import java.util.Scanner;

/*
 * 소수판별
 * 소수 = 자신과 같은 숫자로 나눠떨어짐
 * 소수아니면 다른 숫자랑 나눠서 0이 나옴
 * 
 * 키보드입력
 * 1) -99가 입력시 프로그램 종료
 * 2) 입력범위는 2 ~ 100
 * 3)입력자료중 소수의 갯수와 합을 구하여 출력
 * 
 * 입력 : -6
 * 입력 오류 ---> 입력자료가 아님
 * 입력 : 3,
 * . . . .
 * 7,15,67,45,38
 * 입력 : -99
 * 입력 자료 수 : xx (입력오류는 갯수에 안들어감)
 * 소수 갯수 : xx
 * 소수합계 : xx
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tcnt = 0; //입력자료수 카운트
		int pcnt = 0; //소수 갯수 카운트
		int psum = 0; //합계 소수만
		
		while(true) {
			System.out.print("2 ~ 100 입력하세요 : ");
			int val = scn.nextInt();
			if(val==-99){ //소수
				break;
			}
			if(val >=2 && val <=100) {
				tcnt++;//소수판별 
				
				for(int x=2; x<=val; x++) {
					if(val%x == 0) { // 나누어지면
						if(val == x) { //자기자신이면 소수
							pcnt++;
							psum += val;
							
						}
					//소수도 소수가 아닌 수도 수행되니까 break
					break;	
					}//딱히 else 필요없는 버전
				}
			}else {
					System.out.println("error 입력범위가 아닙니다");
				}
			}
		
			System.out.println("입력 자료 수 : "+ tcnt);
			System.out.println("소수 자료 수 : "+ pcnt);
			System.out.println("소수 합계 : "+ psum);
	}
}
