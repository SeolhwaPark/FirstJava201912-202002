/*자료형이란 기억공간의 크기 - 기본자료형;실제자료저장(직접) 
 * 						참조형;동일한 이름의 동일한 값만 저장해야함.
 * 						 배열,클래스,인터페이스(간접)
 * 배열열처리
 *  동일한 이름을 가진 기억장소
 *  int[] a;, int a[]; 배열선언 
 *  배열변수 a = new int[10]; (new 새로 할당할 때)
 *  			10은 첨자(index) ==0~9(반드시 0부터 시작)
 *  			a는 첫번째 요소(주소) , a[0]자체는 변수에 값이 들어간 상태
 *  a.length 배열의 길이 또는 변수의 갯수
 *  
 *  클래스배열선언 String[] args; 문자열만 (사용자가 필요해서 임의로 만든 것)
 *  그냥 배열선언 char[] a; 문자만
 * 
 */

public class Exam_01 {
	public static void main(String[] args) {
		int[] score; //배열의 변수만을 선언
		score = new int[10]; //할당,메모리에 새로 공간만을 확보하고 자동으로 (0)초기화됨
		score[0]=10;
		score[1]=20;
		score[9]=100; // 컴파일타임 자동오류검사해줌 ,실행할 때 오류나면 런타임오류
		//컴파일에서 오류가 없어도 런타임 때 오류가 날 수 있는 부분은 잘 찾아서 고쳐야함
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score.length);
		
		//int a = 0; //변수에는 초기화가 필요함
		//System.out.println(a);

	}
}
