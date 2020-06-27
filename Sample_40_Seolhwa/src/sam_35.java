
public class sam_35{
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		
		int k = 0;
		int l = 1;
		int m = a.length;
		int n = 1;
		
		for(int i = 0; i < 5; i++ ) {
			if(i%2 == 1) {
				for(int j = 0; j < m; j++) {
					k++;
					a[i][j]=k;
				}
			}else {
				for(int j = m; j<=0 ; j--) {
					k++;
					a[i][j]=k;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a.length; j++) {
				if (a[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(a[i][j] + "\t");
				} //결과가 안나오네요..
			}
		System.out.println();
		}
		
	}
	
}
