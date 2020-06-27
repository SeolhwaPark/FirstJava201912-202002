
public class sam_20 {
	public static void main(String[] args) {
		
		for(int x = 1; x<=5; x++) { //줄
			for(int y = 1; y<=x; y++) { //공백
				System.out.print(" ");
			}
			for(int z = 1; z <= 6-x; z++) { //별 나오는 칸
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
