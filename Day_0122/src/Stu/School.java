package Stu;
/* ��¿���
* ��ȣ �̸� ���� ���� ���� ���� ��� ����
*/
public class School {
	
	Student[] stu;
	int cnt;
	
	School(){}
	School(Student[] st, int cnt){
		stu = st;
		this.cnt = cnt;
	}
	//����׽�Ʈ
	
	void testPrint() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x = 0; x<cnt; x++) {
			System.out.print(stu[x].bun + "\t" + stu[x].name + "\t" + stu[x].kor+ "\t" );
			System.out.print(stu[x].eng + "\t" + stu[x].mat +"\n"  );

		}
		System.out.println("--------------------------------------------------");
	}
	
	void cal() { //���
		for(int x= 0; x<cnt; x++) {
			stu[x].sum = stu[x].kor + stu[x].eng + stu[x].mat;
			stu[x].ave = stu[x].sum/3.;
		}
		for(int x= 0; x<cnt; x++) {
			for(int y=0; y<cnt; y++) {
			int rank = 1;
				if(stu[x].bun < stu[y].bun) {
					rank++;
				}
				stu[x].bun = rank;
		}
	}	
}
	
	void SchoolPrint(){
		for(int x= 0; x<cnt; x++) {
			System.out.print(stu[x].bun +"\t" + stu[x].name + "\t"+ stu[x].kor + "\t"+ stu[x].eng +"\t" + stu[x].mat + "\t");
			System.out.println(stu[x].sum +"\t" + stu[x].ave + "\t" + stu[x].suk);
			
			//������ ��ȣ�� �������� ��������
		}
	
	}
	
}
