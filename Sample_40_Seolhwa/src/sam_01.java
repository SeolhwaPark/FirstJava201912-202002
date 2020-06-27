import java.util.Scanner;

/*
 * 01. 조건문
 */
public class sam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력하세요 :");
		int a = scn.nextInt();
		
			if(a>=90 && a<=100) {
			System.out.println("수");}
			else if(a>=80 && a<=89) {
				System.out.println("우");
			}else if(a>=70 && a<=79) {
				System.out.println("미");
			}else if(a>=60 && a<=69) {
				System.out.println("양");	
			}else if(a>=0 && a<=59){
				System.out.println("가");
			}else {
				System.out.println("입력오류");
		}
	
	}

}
