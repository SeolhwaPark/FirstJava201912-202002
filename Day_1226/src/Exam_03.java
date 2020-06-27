import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in); //객체를 생성
		
		int a = scn.nextInt(); //정수만 입력시 씀 
		System.out.println("a =" + a);
		
		double b = scn.nextDouble(); //실수만 입력시 씀
		System.out.println("b =" + b);
		
		String c = scn.next(); // 문자열 입력시 ㅆ,ㅁ. 
		System.out.println("c =" + c); // 공백도 들어감
		
		//String d = scn.nextLine(); //문자열 입력시 씀
		//System.out.println("d =" + d); // 한줄을 통째로 입력. 공백도 들어감
		
		//a = 10;
		//System.out.println("a =" + a);
		//System.out.println("scn =" + scn);

	}

}
