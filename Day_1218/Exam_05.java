import java.sql.Blob;

/*
 * 관계연산자(>,<,>=,<=) -> 관계연산자와 상등연산자가 같이 있으면 관계연산자를 먼저!
 * 상등연산자(==,!=), 대입연산자(=)
 * 논리연산자 결과는 True or False
 * 
 */
public class Exam_05 {
	public static void main(String[] args) {
		boolean b = 7>8;
		System.out.println("7>8="+(7>8));
		System.out.println("7>8="+b);
		int a=7+8;
		System.out.println("7+8="+(7+8));
		System.out.println("7+8="+a);

	}

}
