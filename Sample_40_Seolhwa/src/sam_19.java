
public class sam_19 {
	public static void main(String[] args) {
		
		for(int x = 5; x>=1; x--) {
			for(int y = 1; y<=6-x; y++) { 
				System.out.print(" ");
			}
			for(int z = 1; z <= x*2-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
