
/* 문자열 처리("") 및 자료형입력
 * 문자열 처리 : String 클래스 
 * String은 클래스임 기본자료형이 아님,자료형과는 데이터의 저장위치가 틀리기 때문에 참조형 클래스임)
 * 
 * 		char ch = 'A';
		String str = "홍길동"; // 문자열 저장
		System.out.print("이름 :"+str);

 * 
 * 
 * 자료형 입력 : Scanner 클래스
 * Scanner scn = new Scanner(Systen.in)// ctrl+shift+o
 * 
 * //nextInt() 정수, nextDouble() 실수
 */
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);// ctrl+shift+o
		System.out.print("이름을 입력하세요");
		String name = scn.next();
		System.out.print("이름 :" +name);
		
	}

}
