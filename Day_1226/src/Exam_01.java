
public class Exam_01 {
	public static void main(String[] args) {
		int a; // 4바이트
		char ch; //2byte
		float fi; //4byte
		double di; //8byte
		
		a = 65; // a라는 변수의 공간에 65라는 정수가 들어가게 하긔
		ch = 'A';
		// ch = 65;
		String str = "가"; // 클래스를 이용
		fi = 3.14f; // float에 실수 쓰려면 숫자 마지막 뒤에 f붙여야함
		di = 3.14;
		
		System.out.print("a = " + a + "\n");
		System.out.print(a + "\n");
		System.out.println("ch = ");
		System.out.println("abcd\re\tfgh"); // \t 탭키,4칸띄우깅  \r 입력의 커서를 맨 앞으로
		System.out.println("c:\\");// \\ 그냥\만 나오게 하기
		System.out.print("\"Hello World\""); // \"는 걍 "를 나오게학깅
		
	}

}
