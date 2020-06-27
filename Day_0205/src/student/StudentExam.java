package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		
		while(true) {
			System.out.print("입력:");
			int hak = sc.nextInt();
			
			int ban= sc.nextInt(); //반
			int bun; //번호
			String name; //이름
			int score; //점수
			
		}
		
		
	}
}

/*
 * 컬렉션을 이용해서 성적표 만들기....
 * 
 * 입력 학년:1 반:1 번호:1 이름:홍길동 점수:95
 * 
 * 입력조건 *학년 '0'면 종료 *유효성체크 학년-> 1~3만, 반 1~6만, 번호 1~45만, 점수 0~100만 학년의 숫자가 틀리면
 * 학년만 다시 받고, 반의 숫자가 틀리면 반만 다시받고... *점수 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * 
 * 출력 학번 이름 점수 학점(출력할 때만) 1-1-1 홍길동 95 A 학번의 중복체크도 가능하면..!
 * 
 * class 설계 학번 이름 점수 문자 문자 숫자 3자리 10자리 3자리
 * 
 */