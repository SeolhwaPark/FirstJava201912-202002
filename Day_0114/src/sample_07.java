//1~10 È¦¼öÀÇ ÇÕ : 25
public class sample_07 {
	public static void main(String[] args) {
		int i = 0;
		int s = 0;
		int t = 0;
		boolean sw = true;
		do {
			i++;
			if(sw) {
				s += i;
				sw = false;
			}else {
				//t+=i;
				sw = true;
			}
		}while(i<10);
		System.out.println("1~10 È¦¼öÀÇ ÇÕ :" + s);
		
	}

}
