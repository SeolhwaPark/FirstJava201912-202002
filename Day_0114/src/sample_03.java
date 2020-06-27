
public class sample_03 {
	public static void main(String[] args) {
		int i = 0;
		int s = 0;
		boolean sw = true;
		do {
			i++;
			s+=i;
			if(sw) {
				sw = false;
				System.out.print(i);
			}else {
				System.out.print("+" + i);
			}
		}while(i<10);
		System.out.println(" = "+ s);		
	}

}
