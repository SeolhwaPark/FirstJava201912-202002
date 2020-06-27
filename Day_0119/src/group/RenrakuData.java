package group;

//출력
//(1)전체조회 (2)그룹조회 (3)생일조회 (4)이름조회 -> 선택시 해당사항을 출력

//그룹순으로 정렬
//이름순으로 정렬

public class RenrakuData {

	Renraku ren[];
	int cnt = 0;
	String group;
	String name;
	int bangou;
	int seinen;

	RenrakuData() {
	}

	RenrakuData(Renraku[] re, int cnt) {
		ren = re;
		this.cnt = cnt;
	}

	void totalPrint() { //전체조회
		for (int x = 0; x < cnt; x++) {
			ren[x].print();
		}
	}
		
	void groupPrint(String group) { //그룹조회
		for (int x = 0; x < cnt; x++) {
			if(group.equals(ren[x].group))
			ren[x].print();
		}
	}

	void birthPrint(int seinen) { //생일조회
		for (int x = 0; x < cnt; x++) {
			if(seinen == ren[x].seinen)
			ren[x].print();
		}
	}
	void namePrint() { //이름조회
		for (int x = 0; x < cnt; x++) {
			ren[x].print();
		}
	}

}
