import java.util.Scanner;

/* 번호 이름 국어점수 영어점수 수학점수를
 * 입력받아서 총점 평균을 계산하여 출력
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.print("번호 :");
		int bun = scn.nextInt();
		System.out.print("이름 :");
		String irum = scn.next();
		System.out.print("국어점수 :");
		int kor = scn.nextInt();
		System.out.print("영어점수 :");
		int eng = scn.nextInt();
		System.out.print("국어점수 :");
		int mat = scn.nextInt();
		
		int tot=kor+eng+mat;
		double ave = tot/3.;
		
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+irum+"\t"+tot+"\t"+ave+"\t");
		

	}

}
