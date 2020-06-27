/*표준 입출력
 * System.out -> 출력
 * System.in  -> 입력
 */
public class Exam_02 {
	public static void main(String[] args) {
		int a = 88;;
		System.out.print("Hallo ");
		System.out.print("World " + a); //+ 결합
		System.out.print("\n"); //이스케이프문자 (줄 바꿈) new line
		
		System.out.println("Hello : " + a); //(줄 바꿈) new line
		System.out.println("World : " + (a+100));
	}

}
