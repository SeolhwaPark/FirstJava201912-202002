class Hak{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	
}
public class Exam_04_class {
	public static void main(String[] args) {
		Hak[] h1 = new Hak[4]; //클래스배열
		h1[0] = new Hak();
		h1[1] = new Hak();
		h1[2] = new Hak();
		h1[3] = new Hak();
		
		h1[0].bun = 1;
		h1[0].name = "AAAA";
		h1[0].kor = 81;
		h1[0].eng = 19;
		h1[0].mat = 75;
		
		h1[1].bun = 2;
		h1[1].name = "BBBB";
		h1[1].kor = 99;
		h1[1].eng = 99;
		h1[1].mat = 99;
		
		h1[2].bun = 3;
		h1[2].name = "CCCC";
		h1[2].kor = 87;
		h1[2].eng = 80;
		h1[2].mat = 76;
		
		h1[3].bun = 4;
		h1[3].name = "DDDD";
		h1[3].kor = 60;
		h1[3].eng = 54;
		h1[3].mat = 46;
		
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int x = 0; x < h1.length; x++) {
			System.out.print(h1[x].bun + "\t");
			System.out.print(h1[x].name + "\t");
			System.out.print(h1[x].kor + "\t");
			System.out.print(h1[x].eng + "\t");
			System.out.print(h1[x].mat + "\n");
		
		}
	}

}
