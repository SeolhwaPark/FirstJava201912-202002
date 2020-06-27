
public class sam_17 {
	public static void main(String[] args) {
		
		for(int x = 1; x<=5; x++) { //줄
			for(int y = 1; y<=6-x; y++) { //공백
				System.out.print(" ");
			}
			for(int z = 1; z <= x; z++) { //별 나오는 칸
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
