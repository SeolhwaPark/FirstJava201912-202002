package rensyuu;

import java.util.Scanner;

/*
 * Ű����� 5�� ������ �Է�
 * ������ ���� ���
 * �Է� : 10 20 30 40 50
 * 
 * 10+20+30+40+50 = 150
 *  */

public class rensyuu_04 {
	static void print(int a[]) {
		int s = 0;
		for(int x = 0 ; x < a.length-1; x++) {
			s += a[x];
			System.out.println(a[x] + "+");
		}
		s += a[a.length+1];
		System.out.print(a[a.length-1] + " = ");
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		
		System.out.print( "�Է��ϼ��� :");
		for(int x = 0; x<5; x++) {
			score[x] = scn.nextInt();
			
		}
		
		print(score);
	}

}
