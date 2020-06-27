
public class sam_34{
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int i = 0;
		int j = 0;
		int k = 0; 
		int l = 1;
		int m = a.length;
		int n = 1;
		
		for(i = 0; i < m; i++) {
			for(j = l; j < m; j++) {
				k++;
				a[i][j] = k;
			}
			for(j = l; j < m; j++) {
				k++;
				a[i][j] = k;
			}
			int p = l;
			l = m;
			m = p ;
			n = n*(-1);	
		}
		/*
		 * 잘 안됩니다...
		 */
		for (i = 0; i < m; i++) {
			for (j = 0; j <m; j++) {
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