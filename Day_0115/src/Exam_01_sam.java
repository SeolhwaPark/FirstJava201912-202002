import java.util.Scanner;

/*키보드로 번호,이름,국어,영어,수학 입력
 * 다음과 같이 출력하는 클래스 생성
 * 
 * 입력예시
 * 입력 : 1 aaaa 90 70 80 
 * 
 * 출력예시
 * 번호:xx
 * 이름:xx
 * 총점:xx
 * 평균:xx
 */

class Student1 {
	//속성
	int bun, kor ,eng ,mat, tot;
	String name;
	double ave;
	
	//기능
	Student1(){ //기본생성
	}
	Student1(int bun,String na, int k, int e, int m){ // 속성에서 꺼내오는 생성자
		this.bun = bun;
		name = na;
		kor = k;
		eng = e;
		mat = m;
		aaa();
	}
	void aaa() {
		tot = kor+eng+mat;
		ave = (int)((kor+eng+mat)/3.*100+0.5)/100.;
	}
	void print() { //출력		
		//aaa();
		System.out.println("번호 :" + bun);
		System.out.println("이름 :" + name);
		System.out.println("총점 :" + (kor+eng+mat));
		System.out.println("평균 :" + (int)((kor+eng+mat)/3.*100+0.5)/100.);
	}
	
}

public class Exam_01_sam {
	public static void main(String[] args) {
		//입력
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 :");
		int b = scn.nextInt();
		String na = scn.next();
		int k = scn.nextInt();
		int e = scn.nextInt();
		int m = scn.nextInt();
		
		//생성자에 있는 출력을 불러오기
		Student1 st = new Student1(b,na,k,e,m);
		st.print();
	}
}
