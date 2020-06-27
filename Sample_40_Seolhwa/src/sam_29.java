
public class sam_29 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				k++;
				a[i][j] = k;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + "\t");
			}
		System.out.println();
		}
	}

}
