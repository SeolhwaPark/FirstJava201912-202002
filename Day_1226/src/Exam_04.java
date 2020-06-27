import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // 키보드입력할 때 System.in
		//new 생성에 필요한 연산자
		
		System.out.print("번호 입력 : ");
		int bun = scn.nextInt();
	
		System.out.print("이름 입력 : ");
		String name = scn.next();
		
		System.out.print("국어 점수 : ");
		double kor = scn.nextDouble(); // nextInt는 정수
		System.out.print("영어 점수 : ");
		double eng = scn.nextDouble();
		System.out.print("수학 점수 : ");
		double mat = scn.nextDouble();
		
		//int tot = (int)(kor + eng + mat); 
			double tot = kor + eng + mat;
			double ave = tot/3;
		
			System.out.println("성적표");
			System.out.println("번호\t 이름\t 총점\t 평균");
			System.out.println(bun + "\t" +name + "\t" +tot +"\t"+ ave );
		
	}

}
