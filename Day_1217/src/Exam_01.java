import java.io.IOException;

/* 표준입출력(System.out/System.in)
 * print(),println()
 * System.in.read() -->1개의 문자 입력만 가능(오로지 하나의 글자)
 * ctrl+shift+o = import java.io.IOException; 저거 나옴ㅋ
 * 
 *  */
public class Exam_01 {// 실행클래스
	public static void main(String[] args) throws IOException {
		System.out.print("입력하세요");
		System.in.read();//"입력하세요" 뒤에 입력이 가능해짐
	}

}
