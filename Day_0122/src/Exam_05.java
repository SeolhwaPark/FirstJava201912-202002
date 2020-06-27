/*
 * 문자열 분리
 * substring(시작 , 전까지)
 * substring(시작)
 */

public class Exam_05 {
	public static void main(String[] args) {
		String str = "Hello world Java";
		//전체 문자열 길이 계산
		int length = str.length(); //문자열의 길이
		//Hello만 추출
		String a = str.substring(0,5);
		//Java 문자만
		String b = str.substring(12);
		System.out.println(a+" "+b);
		
		for(int x = 0 ; x<str.length(); x++) {
			char ch = str.charAt(x);//x의 위치에 있는 문자를 뽑아오는 기능
			System.out.println(ch);
		}
		
	}

}
