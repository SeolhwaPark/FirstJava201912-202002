package Sawon;
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
 * ���
 * 
 * ���̵�		 ���		 �ñ� 		�ٹ��ð� 		�ְ��޿�
 * user01	 1		10000		25			
 * �հ�            		 ...      	...   		 ....
 * �ְ��޿��� ���� ���� �޴� ���
 * ���̵� 		�ְ��޿�
 */

import parking.Parking;

public class SawonPay {
	// ���

	Sawon[] sawo;
	int arr[] = new int[100];
	int cnt = 0;

	SawonPay() {
	}

	SawonPay(Sawon[] s, int cnt) {
		sawo = s;
		this.cnt = cnt;
	}

	void pay(Sawon[] sawo, int cnt) {
		for (int x = 0; x < cnt; x++) {
			if (sawo[x].level == 1) {// �ñ� ����� ����� 1����� ��� 10000�� 2����� ��� 5000�� 3����� ��� 2000��
				sawo[x].pay = 10000;

			} else if (sawo[x].level == 2) {
				sawo[x].pay = 5000;

			} else {
				sawo[x].pay = 2000;
			}
			if (sawo[x].time > 50)
				sawo[x].time = 50;
			if (sawo[x].time > 36) {// �ٹ��ð� 36�ð��� �ʰ��� ��� �ʰ��ٹ��ð��� 1.5�踦 �����ϸ� �ٹ��ð��� �ִ� 50�ð������� �����ȴ�
				sawo[x].weekPay = sawo[x].pay * 36 + (int) ((sawo[x].time - 36) * 1.5 * sawo[cnt].pay);
			} else {
				sawo[x].weekPay = sawo[x].pay * sawo[x].time;
			}
		}
	}

	void print() {
		System.out.println("���̵�\t���\t�ñ�\t�ٹ��ð�\t�ְ��޿�");
		for (int i = 0; i < cnt; i++) {
			System.out.print(sawo[i].id + "\t" + sawo[i].level + "\t" + sawo[i].pay + "\t");
			System.out.print(sawo[i].time + "\t" + sawo[i].weekPay + "\n");
		}
		int su = 0;
		int sum = 0;
		for (int x = 0; x < cnt; x++) {
			su += sawo[x].time;
			sum += sawo[x].weekPay;
		}
		System.out.println("*�հ� :\t\t\t" + su + "\t" + sum);

		System.out.println("*�ְ��޿��� ���� ���� �޴� ���");
		int max = 0;
		int a = 0;
		for (int j = 0; j < cnt; j++) {
			if (sawo[j].weekPay > max) {
				max = sawo[j].weekPay;
				a = j;
			}
		}
		System.out.println("���̵� :" + sawo[a].id + "\t�ְ��޿� :" + sawo[a].weekPay);
	}
}
