import java.util.Scanner;

/*
 * ������ ������ Ű����� �Է� �� �� �� ���
 * ��, ������ ���� ����
 * 
 */
public class Exam_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����a=");
		int a = scan.nextInt();
		System.out.print("����b=");
		int b = scan.nextInt();
		System.out.print("����c=");
		int c = scan.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("max :"+ a);
				if(b>c) {
					System.out.println("me :"+ b);
					System.out.println("min :"+ c);
			  	}else {
					System.out.println("me :"+ c);
					System.out.println("min :"+ b);
			 	}
			}else {
				System.out.println("max :"+ c);
				System.out.println("me :"+ a);
				System.out.println("min :"+ b);
			 	}
			}else if(b>c){
				System.out.println("max :"+ b);
				if(a>c){
					System.out.println("me :"+ a);
					System.out.println("min :"+ c);
					}else {
						System.out.println("me :"+ c);
						System.out.println("min :"+ a);
					}
			}else {
				System.out.println("max :"+ c);
				System.out.println("me :"+ b);
				System.out.println("min :"+ a);
			}
	}
	
}	