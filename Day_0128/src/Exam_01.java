import java.util.Scanner;

/*
 * 키보드로 영문단어를 입력
 * 영문자의 빈도수를 출력(대소문자 구분 없음)
 * 
 * 입력예시
 * 단어 : Apple
 * 단어 : Seoul
 * . . . . 
 * 
 * 단어 : end (또는 END) --> 종료
 * 
 * 출력예씨
 * A B C D . . . Z 배열 26
 * 0 2 1 0 . . . 1
 *  
 */
class AlphaTest1{
	String alpha;
	
	AlphaTest1(){}
	
	AlphaTest1(String alpha){
		this.alpha = alpha;
	}
	
	void alphaPrint(){
		System.out.println();
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		//입력
		Scanner scn = new Scanner(System.in);
		AlphaTest1[] al = new AlphaTest1[10];
		int cnt =0;
		
		while(cnt<10) {
			System.out.println("단어 :");
			String alpha = scn.next();
			if(alpha.equalsIgnoreCase("end"))break;			
			al[cnt] = new AlphaTest1(alpha);
			cnt++;
		}
		//출력
		
		
		
	}
}
