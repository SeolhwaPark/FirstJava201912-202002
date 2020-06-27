package student;

public class Student {
	int bun;
	String name;
	int[] score = new int[5];
	int tot;
	double ave;
	int rank;

	Student() {
	}

	Student(String[] s) {
		this.bun = Integer.parseInt(s[0]);
		this.name = s[1];
		for (int x = 0; x < 5; x++) {
			this.score[x] = Integer.parseInt(s[x + 2]);
			tot += score[x];
		}
		ave = ((int) (tot / 5. * 100)) / 100.;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return st.bun == bun;
		}
		return false;
	}

	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + score[0] + "\t" + score[1] + "\t" + score[2] + "\t" + score[3] + "\t"
				+ score[4] + "\t" + tot + "\t" + ave + "\t" + rank;

	}

}