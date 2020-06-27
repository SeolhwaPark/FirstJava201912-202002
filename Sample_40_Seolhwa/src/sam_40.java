import java.util.Scanner;

public class sam_40{
	public static void main(String[] args) {
		int a[] = new int[10];
		int i = -1;
		int n = 18;
		
		while(true) {
			if(n == 0) {
				for(int l = i; l >= 0; l--) {
					System.out.print(a[l]);
					}
				break;
			}
				int m = (int)(n/2);
				int g = n -(m*2);
				i++;
				a[i] = g;
				n = m ;	
		}
	}
}
