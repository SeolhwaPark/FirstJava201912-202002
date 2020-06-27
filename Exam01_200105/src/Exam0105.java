/*(1)
 * 	1
 * 	2  3
 *	4  5  6
 *	7  8  9  10
 *	11 12 13 14 15
 *
 *(2)
 *	A
 *	AB
 *	ABC
 *	ABCD
 *	. . .
 *	A    ~    Z
 *
 *(3)
 *	1  2  3  4  5 
 *	6  7  8  9 
 *	10 11 12
 *	13 14
 *	15
 *
 *(4)
 *	*********
 *	 *******
 *	  *****
 *	   ***
 *	    *
 *
 *(5)
 *	*****
 *	 ****
 *	  ***
 *	   **
 *	    *
 *	   **
 *	  ***
 *	 ****
 *	*****
 */
public class Exam0105 {
	public static void main(String[] args) {
		System.out.println("(1)");
		
		int m = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				m++;
				if(m<10) {
					System.out.print(m+"  ");
				}else System.out.print(m+" ");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("\n");
		System.out.println("(2)");
		
		char asc2;
		
		for(int i=1; i<=26; i++) {
			int asc1 = 64;
			for(int j=1; j<=i; j++) {
				asc1++;
				asc2=(char)asc1;
				System.out.print(asc2);
				
			}
			System.out.println("\n");
			
		}
		
		
		System.out.println("\n");
		System.out.println("(3)");
		
		int m2 = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				if(m2<10) {
					System.out.print("   ");
				}else System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				m2++;
				if(m2<10) {
					System.out.print(m2+"  ");
				}else System.out.print(m2+" ");
			}
			System.out.println("\n");
		}
			
		
		System.out.println("\n");
		System.out.println("(4)");
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(" ");
			}
			for(int u=1;u<=i*2-1;u++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println("\n");
		
		System.out.println("(5)");
		
		for(int i=1; i<=5; i++) {
			for(int u=1;u<=i-1; u++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int n=1; n<=4; n++) {
			for(int g=1; g<=4-n; g++) {
				System.out.print(" ");
			}
			for(int s=0; s<=n; s++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
