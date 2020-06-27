package School;

public class School {
	Student[] student;
	int cnt;

	School() {
	}

	School(Student[] stu, int cnt) {
		student = stu;
		this.cnt = cnt;
	}

	// ���� ���
	void cal() { // ���
		for (int x = 0; x < cnt; x++) {
			int rank = 1;
			for (int y = 0; y < cnt; y++) {
				if (student[x].tot < student[y].tot) {
					rank++;
				}
				student[x].rank = rank;
			}
		}
	}

	// ��ȣ ��������
	void sort() {
		for (int x = 0; x < cnt - 1; x++) {
			for (int y = x + 1; y < cnt; y++) {
				if (student[x].bun > student[y].bun) {
					Student temp = student[x];
					student[x] = student[y];
					student[y] = temp;
				}
			}
		}
	}

	// ���

	void SchoolPrint() {
		this.cal();
		this.sort();
		
		for (int x = 0; x < cnt; x++) {
			System.out.print(student[x].bun + "\t" + student[x].name + "\t" + student[x].kor + "\t" + student[x].eng
					+ "\t" + student[x].mat + "\t");
			System.out.println(student[x].tot + "\t" + student[x].ave + "\t" + student[x].rank);
		}
	}
}
