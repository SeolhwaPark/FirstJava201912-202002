import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 파일(input.txt)로 학생정보를 입력받아서
 * 총점 평균을 구하여 출력
 * 
 */
class Hak2 {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;

	Hak2() {}

	Hak2(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		ave = (int)(tot / 3.*100+0.5)/100.;
	}
	
	public String toString() {
		StringBuffer data = new StringBuffer();
		data.append(bun + "\t");
		data.append(name + "\t");
		data.append(kor + "\t");
		data.append(eng + "\t");
		data.append(mat + "\t");
		data.append(tot + "\t");
		data.append(ave + "\t");
		return data.toString();
	}
}

public class Exam_06 {
	public static void main(String[] args) throws Exception{
		Scanner scf = new Scanner(new File("c:\\data\\test1.txt"));
		Hak2 hak = null;
		StringTokenizer st = null;
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		while(scf.hasNext()) {
			//String[] str = scf.nextLine().split(",");
			 st = new StringTokenizer(scf.nextLine()," ,");
			 
			 int bun = Integer.parseInt(st.nextToken());
			 String name = st.nextToken();
			 int kor = Integer.parseInt(st.nextToken());
			 int eng = Integer.parseInt(st.nextToken());
			 int mat = Integer.parseInt(st.nextToken());
			
			 hak = new Hak2(bun, name, kor, eng, mat);
			 System.out.println(hak);
		}
	}

}
