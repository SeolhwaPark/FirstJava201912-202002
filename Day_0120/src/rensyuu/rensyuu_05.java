package rensyuu;

import java.util.Scanner;

/*
 * Ű�����Է� �ִ� 10��
 * �Է� ���� -99�̸� ���
 * 
 * 
 * ��� ��
 * 	20
 * +30
 * +50
 * +60
 * ----
 * XXX
 * 
 */
public class rensyuu_05 {
	//���
	static void print(int score[],int cnt) {
		int sum = 0;
		System.out.println(" " + score[0]);
		for(int x = 1; x < cnt; x++) {
			sum += score[x];
			System.out.println("+" + score[x]);
		}
		System.out.println("-=-=-");
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//�Է�
		int [] score = new int[10];
		int cnt = 0;
		System.out.print("�Է� :");		
		do {
			score[cnt] = scn.nextInt();
			if(score[cnt] == -99) break;
		    cnt++;
		}while(cnt<10);
		
		//ȣ��
		print(score,cnt-1);
		
	}

}
