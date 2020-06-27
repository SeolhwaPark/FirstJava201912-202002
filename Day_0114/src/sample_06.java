/*
 * 1+3+5+7+9=25
 * 
 */
public class sample_06 {
	public static void main(String[] args) {
		int i = 1;
		int s = 0;
		do {
			System.out.print("+" + i);
			s+=i;
			i+=2;
				System.out.print(s);
		}while(i<10);
		System.out.println("= "+ s);
		
		
		
	}

}
