
public class sam_31{
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <= i; j++) {
				k++;
				a[i][j] = k;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a.length; j++) {
				if (a[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[i][j] + "\t");
				}
			}
		System.out.println();
		}
	}

}