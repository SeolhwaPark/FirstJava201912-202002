package rensyuu;

import java.util.Scanner;

/*
 * 1���� �迭�� �̿��� �˻�
 * 
 * 1. �����˻�
 * 2. �����˻�
 * 
 */
public class Sample_01 {
	public static void main(String[] args) {
		int [] score = {90,49,78,67,55,34,55,15,64,89};
		System.out.print("Data Print");
		for(int x = 0; x<score.length ; x++) {
			System.out.print(score[x] + ",");
		}
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("ã�� �� :");
		int var = scn.nextInt();
		boolean flag = false;
		
		for(int x = 0; x<score.length; x++) { //�����˻���
			if(var == score[x]) {
				System.out.println(var + "�� " + x + "��°�� ����");
				flag = true;
				break;
			}
		}
		if(!flag) { //������ ���� ����
		System.out.println(var + "�� ����");
		}
	}

}
