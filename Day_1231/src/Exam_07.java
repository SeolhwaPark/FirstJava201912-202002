import java.util.Scanner;

/*
 * 키보드로 10개의 정수 data 입력
 * 합계를 출력
 * 
 * GC 가비지콜렉션 = 메모리관리기능
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s =0; //합계를 위해 변수 초기화
		int i = 0;//누적형 변수. 누적형이라 초기화 불필요
		//int a; 대입형 변수
		while(true) {
			System.out.println("입력해주세요 : ");
			int a = scn.nextInt();//반복해야할 대상
			s+=a; // s = s + a
			i++; // i = i + 1;
			if(i==10) break;
		}
		System.out.println(s);//sum
	}

}
