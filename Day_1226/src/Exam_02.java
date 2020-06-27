/*
 * 표준입력
 * System.in.read(); -> 문자 한개만 들어갈 수 있음!!!! -> 정수로 변환시킴
 * 예외처리 필수
 */
public class Exam_02 {
	public static void main(String[] args) throws Exception{ //throws Exception 예외처리
		System.out.print("1문자 입력하세요 : ");
		System.in.read();
		System.in.read();
		char ch = (char)System.in.read(); // 각 문자에 해당하는 ASCII Code(숫자)가 필요할 때도 있음
		// (char) 강제적 형변화 
		System.out.println("ch="+ch);

	}

}
