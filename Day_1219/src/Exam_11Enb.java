import java.util.Scanner;

/*	세 개의 정수를 입력 받아 대, 중, 소 찾아 출력해보기
 * 
 */
public class Exam_11Enb {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt();
		int b= scn.nextInt();
		int c= scn.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("Max="+a);
				if(b>c) {
					System.out.println("Me="+b);
					System.out.println("Min="+c);
				}else {
					System.out.println("Me="+c);
					System.out.println("Min="+b);
				}
			}else {
				System.out.println("Max="+c);
				System.out.println("Me="+a);
				System.out.println("Min="+b);
			}
		}else if(b>c) {
			System.out.println("Max="+b);
			if(a>c) {
				System.out.println("Me="+a);
				System.out.println("Min="+c);
			}else {
				System.out.println("Me="+c);
				System.out.println("Min="+a);
			}
		}else {
			System.out.println("Max="+c);
			System.out.println("Me="+b);
			System.out.println("Min="+a);
		}

		
	}
	
}
