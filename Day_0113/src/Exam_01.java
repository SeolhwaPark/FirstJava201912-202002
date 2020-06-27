/*p.203
 * 객체지향언어 - 객체 는 사물,물체, 물건 개념 사상 모두....
 * oop 객체지향 프로그래밍 object oriented programming
 * 사용성 확장성 유지보수
 
 * 
 * 1.객체모델링 - 기능(메소드),속성(변수) - >특징(개성)과 기능을 고안
 * 2.class생성 (설계) - 
 * 3.객체의 생성 및 사용
 * 
 * 		object 겍체
 * 
 * 		class 객체를 만들기 위한 설계도
 * 
 * 		method 함수(심부름꾼)
 
학생 클래스의 정의
 	기능 - 총점계산, 평군계산 , 출력
	속성 - 이름, 번호 국어 영어 수학 총점 평균 석차
 */

class Student{ //복합형적으로 저장가능 자료형, 먼져 클래스명을 위한 정의 자료형, 객체 설계도
	//속성
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	void  totAccount() { // 총점
		tot = kor + eng + mat;
		//(접근제어자 리턴타입 메소드 매개변수)
	}
	void aveAccount() { //평균
		ave = tot/3.;
	}
	void dataPrint() {
		System.out.println("성적표");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(hakbun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\n");
	
	}
	
}
public class Exam_01 {
	public static void main(String[] args) { //main 설계도를 가지고 만들게 하는, 객체생성...
		Student stu; //레퍼런스 ==참조형 변수 (인스턴스 == 객체를 가리킴) 객체를 저장할 변수
		stu = new Student();// 인스턴스 생성 //
		Student s = new Student() ;
		stu.hakbun = 1101;
		stu.name = "홍길동" ;
		stu.kor = 90;
		stu.eng = 80;
		stu.mat = 88;
		
		stu.dataPrint();
		s.dataPrint();
	}

}
