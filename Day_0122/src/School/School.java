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

	// 석차 계산
	void cal() { // 계산
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

	// 번호 오름차순
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

	// 출력

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
