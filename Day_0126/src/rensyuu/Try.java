package rensyuu;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {

		int a = 10;
		Scanner scn = new Scanner(System.in);
		try {
			
			a =scn.nextInt();
			
			
		}catch(Exception e){
			 System.out.println("�����Դϴ�");
			 
			
		}finally{
			System.out.println("�����´�");
		}

	}

}
