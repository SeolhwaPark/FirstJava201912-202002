import java.util.Scanner;

/* 키보드로 10개의 점수를 입력 받아서
 * 배열에 저장 후 총점,평균을 구하여 출력
 */

public class Exam_03 {
	public static void main(String[] args) {
		// 입력 작업
		Scanner scn = new Scanner(System.in);
		int var[] = new int[10];
		for(int i=0; i<10; i++) { // 반복횟수 정해져있음
			System.out.print("점수 (" + (i+1) + ") : "); //*****************
			var[i] = scn.nextInt();
		}							
		// 출력 작업
		int tot=0;
		for(int i=0; i<10; i++) {
			tot = tot + var[i];
			System.out.println(var[i] + "\t");
		}
		System.out.println("\ntot = " + tot); // 합
		System.out.println("ave = " + (tot/10)); //평 균
	}
}
