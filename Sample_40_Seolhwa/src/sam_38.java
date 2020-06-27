
public class sam_38{
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int k = 0;
		
		for(int i = 0; i < 5 ; i++) {
			a[i][5] = 0;
			a[5][i] = 0;
		}
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 4; j++) {
				k++;
				a[i][j] = k;
				a[5][j] += k;
				a[5][5] += k;
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
