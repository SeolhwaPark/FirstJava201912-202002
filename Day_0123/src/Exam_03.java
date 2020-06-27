/*
 * Wrapper
 * 오토박싱...객체를 박스로 포장하고, 언박싱... 박스를 풀고
 */
public class Exam_03 {
	public static void main(String[] args) {
		int n = 100;
		Integer nn = new Integer(n);//객체화 가능, 주소가르킴
		
		System.out.println("nn =" + n);
		
		Integer nI = n; //자동으로 변수가 클래스로 객체화 가능 == 오토박싱
		
		Integer n2 = new Integer(100);//인테저타입 객체생성
		int n3 = n2; //값이 나옴 //객체  오토언박싱
		
		
	}//ㅗ

}
