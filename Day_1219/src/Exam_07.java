/*
 * 입력된 정수의 값이 70~90 합격
 * if(조건식){
 * 		if(조건식){
 * 			문장1;
 *  	}
 *  }
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int a=77;
/*		if(a>=70) {
			if(a<=90) {
				System.out.println("합격");
			}
		}
*/
		
/*		if(a>=70) {
			if(a<=90) {
			System.out.println("합격");
			}else {
			System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
			}
*/
		if(a>=70 && a<=90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			}
	}

 }

