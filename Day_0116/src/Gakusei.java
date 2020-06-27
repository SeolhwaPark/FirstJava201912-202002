/*
 * 키보드 입력 최대 10명 
 * 입력 : 번호 이름 국어 영어 수학 
 * . . . . . . . . . . . .
 * 
 * 출력 (석차를 기준으로 오름차순)
 * 번호 이름 국어 영어 수학 총점 평균
 */
public class Gakusei {
	int bunho;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	int rank;
	
	Gakusei() {}
	
	Gakusei(int bunho, String name, int kor , int eng , int mat){
		this.bunho = bunho;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor + eng + mat; 
		ave = (tot)/3.;
		rank = 1 ;
	}
	
	void dataPrint() {
		System.out.print(bunho + "\t" + name +"\t"+ kor +"\t" + eng + "\t" +mat + "\t");
		System.out.print(tot +"\t" + ave +"\t"+ rank + "\n");

	}
}
