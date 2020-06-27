import javax.print.DocFlavor.STRING;

/*
 *String 클래스 메소드
 *
 * valueOf(); 지정된 값을 문자열로 변환
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a = 100;
		String aa = a + ""; // == "100"
		String ab = String.valueOf(a);
		String ac = String.valueOf(true); //=="true"
		
		//래퍼클래스(Wrapper) 기본자료형이 클래스화 되어있일 때
		//int -> Integer, byte -> Byte
		//char e-> Character
		
		int b = Integer.parseInt(ab); //문자를 정수로 바꿈
		
		//int bb = Integer.parseInt("123"); //문자를 정수로 바꿈, 영어는 넣으면 오류
		
		int bbb = Integer.valueOf(ab);//지정된 값을 문자열로 변환
		
		int var = 100;
		double dou = 3.141582;
		//정수 var = 100 실수 dou = 3.14 
		System.out.println("정수 var =" + var + " 실수 dou =" + dou);
		String ss = String.format("정수 var = %5d 실수 dou =%5.2f" , var, dou);//format 형식 만들기
		System.out.println(ss);
		String sss = String.format("정수 var = %10d 실수 dou =%10.3f" , var, dou);//format 형식 만들기
		System.out.println(sss);
		
	}

}
