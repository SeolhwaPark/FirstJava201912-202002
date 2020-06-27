/*
 * ����ó��
 * 
 */
public class StudentData {
	Student[] std;
	int cnt; // �����ο���

	StudentData() {
	}

	StudentData(Student[] s, int cnt) {
		std = s;
		this.cnt = cnt;
		//studentRank();

		dataPrint();
	}

	void studentRank(Student[] student, int cnt) {
		for (int x = 0; x < cnt; x++) {
			int r = 1;
			for (int y = 0; y < cnt; y++) {// �ڱ� �ڽŰ� �񱳸� �� ����
				if (std[x].tot < std[y].tot) {// ������ �������� �� ��
					r++;// �ڱ��ڽ��� ����
				}
			}
			std[x].rank = r;
		}
	}

	// ������ �������� ��������
	void rankSort(Student[] s, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if(std[i].rank > std[j].rank) {
				Student tem = std[i];
				std[i] = std[j];
				std[j] = tem;
				}
			}
		}
	}

	// ���
	void dataPrint() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for (int x = 0; x < cnt; x++) {
			/*
			 * System.out.print(std[x].number + "\t"); System.out.print(std[x].name + "\t");
			 * System.out.print(std[x].kor + "\t"); System.out.print(std[x].eng + "\t");
			 * System.out.print(std[x].mat + "\t"); System.out.print(std[x].tot + "\t");
			 * System.out.print(std[x].ave + "\t"); System.out.print(std[x].rank + "\n");
			 */
			std[x].studentPrint();
		}
	}
}