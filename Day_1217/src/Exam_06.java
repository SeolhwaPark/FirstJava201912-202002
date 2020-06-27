/* 문제) 키보드롤 1문자 입력
 *  입력된 문자를 이용해서 (*) 입력된 경우
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 */
public class Exam_06 {
	public static void main(String[] args) throws Exception{
		System.out.print("1문자 입력 :");
		char c = (char)System.in.read();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.println(c);
		System.out.print("\n");
	}
}
