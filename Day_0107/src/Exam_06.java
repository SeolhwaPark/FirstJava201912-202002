/*
 * 
 */

public class Exam_06 {
	public static void main(String[] args) {
		int m[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		//int mm[] = new int[10];
		//mm[0] = 50000;
		
		
		int money = 375654;		
		for(int x=0; x<m.length;x++) {
			System.out.println(m[x] + " : " + money/m[x]);
			money %= m[x];//money = money % m[x]
		}
	}

}
