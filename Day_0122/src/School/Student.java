package School;

public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	int rank;
	
	Student(){}
	
	Student(int b,String n , int k, int e, int m){
		bun = b;
		name = n;
		kor = k;
		eng =e;
		mat = m;
		tot = k+e+m;
		ave = ((int)(tot/3.*100))/100.;
	}
	
	@Override
	public String toString() {
		return bun + "\t" + name + "\t" + kor+ "\t" +eng+ "\t" +mat+ "\t" +tot+ "\t" +ave+ "\t" +rank ;
	}
}
