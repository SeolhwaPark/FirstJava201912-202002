
public class sample_08 {
	public static void main(String[] args) {
		
				int i = 0;
				int s = 0;
				
				boolean sw = true;
				do {
					i++;
					if(i%2==1) {
						if(sw) {
						System.out.print("+" + i);
						s += i;
						}else {
							System.out.print(i);							
						}
					}
				}while(i<10);
				System.out.println(" È¦¼öÀÇ ÇÕ :" + s);
	}

}
