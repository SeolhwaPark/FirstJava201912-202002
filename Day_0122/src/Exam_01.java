/*
 * String클래스
 * 장점: "문자열"에 해당하는 상수를 가상머신 전체에 공유******************
 * 		문자열은 불변
 * 
 * 
 * jvm
 * 메소드영역 클래스를 읽어드리는 순간 저장/힙영역 객체 저장 /스택영역 맨 밑에서 부터 변수와 값을 저장
 * 
 
 * gc(); 최대한 빨리 메모리를 정리하게 부탁
 */

class AA{
	
}
public class Exam_01 {
	public static void main(String[] args) {
		String str1 = "1234"; // 클래스는 주소룰 가르킴, 스트링은 오버라이딩이 되어 있어서 값이 나옴
		String str2 = "1234"; // 클래스를 공유하기 때문에 스트링 끼리는 주소가 같음
		String str3 = new String("1234"); //new는 무조건 새로 객체를 생성
		String str4 = null; //== "" 초기화할 때 자주 씀
		String str5 = new String();
		//비교 (==) : 기본형 / equals()
		System.out.println("str1 == str2 :" + (str1 == str2));//주소가 같아서 true
		System.out.println("str1 == str3 :" + (str1 == str3));
		System.out.println("str2 == str3 :" + (str2 == str3));
		System.out.println("str1.equals(str3) :" + str1.equals(str3)); //동일한 객체인가
		
		//str += "0000"; 
		//AA a = new AA();
		//System.out.println("a =" + a); // 오버라이딩이 안되면 주소만 나옴
		//System.out.println("str =" + str);	
		//System.out.println("str4 =" + str4);	
		//System.out.println("str5 =" + str5);	
		
	}
}
