/*(1)
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 * (2)
 * A
 * A B 
 * A B C
 * A B C D
 * A B C D E
 * ....
 * A B C D E F G H I J K L M N O P Q R S T W V X Y Z
 * 
 * (3)
 *              1
 *            2 3
 *          4 5 6 
 *       7 8 9 10
 * 11 12 13 14 15
 * 
 * (4)
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 
 * (5)
 * *****	
 *  ****
 *   ***
 *    **
 * 	   *
 * 	  **
 * 	 ***
 * 	****
 * *****
 * 
 * 
 * 
 */
public class Exam_11 {
	public static void main(String[] args) {
		//	(1)
		int p = 1;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				if(p<=9) {
					System.out.print(p+"  ");
				}else {
					System.out.print(p+" ");
				}
				p++;
			}
			System.out.print("\n");
		}
		
		//	(2)
		System.out.println("-------------------------------------------------");
		char asc; //아스키
		for(int x=1; x<=26; x++) {
			int uni = 65; // 아스키코드 65번(A) 정수부터 시작 초기화
			for(int y=1; y<=x; y++) {
				asc = (char) uni; //형변환
				System.out.print(asc);
				uni++;
			}
			System.out.print("\n");
		}
		
		//	(3)
		System.out.println("-------------------------------------------------");
		int r = 0;
		for(int x=1; x<=5; x++) {
			 for(int y=1; y<=5-x; y++) {
				 if(r<10) { // 한자릿수 공백만들기
					 System.out.print("   ");
				 }else {
					 System.out.print(" ");
				 }
			 }
			 for(int y=1; y<=x; y++){
				 r++;
				 if(r>10) { // 두자릿수 공백만들기
					 System.out.print(r+" ");
				 }else {
					 System.out.print(r+"  ");
				 }
			 }
			 System.out.print("\n");
		}
	
		//	(4)
		System.out.println("-------------------------------------------------");
			for(int x=1; x<=5; x++) { //행
				 for(int y= 1; y<=x-1; y++) {//공백	 
					 System.out.print(" ");
				 }
				 for(int k=1; k<=11-(2*x); k++){ //9부터 2씩 감소
					 System.out.print("*");//은별
				 }
				 System.out.print("\n");
			}
		
		//	(5)
		System.out.println("-------------------------------------------------");
		
		for(int x=1; x<=5; x++) {
			 for(int y= 1; y<=x-1; y++) {	 
				 System.out.print(" ");
			 }
			 for(int y=1; y<=6-x; y++){
				 System.out.print("*");
			 }
			 System.out.print("\n");
		}
		for(int x=2; x<=5; x++) {
			 for(int y=1; y<=5-x; y++) {
				 System.out.print(" ");
			 }
			 for(int y=1; y<=x; y++){
				 System.out.print("*");
			 }
			 System.out.print("\n");
		}
	}

}
