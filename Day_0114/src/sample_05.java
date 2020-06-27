/*
 * 1+3+5+7+9=25
 * 
 */
public class sample_05 {
	public static void main(String[] args) {
		int i = -1;
		int s = 0;
		boolean sw = true;
		do {
			i+=2;
			s+=i;
			if(sw) {
				sw = false;
				System.out.print(i);
			}else {
				System.out.print("+" + i);
			}
		}while(i<9);
		System.out.println("= "+ s);
		
		
		
	}

}
