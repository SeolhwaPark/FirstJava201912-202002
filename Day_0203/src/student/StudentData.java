package student;

import java.util.List;

public class StudentData {
	Student[] s;
	List list;
	int cnt;
	
	StudentData() {
	}

	StudentData(List list) {
		this.list = list;
		studentPrint();
	}

	// ���� ���
	void cal() { 
		for (int x = 0; x < cnt; x++) {
			int rank = 1;
			for (int y = 0; y < cnt; y++) {
				if (s[x].tot < s[y].tot) {
					rank++;
				}
				s[x].rank = rank;
			}
		}
	}
	

	private void studentPrint() {
		System.out.println("��ȣ\t�̸�\t����1\t����2\t����3\t����4\t����5\t�հ�\t���\t����");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
}
