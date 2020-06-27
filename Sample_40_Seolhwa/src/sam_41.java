
public class sam_41{
	public static void main(String[] args) {
		int a[] = {1,3,4,6,8,9,11,13,25,37};
		int b[] = {2,5,7,10,12,14,16,18,22,33,35,44,46,47,48};
		int c[] = new int[25];
		int i = 0, j = 0, k = 0;
		/*/
		 * 잘 안되요...
		 */
		while(true) {
		if(i < 10 && j < 15) {
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i += 1;
			}else {
				c[k] = b[j];
				j += 1;
			}
			k += 1;
			
		}else {
			if(i >= 10) {
				
				while(j < 15) {
					c[k] = b[j];
					k += 1;
					i += 1;
				}
				break;
			}
			else {
				while(i < 10) {
					c[k] = k+1;
					k += 1;
					i += 1;
				}
			}
		}
	}
		for (int z = 0; z < c.length; z++) {
			System.out.print("\t" + c[z]);
		}

	}

}
