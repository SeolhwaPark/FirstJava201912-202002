/*
 * 1-2+3-4+5-6+7-8+9-10= -5
 */
public class sample_10 {
	public static void main(String[] args) {
		int s = 0;
		boolean sw = true;
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				if(sw) {
					sw = false;	
					System.out.print(i);
				}else {
						System.out.print("+" + i);
					}
				s+=i;//Ȧ��

			}else {
				s-=i; //¦��
				System.out.print("-" + i);
			}
			
		}
		System.out.print(" = " + s);	
	}
}
