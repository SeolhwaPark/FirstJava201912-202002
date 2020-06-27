/*
 * 논리연산자(&&, ||) ->비트보다 계산이 빠름
 * 비트논리연산자(&, |)
 * 
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		System.out.println("7>8 && 7<9 ="+ (7>8 && 7<9));
		System.out.println("7>8 & 7<9 ="+ (7>8 & 7<9));
		
		//System.out.println("7&&8 ="+ (7&&8));
		System.out.println("7&8 ="+ (7&8));
		

	}

}
