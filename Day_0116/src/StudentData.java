/*
 * 성적처리
 * 
 */
public class StudentData {
	Student[] std;
	int cnt; // 실제인원수

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
			for (int y = 0; y < cnt; y++) {// 자기 자신과 비교를 한 번함
				if (std[x].tot < std[y].tot) {// 총점을 기준으로 할 때
					r++;// 자기자신을 증가
				}
			}
			std[x].rank = r;
		}
	}

	// 석차를 기준으로 오름차순
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

	// 출력
	void dataPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
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