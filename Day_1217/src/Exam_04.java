/*System.in.read() = 1 문자를 키보드로 입력 받아서 정수로 변환
 * 
 * 영문,숫자를 코드화
 */
public class Exam_04 {

	public static void main(String[] args) throws Exception {
		System.out.print("1문자를 입력하세요");
		int ch1 = System.in.read(); // 정수끼리
		int ch2 = System.in.read();
		int ch3 = System.in.read();
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("ch3="+ch3);//데이터의 암호화가 가능
		

	}

}
