package group;

//���
//(1)��ü��ȸ (2)�׷���ȸ (3)������ȸ (4)�̸���ȸ -> ���ý� �ش������ ���

//�׷������ ����
//�̸������� ����

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

	void totalPrint() { //��ü��ȸ
		for (int x = 0; x < cnt; x++) {
			ren[x].print();
		}
	}
		
	void groupPrint(String group) { //�׷���ȸ
		for (int x = 0; x < cnt; x++) {
			if(group.equals(ren[x].group))
			ren[x].print();
		}
	}

	void birthPrint(int seinen) { //������ȸ
		for (int x = 0; x < cnt; x++) {
			if(seinen == ren[x].seinen)
			ren[x].print();
		}
	}
	void namePrint() { //�̸���ȸ
		for (int x = 0; x < cnt; x++) {
			ren[x].print();
		}
	}

}
