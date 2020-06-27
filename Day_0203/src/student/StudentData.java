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

	// 석차 계산
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
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t합계\t평균\t석차");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
	}
}
