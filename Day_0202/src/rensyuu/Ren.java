package rensyuu;

public class Ren {
	public static void main(String[] args) {
		for(int x=0; x<5; x++) {
			for(int y=0; y< x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int x=0; x<5; x++) {
			for(int y=1; y<=5-x; y++) {
				System.out.print("*");
			}
				System.out.println();	
		}	
		
		System.out.println("----------------------------------------");
		for(int x=0; x<5; x++) {
			for(int y=1; y<=5-x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}	
		for(int x=0; x<4; x++) {
			for(int y=0; y<x+2; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(int x=1; x<=5; x++) {
			for(int k=0; k<5-x; k++){
				System.out.print(" ");
			}
			for(int y=0; y< x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int x=0; x<4; x++) {
			for(int k=0; k<x+1; k++){
				System.out.print(" ");
			}
			for(int y=0; y<4-x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		for(int x=0; x<4; x++) {
			for(int k=0; k<x; k++){
				System.out.print(" ");
			}
			for(int y=0; y<5-x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int x=1; x<=5; x++) {
			for(int k=0; k<5-x; k++){
				System.out.print(" ");
			}
			for(int y=0; y< x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		System.out.println("-----------------------------------------");
		
		for(int x=0; x<5; x++) {
			for(int k=x; k<5; k++){
				System.out.print(" ");
			}
			for(int y=0; y<(2*x-1); y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int x=0; x<5; x++) {
			for(int k=0; k<x; k++){
				System.out.print(" ");
			}
			for(int y=x; y< 9-x; y++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		/*		 
*********  공백 0 별9
**** **** 별4 공백1 별4
***   *** 별3 공백3 별3
**     ** 별2 공백5 별2
*       * 별1 공백7 별1

**     ** 별2 공백5 별2
***   *** 별3 공백3 별 3
**** **** 별4 공백1 별4
********* 공백 0 별9
		 //공백 1 3 5 7

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
*/		
	
		for(int x =1; x<8; x++) {
			if(x==1) {
			System.out.println("*********");
			}
			
			if(x<5) {
				for(int z=x; z<5; z++) {
					System.out.print("*");
				}
				for(int c=(x*2)-1; c>0; c--) { //공백
					System.out.print(" ");	
				}
				for(int z=x; z<5; z++) {
					System.out.print("*");
				}	
				
			}else { //5 6 7 8 9 
				for(int z=x; z>3; z--) {
					System.out.print("*");
				}
				for(int c=x*2-1; c<14; c++) { //공백
					System.out.print(" ");	
				}
				for(int z=x; z>3; z--) {
					System.out.print("*");
				}	
			}
			System.out.println();
			if(x==7) {
				System.out.println("*********");
				}
			}
		System.out.println("____________________________");
		
	
	}
}
