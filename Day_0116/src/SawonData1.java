
public class SawonData1 {
	Sawon1[] sa;
	int sum;
	int arr[] = new int [10];

	void DataPrint(Sawon1[] sawon, int cnt) {
		System.out.println("���\t�̸�\t�޿�\t5����\t����\t5õ��\tõ��\t5���\t���\t5�ʿ�\t�ʿ�\t5��\t1��");

		for (int i = 0; i < cnt; i++) {
			sawon[i].print();
		}
		System.out.print("\t�հ�"+"\t"+sum + "\t");
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i]+"\t");
	}
}

	void payPrint(Sawon1[] sawon, int cnt) { // �հ�,�� �ż�
		sa = sawon;
		boolean sw = true;
		for (int y = 0; y < cnt; y++) {
			int pay = sa[y].pay;
			int m = 50000; // ȭ�����
			for (int x = 1; x <= 10; x++) {
				int s = pay / m;
				if (x == 1)
					sa[y].t1 += s;
				if (x == 2)
					sa[y].t2 += s;
				if (x == 3)
					sa[y].t3 += s;
				if (x == 4)
					sa[y].t4 += s;
				if (x == 5)
					sa[y].t5 += s;
				if (x == 6)
					sa[y].t6 += s;
				if (x == 7)
					sa[y].t7 += s;
				if (x == 8)
					sa[y].t8 += s;
				if (x == 9)
					sa[y].t9 += s;
				if (x == 10)
					sa[y].t10 += s;

				if (sw) {
					pay = pay - (s * m);
					m = m / 5;
					sw = false;
				} else {
					pay = pay - (s * m);
					m = m / 2;
					sw = true;
				}
			}	
		}
		for(int x = 0; x<cnt; x++) {
			sum+=sa[x].pay;
			arr[0] += sa[x].t1;
			arr[1] += sa[x].t2;
			arr[2] += sa[x].t3;
			arr[3] += sa[x].t4;
			arr[4] += sa[x].t5;
			arr[5] += sa[x].t6;
			arr[6] += sa[x].t7;
			arr[7] += sa[x].t8;
			arr[8] += sa[x].t9;
			arr[9] += sa[x].t10;
			}
		}
		
//		System.out.println("5����\t����\t5õ��\tõ��\t5���\t���\t50��\t10��\t5��\t1��");
	}

