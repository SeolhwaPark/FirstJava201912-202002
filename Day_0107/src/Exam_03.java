import java.util.Scanner;
/*
 * 키보드로 입력(1~100) 최대 10개 입력
 *  단, 짝수만 출력
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
/*		for(int x=0; x<10; x++) {
			System.out.print("입력 : ");
			int a = scn.nextInt();
			if(a%2==0) {
				System.out.print(a);		
			}
		}
*/	
		int val[] = new int[10]; //배열 선언
		
		//입력작업
		for(int x=0; x<10; x++) { //10개 입력할 수 있게 반복 됨
			System.out.print("입력 : ");
			int a = scn.nextInt();
			val[x] = a;
			//val[x] = scn.nextInt();

		}
		//입력된 자료를 모두 출력
		System.out.print("입력자료 : ");
		for(int x=0; x<10; x++) {
			System.out.print(val[x] + "\t");
		}
		//짝수만 출력
		System.out.println("\n 짝수 : ");
		for(int x=0; x<10; x++) {
			if(val[x]%2==0) { //짝수는 2로 나눳을때 0가 나옴
				System.out.print(val[x] + "\t");
			}
		}
	}
}
