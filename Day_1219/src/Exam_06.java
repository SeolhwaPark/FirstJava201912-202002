import java.util.Scanner;

/*
 * ���� 2���Է� ũ�� ���ϱ�
 *  ��) 79,88 �Է½�
 *  => 79<=88
 *  
 *  70,60 �Է½�
 *  => 70>=60
 */ 

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("a=");
		int a=scn.nextInt();
		System.out.print("b=");
		int b=scn.nextInt();
		
		if(a>=b) {
			System.out.println(a+">="+b);
		}else {
			System.out.println(a+"<="+b);
		
		}
	
	}
}


