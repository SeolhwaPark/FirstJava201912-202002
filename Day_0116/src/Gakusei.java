/*
 * Ű���� �Է� �ִ� 10�� 
 * �Է� : ��ȣ �̸� ���� ���� ���� 
 * . . . . . . . . . . . .
 * 
 * ��� (������ �������� ��������)
 * ��ȣ �̸� ���� ���� ���� ���� ���
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
