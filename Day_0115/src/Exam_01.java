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

class Student {
	//속성
	
	int b,k,e,m;
	String na;
	
	//기능
	Student(){ //기본생성
		
	}
	Student(int b,String na, int k, int e, int m){ // 속성에서 꺼내오기
		this.b = b;
		this.na = na;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	void print() { //출력		
		System.out.println("번호 :" + b);
		System.out.println("이름 :" + na);
		System.out.println("총점 :" + (k+e+m));
		System.out.println("평균 :" + (int)((k+e+m)/3.*100+0.5)/100.);
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b, k, e, m;
		String na;
		System.out.print("입력 :");
		b = scn.nextInt();
		na = scn.next();
		k = scn.nextInt();
		e = scn.nextInt();
		m = scn.nextInt();
		Student st = new Student(b,na,k,e,m);
		st.print();
	}
}
