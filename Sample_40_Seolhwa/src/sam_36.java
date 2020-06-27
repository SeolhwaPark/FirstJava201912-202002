
public class sam_36{
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		
		int k = 0, c = 1, i = 1, j = 0, f = 5;
		
		while(true) {
			for(int n = 0; n < f; n++) {
				k++;
				j+=c;
				a[i][j] = k;
			}
			f-=1;
			
			if(f>0) break;
			
			for(int n =0; n <f ; n++) {
				k++;
				i+=c;
				a[i][j] = k;
			}
			c*=(-1);
		
		}
		
		for (int  x= 0; x < a.length; x++) {
			for (int y = 0; y <a.length; y++) {
				if (a[x][y] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[x][y] + "\t");
				} 
			}
		System.out.println();
		}
		/*/
		 * 잘 안됩니다 ...
		 */
		

	}

}
