
public class sam_39{
	public static void main(String[] args) {
		int a[][]= {{89,68,55,87,1},{12,45,66,15,5},{74,76,86,96,2},
				{53,69,79,81,4},{100,80,90,97,3}};
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1 ; j < a.length; j++) {
				if(a[i][4]>a[j][4]) {
					for(int k = 0; k < a[i].length; k++) {
						int t = a[i][k];
						a[i][k] = a[j][k];
						a[j][k] = t;
					}
				}
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
