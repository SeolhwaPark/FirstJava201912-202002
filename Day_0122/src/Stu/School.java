package Stu;
/* 출력예씨
* 번호 이름 국어 영어 수학 총점 평균 석차
*/
public class School {
	
	Student[] stu;
	int cnt;
	
	School(){}
	School(Student[] st, int cnt){
		stu = st;
		this.cnt = cnt;
	}
	//출력테스트
	
	void testPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x = 0; x<cnt; x++) {
			System.out.print(stu[x].bun + "\t" + stu[x].name + "\t" + stu[x].kor+ "\t" );
			System.out.print(stu[x].eng + "\t" + stu[x].mat +"\n"  );

		}
		System.out.println("--------------------------------------------------");
	}
	
	void cal() { //계산
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
			
			//석차는 번호를 기준으로 오름차순
		}
	
	}
	
}
