
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 정규 표현식 - 특정한 문자열을 검색하는 것(일종의 유효성 검사)
 * Pattern클래스 
 * 
 * \\d 숫자검사 할 때(점수나 가격이나...) , \\w 영문자와 숫자 둘다 ok일 때(이름이나 배열을 검사) 
 * \\d? 숫자로 한글자, \\d* 숫자만 한글자 이상
 * \\w? , \\w* 가능
 * \\d{3} 숫자 0부터 세글자까지만 , \\d{1,3} 숫자 1글자 이상 
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		String[] var = scn.nextLine().split(",");
		
		for(int x= 0; x<var.length; x++) { //string배열의 길이만큼..
			boolean bool = Pattern.matches("\\d*", var[x]);
			//한글자 이상의 숫자가 포함되어 있으면 true, 영문이 들어있으면 false
			if(bool) {
				System.out.println(var[x] + "= 숫자");
			}else {
				System.out.println(var[x] + "= 오류");
				
			}
		}
		
	}

}