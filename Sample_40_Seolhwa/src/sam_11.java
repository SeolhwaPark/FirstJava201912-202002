
public class sam_11 {
	public static void main(String[] args) {
		int s = 0;
		int t = 0;
		for(int i = 1; i <=100; i++) {
			if(i/2. == (int)(i/2)) {
				t += i;
			}else {
				s += i;
			}
		}//for
		System.out.println("È¦¼ö :"+ s + ", Â¦¼ö : " + t);

	}

}
