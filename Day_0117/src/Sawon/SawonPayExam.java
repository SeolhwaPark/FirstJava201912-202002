package Sawon;

import java.util.Scanner;

import parking.Parking;

/*
 * �� ����� ���̵� ��� �ٹ��ð��� �Է¹޾� ����鿡 ���� �ְ� �޿��� ����ϴ� ���α׷��� �ϼ�
 * 
 * ��������׸�
 * ���̵� ��� �ñ� �ٹ��ð� �ְ��޿�
 * 
 * ó������
 * ����� �ְ��޿��� �ٹ��ð��� �ñ��� ���� ������ �Ѵ�
 * �ñ��� ����� ����� 1����� ��� 10000�� 2����� ��� 5000�� 3����� ��� 2000��
 * �ٹ��ð��� 36�ð��� �ʰ��� ��� �ʰ��ٹ��ð��� 1.5�踦 �����ϸ� �ٹ��ð��� �ִ� 50�ð������� �����ȴ�
 * ����� ���̵� "end"�� �ԷµǸ� �ڷ���� �������� �޿����հ� ����� ����Ѵ�.
 * 
 * ������� : user01 1 25
 */
public class SawonPayExam {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		System.out.println("�������");
		System.out.println("�� ����� ���̵�,���,�ٹ��ð��� �Է��ϼ��� ");
		Sawon sawo[] = new Sawon[100];
		int cnt = 0;
		
		while(cnt<100) {
			System.out.print("������� :");
			String id = scn.next();
			if(id.equals("end"))break;
			int level = scn.nextInt();
			int time = scn.nextInt();
			sawo[cnt] = new Sawon(id, level, time);
			cnt++;
		}
		
		SawonPay sp = new SawonPay(sawo,cnt);
		sp.pay(sawo, cnt);
		sp.print();
	}

}
