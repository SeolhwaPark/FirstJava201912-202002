
public class SawonData {
	void sourceDataPrint(Sawon[] s, int cnt) {
		System.out.println("��� \t�̸� \t�޿�");
		
		for (int i = 0; i < cnt; i++) {
			s[i].print();
		}
	}
	
	void sortDataPrint(Sawon[] s, int cnt, int n) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (n == 1) {
					if (s[i].pay > s[j].pay) { // �޿� ��������
						Sawon temp = s[i]; // �ּ�
						s[i] = s[j];// �ּҹٲٱ�
						s[j] = temp;
					}
				} else {
					if (s[i].pay < s[j].pay) { // �޿� ��������
						Sawon temp = s[i]; // �ּ�
						s[i] = s[j]; // �ּҹٲٱ�(��ü�� ��ü�ٲٱ�)
						s[j] = temp;
					}
				}
			}
		}
	}
	
}