package Stu;
/*
 * �Է¿���
 * �Է� : 5,ȫ�浿,90,90,80
 * 
 *  * ó������
 * �л��ο��� �ִ� 10��
 * �Է��ڷ�� ��ȣ�� �������� �Էµ�
 * �Է� �׸� ��ȿ�� �˻縦 �����Ѵ�
 *  ��ȣ�� 1~10 �Է¿���ó���� ��ȣ �����Դϴ�. �ٽ� �Է¹޾ƾ���
 *  �̸��� 1~10���̳�
 *  �� ������ 0~100������ ���� �̾�� �Ѵ�.
 *  ��½� ��ȣ�� �������� ����������� 
 *  
 *  
 */

import java.util.Scanner;


public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student st[] = new Student[10];
		int cnt = 0;
		while (cnt < 10) { //�ִ� 10��
			System.out.print("�Է� :"); //�������� �Է�
			String[] s = scn.nextLine().split(","); //�Է¹��� �� �ϳ��� �迭�� �����
			if (s[0].equalsIgnoreCase("end"))break;		
			st[cnt] = new Student(s[0],s[1],s[2],s[3],s[4]);
			cnt++;
		}	
		/*
			for (int x = 0; x < cnt; x++) {
				if (st[x].bun == cnt) {
					//��ȣ
				} else {
					System.out.println("�����Դϴ�! �ٽ� �Է��ϼ���.");
				}else if(){
				
				}
		
			}
		}
		*/

		School data = new School(st, cnt);
		data.testPrint();
		data.SchoolPrint();
		data.cal();
	}

}