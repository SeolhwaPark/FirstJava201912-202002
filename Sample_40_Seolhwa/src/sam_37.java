
public class sam_37{
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int k = 0;
		
		for(int i = 0; i < 4 ; i++) {
			a[i][5] = 0;
			for(int j = 0; j < 4; j++) {
				k++;
				a[i][j] = k;
				a[i][5] += k;
			}
		}
		/*
		 * 에러가 납니다..
		 */
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
