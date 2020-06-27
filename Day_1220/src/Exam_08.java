/*
 * 4
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 */
public class Exam_08 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			 for(int j = 1; j <= 5-i; j++) {	 //줄의 띄어쓰기 4 3 2 1
				 System.out.print(" ");
			 }
			 for(int j = 1; j <= i; j++){
				 System.out.print("*");
			 }
			 System.out.print("\n");
		}
	}

}
