package Sawon1;

import Sawon.Sawon;

/*
 *  * �޿��������α׷�
 * �μ���  ���    �̸�    �޿�
 * �λ� 	1101 AAAA 358000
 * 	  	1101 AAAA 358000
 * �հ�			  358000
 * �ѹ� 	1101 AAAA 358000
 *    	1101 AAAA 358000
 *    	1101 AAAA 358000
 * �հ� 			  358000
 * ����	1101 AAAA 358000
 * �հ�			  358000 
 * ���հ�			  358000
 */
public class Sawon1Data {
	// ���
	Sawon1[] saw;
	int arr[] = new int[100];
	int cnt = 0;
	int bun;
	String name;

	Sawon1Data() {
	}

	Sawon1Data(Sawon1[] sa, int cnt) {
		saw = sa;
		this.cnt = cnt;
		
	}

	void dataPrint() {
		// �հ�
		// �μ����� ���
		System.out.println("�μ���\t���\t�̸�\t�޿�\t5����\t����\t5õ��\tõ��\t5���\t���\t5�ʿ�\t�ʿ�\t5��\t1��");
		int sum = saw[0].getPay(); // ���հ躯��
		int bu = saw[0].getPay(); // �μ��հ�
		int syou;
		int amari;
		int sihei = 50000;
		int kane = saw[0].getPay();
		boolean sw = true;
		
		System.out.print(saw[0].getBusyo() + "\t" + saw[0].getSabun());
		System.out.print("\t" + saw[0].getName() + "\t" + saw[0].getPay());
		saw[0].print();
		
		for (int i = 1; i < cnt; i++) {
			if (saw[i].getBusyo().equals(saw[i - 1].getBusyo())) {
				System.out.print("\t" + saw[i].getSabun());
				System.out.print("\t" + saw[i].getName() + "\t" + saw[i].getPay()+"\t");
				saw[i].print();
				bu += saw[i].getPay();
				
			} else {
				System.out.println("�հ�\t\t\t" + bu);
				bu = saw[i].getPay();
				System.out.print(saw[i].getBusyo() + "\t" + saw[i].getSabun());
				System.out.print("\t" + saw[i].getName() + "\t" + saw[i].getPay() + "\t");
				saw[i].print();
			}
			sum += saw[i].getPay();
		}
		
		System.out.println("�հ�\t\t\t" + bu);
		System.out.println("�� �հ� :\t\t\t" + sum );
	}

}
