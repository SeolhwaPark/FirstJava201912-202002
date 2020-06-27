

public class Exam_10 {
	public static void main(String[] args) {
		for(int x=0; x<5; x++) {
			for(int y=1; y<=5-x; y++) {
				System.out.print("*");
			}
				System.out.print("\n");
				
		}	
		
		System.out.println("------------------------");
		for(int x=1; x<=5; x++) {
			for(int k=0; k<5-x; k++){
				
			}
			for(int y=0; y< x; y++) {
				System.out.print("*");
			}
				System.out.print("\n");
			
		}
	}
}



