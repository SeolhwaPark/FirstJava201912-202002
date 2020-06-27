import java.io.File;
import java.util.Scanner;

/*
 * 파일(input.txt)로 학생정보를 입력받아서
 * 총점 평균을 구하여 출력
 * 
 */
class Hak {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;

	Hak() {}

	Hak(int bun, String name, int kor, int eng, int mat) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		ave = tot / 3.;
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

public class Exam_04 {
	public static void main(String[] args) throws Exception{
		Scanner scf = new Scanner(new File("c:\\data\\test1.txt"));
		Hak hak = null;
		while(scf.hasNext()) {
			String[] str = scf.nextLine().split(",");
			hak = new Hak(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4]));
			System.out.println(hak);
		}
	}

}
