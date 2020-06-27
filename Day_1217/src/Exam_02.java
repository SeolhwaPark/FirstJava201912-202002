/* 자료형(Data Type 기억장소 크기)
 *    기본자료형:문자char,정수byte;int(많이씀);long,실수float;double(많이씀),논리boolean
 *    참조자료형(주소,위치):배열,클래스,인터페이스11
 *    ex:int Seoul, Char a, a='A'.... 
 *    첫글자가 대문자면 클래스다요
 *    
 *    변수를 선언할 때 자료형을 써야함
 *    
 */  
public class Exam_02 {
	public static void main(String[] args) {
		char ch; //2자(byte)
		int jung; //4자
		double dou; //8자
		boolean bool; //1자
		
		ch='S'; //대입연산자 1문자대입
		jung=345678; //정수대입
		dou = 3.141592; //실수대입
		bool=true; //true(참) 대입
				
		System.out.println("char ch=" + ch);
		System.out.println("int jung=" + jung);
		System.out.println("double dou=" + dou);
		System.out.println("boolean bool=" + bool);
	}

}
