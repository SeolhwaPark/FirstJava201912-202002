
public class Student {
	//번호 이름 국어 영어 수학 입력할 인원수 총점 평균 석차 
	int number;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	int rank;
	Student(){}
	
	Student(int number,String name,int kor,int eng, int mat){
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor + eng + mat;
		ave = tot/3.;
		rank = 1; //석차  자기자신이 1등
	}

	void studentPrint() {
		System.out.print(number + "\t"+ name + "\t"+ kor + "\t"+ eng + "\t"+ mat);
		System.out.print(tot + "\t"+ ave + "\t"+ rank + "\n");
	}
}
