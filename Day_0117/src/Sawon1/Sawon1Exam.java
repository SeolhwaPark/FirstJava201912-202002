package Sawon1;

import java.util.Scanner;

import Sawon.Sawon;
import Sawon.SawonPay;
/*
 * Ű����� ��������� �Է¹޾Ƽ� �μ��� �޿��հ踦 ���
 * 
 * ������� : �μ��� �����ȣ ����̸� �޿�
 * �Է��ڷ� ���� �Է��� �μ������� �Է�
 * ������� : �λ� 1101 AAAA 358000
 * 
 * �μ����� "end" �Ǵ� "END"�̸� ��ü�ڷ� ��� �� ����
 * �μ��� ������ ��� ù��° ����� �μ����� ���
 * �μ��� �ٲ�鼭 �μ��� �޿� �հ� ���
 * ���������� ��ü �޿��հ踦 ����Ѵ�
 */
public class Sawon1Exam {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		
		System.out.println("  **�޿��������α׷�**");
		System.out.println("�μ����� �μ���,�����ȣ,����̸�,�޿��� �Է��ϼ��� ");
		
		Sawon1 sawon[] = new Sawon1[100];
		int cnt = 0;

		while(cnt<100) {
			
			System.out.print("������� :");
			String busyo = scn.next();
			if(busyo.equals("end")||busyo.equals("END"))break;
			String sabun = scn.next();
			String name = scn.next();
			int pay = scn.nextInt();
			sawon[cnt] = new Sawon1(busyo,sabun,name,pay);
			cnt++;
		}
		
		Sawon1Data saw = new Sawon1Data(sawon,cnt);
		saw.dataPrint();
		
	//	saw.payPrint();
	}
}
