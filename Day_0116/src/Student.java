
public class Student {
	//��ȣ �̸� ���� ���� ���� �Է��� �ο��� ���� ��� ���� 
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
		rank = 1; //����  �ڱ��ڽ��� 1��
	}

	void studentPrint() {
		System.out.print(number + "\t"+ name + "\t"+ kor + "\t"+ eng + "\t"+ mat);
		System.out.print(tot + "\t"+ ave + "\t"+ rank + "\n");
	}
}
